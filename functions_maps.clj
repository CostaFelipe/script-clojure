;;maps

(map inc [1 2 3])

(map (fn [x] (+ x 1)) [1 2 3])

(map #(+ % 1) [1 2 3])


(map (fn [x y]
       (+ (Math/pow x 2)
          (Math/pow y 2))) [1 2 3] [2 3 4])

(defn sum-of-squares [x y]
  (+ (Math/pow x 2)
     (Math/pow y 2)))

(map sum-of-squares [1 2 3] [2 3 4])

(defn double-it [x]
  (* x 2))

(map double-it [1 2 3])

;;filter
(filter odd? (range 1 101))

(filter even? (range 1 11))

(filter #(> % 5) (range 1 11))

(filter (fn [x] (> x 5)) (range 1 15))

(defn greater-than-5 [x]
  (> x 5))

(filter greater-than-5 (range 1 11))

;;reduce
(reduce + '(1 2 3 4 5))

(reduce - [1 2 3 4 5 6])

(reduce * [1 2 3 4])

(defn add [a b]
  (+ a b))

(reduce add [1 2 3])

(defn multiply [a b]
  (* a b))

(reduce multiply [1 2 3 4])

;;apply

(apply + [10 20 30 40 50])

(apply + '(10 20 30 40 50 60))

(defn my-function [arg1 arg2]
  (println "Argument 1: " arg1)
  (println "Argument 1: " arg2))

(my-function "one" "two")

(apply my-function ["one" "two"])
