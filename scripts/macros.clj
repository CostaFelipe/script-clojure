(-> 5 (Math/pow 2))

;;equivalente a:
(Math/pow 5 2)

(-> 5 (Math/pow 2) inc)

(-> (Math/pow 5 2) inc)

(-> 10 inc (* 2) (+ 5))


(->> 5 (Math/pow 2))

(->> 5 (Math/pow 2) inc)

(as-> 5 x (Math/pow x 2))

(let [a 12]
  (cond-> []
        (odd? a) (conj (* a 2))
        (even? a) (conj (/ a 2))))

(let [a 10]
  (cond-> []
    (odd? a) (conj (* a 2 1))
    (even? a) (conj (/ a 2 1))))
