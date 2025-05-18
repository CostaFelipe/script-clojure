;;for

(let [nums [10 20 30]]
  (for [num nums]
    (* num 10)))

(def colors ["red" "blue" "green" "yellow"])

(def shapes ["squares" "circle" "triangle" "rectangle"])

(for [color colors shape shapes]
  (str color " " shape)
  )

;;do-seq
(let [nums [1 2 3 4 5]]
  (doseq [num nums]
    (println (* num 10))))

;;loop
(loop [x 1]
  (when (<= x 5)
    (println x)
    (recur (inc x))))

(loop [x 0]
  (when (<= x 10)
    (if (even? x)
      (println x)
      "Não é par"
      )
    (recur (inc x))))

;;doctimes
(dotimes [x 5]
  (println x))

(dotimes [_ 10]
  (println "Hello World!"))
