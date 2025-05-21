(defn operation [a b operator]
  (case operator
    :add (+ a b)
    :sub (- a b)
    :mult (* a b)
    :div (/ a b)))

(operation 3 3 :sub)
(operation 3 3 :add)
(operation 6 3 :mult)
(operation 9 3 :div)
