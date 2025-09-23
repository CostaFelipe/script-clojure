(ns todo-app-um.core)

(defrecord Todo [id description completed])

(defonce id-counter (atom 0))

(defonce todos (atom []))

(defn generate-id []
  (swap! id-counter inc))

(defn todo [description]
  (->Todo (generate-id)
          description
          false))

(defn add-todo [description]
  (let [new-todo (todo description)]
    (swap! todos conj new-todo)
    new-todo))

(defn get-todos []
  @todos)

(defn complete-todo [id]
  (swap! todos (fn [itens]
                 (map (fn [item]
                        (if (= (:id item) id)
                          (assoc item :completed true)
                          item))
                      itens)))
  (first (filter #(= (:id %) id)  @todos)))

(defn delete-todo [id]
  (let [todo (first (filter #(= (:id %) id) @todos))]
    (swap! todos (fn [itens]
                   (vec (remove #(= (:id %) id) itens))))
    todo))
