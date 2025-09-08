(ns todo-app-um.core)

(defonce todos (atom []))

(defn add-todo [description]
  (let [id (if (empty? @todos) 1 (inc (:id (last @todos))))
        new-todo {:id id
                  :description description
                  :completed false}]
    (swap! todos conj new-todo)
    new-todo))

(defn get-todos []
  nil)

(defn delete-todo []
  nil)

  (defn soma [x y]
    (+ x y))

(defn foo
  "I don't do a whole lot."
  [x]
  (println x "Hello, World!"))
