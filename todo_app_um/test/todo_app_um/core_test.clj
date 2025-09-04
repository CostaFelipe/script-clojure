(ns todo-app-um.core-test
  (:require [clojure.test :refer :all]
            [todo-app-um.core :refer :all]))

(deftest add-test-todo
      (testing "Adicionar uma nova tarefa"
             (is (= nil (add-todo)))))

(deftest get-todos-test
  (testing "Obter todas as tarefas"
    (is (= nil (get-todos)))))

(deftest remove-todo-test
  (testing "Deletar uma tarefa"
    (is (= nil (delete-todo)))))
