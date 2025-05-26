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
