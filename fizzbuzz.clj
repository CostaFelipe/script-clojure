(defn fizz? [numero]
  (= 0 (mod numero 3)))

(defn buzz? [numero]
  (= 0 (mod numero 5)))

(defn fizzbuzz [numero]
  (cond (and (fizz? numero) (buzz? numero)) "FizzBuzz"
        (fizz? numero) "Fizz"
        (buzz? numero) "Buzz"
        :else numero
        ))

(fizzbuzz 1)
