(require '[clojure.test :refer [deftest is testing]]  )

(load-file "/home/wedo/Development/clojure-projetos/mini-clojure/calculator.clj")

(deftest calculator_test
  (testing "calculator"
    (testing "add"
      (is (= 4 (operation 2 2 :add)))
      (is (= "Não não pode colocar string" (operation "2" 2 :add))))
    (testing "sub"
      (is (= 2 (operation 4 2 :sub))))
    (testing "mult"
      (is (= 100 (operation 10 10 :mult))))
    (testing "div"
      (is (= 5 (operation 10 2 :div))))
    (testing "not exist"
      (is (= :not_exist (operation 2 2 :sos))))))

(calculator_test)
