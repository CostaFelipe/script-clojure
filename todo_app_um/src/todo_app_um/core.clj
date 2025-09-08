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
  nil)

(defn delete-todo []
  nil)

  (defn soma [x y]
    (+ x y))

(defn foo
  "I don't do a whole lot."
  [x]
  (println x "Hello, World!"))
