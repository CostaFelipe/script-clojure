;; calc_lib_test.clj

(require '[clojure.test :refer [deftest is testing]])

(load-file "calc_lib.clj")

(deftest calc_lib_test
  (testing "calc_lib"
    (testing "add"
      (is (= 4 (add 2 2)))
      (is (= 101 (add 100 1))))
    (testing "sub"
      (is (= 0 (sub 1 1)))
      (is (= -99 (sub 2 101))))))

(calc_lib_test)
