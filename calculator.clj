(defn convert [c]
  (if (string? c)
    (read-string c)
    (int c)))

(defn operation [a b operator]
  (case operator
    :add (+ (convert a) (convert b))
    :sub (- a b)
    :mult (* a b)
    :div (/ a b)))

(operation 3 3 :add)
(operation "100" "1" :add)
(operation 6 3 :mult)
(operation 9 3 :div)
