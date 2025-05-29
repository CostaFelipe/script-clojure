(+ 2 3)

(type '(+ 2 3))

(def a-list '(2 + 3))

(first a-list)
(last a-list)
(second a-list)


(list
 (second a-list)
 (first a-list)
 (last a-list))

(defmacro calculate [a-list]
  (list
   (second a-list)
   (first a-list)
   (last a-list)))

(println (calculate (2 + 3)))

(println (macroexpand '(calculate (2 + 3))))
