(ns todo-app-um.core)

(defonce todos (atom []))

(defn todo [description]
  {:id (if (empty? @todos) 1 (inc (:id (last @todos))))
   :description description
   :completed false})

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
