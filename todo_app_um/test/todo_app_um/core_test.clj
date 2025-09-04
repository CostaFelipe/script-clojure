(ns todo-app-um.core-test
  (:require [clojure.test :refer :all]
            [todo-app-um.core :refer :all]))

(deftest add-test-todo
      (testing "Adicionar uma nova tarefa"
             (assert (= nil (add-todo)))))

(deftest get-todos-test
  (testing "Obter todas as tarefas"
    (assert (= nil (get-todos)))))

(deftest remove-todo-test
  (testing "Deletar uma tarefa"
    (assert (= nil (delete-todo)))))

(deftest soma-teste
  (testing "Testando a função soma"
         (assert (= (soma 2 2) 4))))
