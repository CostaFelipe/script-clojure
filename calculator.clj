(defn valid-number? [a b]
  (and (number? a) (number? b)))

(defn apply-operator [a b operator]
  (case operator
    :add (+ a b)
    :sub (- a b)
    :mult (* a b)
    :div (/ a b)
    :not_exist)
  )

(defn operation [a b operator]
  (if (valid-number? a b)
    (apply-operator a b operator)
    "Não não pode colocar string"))

(operation "101" 1 :sub)
(operation 3 3 :add)
(operation "100" "1" :add)
(operation 6 3 :mult)
(operation 9 3 :div)
(operation 2 2 :sos)
