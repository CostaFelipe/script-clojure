(defn convert [c]
  (if (string? c)
    (read-string c)
    (int c)))

(defn operation [a b operator]
  (case operator
    :add (+ (convert a) (convert b))
    :sub (- (convert a) (convert b))
    :mult (* (convert a) (convert b))
    :div (/ (convert a) (convert b))))

(operation 101 1 :sub)
(operation 3 3 :add)
(operation "100" "1" :add)
(operation 6 3 :mult)
(operation 9 3 :div)
