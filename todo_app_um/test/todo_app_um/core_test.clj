(ns todo-app-um.core-test
  (:require [clojure.test :refer :all]
            [todo-app-um.core :refer :all]))

(deftest add-test-todo
      (testing "Adicionar uma nova tarefa"
             (let [todo (add-todo "Comprar leite")]
               (is (= (:description todo) "Comprar leite"))
               (is (= (:id todo) 1))
               (is (= (false? (:completed todo)))))))

(deftest get-todos-test
  (testing "Obter todas as tarefas"
    (add-todo "Tarefa 1")
    (add-todo "Tarefa 2")
    (let [todos (get-todos)]
      (is (= (count todos) 2))
      (is (= (:description (first todos)) "Tarefa 1"))
      (is (= (:description (second todos)) "Tarefa 2")))))

(deftest remove-todo-test
  (testing "Deletar uma tarefa"
    (assert (= nil (delete-todo)))))

;;(deftest teste-estrutura-mapa
;;  (let [mapa {:usuario {:nome "João", :idade 30}
;;              :ativo true}]
;;    (is (= "João" (:nome (:usuario mapa))))  ; Verifica o nome do usuário
;;    (is (= 30 (:idade (:usuario mapa))))      ; Verifica a idade do usuário
;;    (is (:ativo mapa))))

(deftest soma-teste
  (testing "Testando a função soma"
         (assert (= (soma 2 2) 4))))
