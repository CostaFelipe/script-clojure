(defn conversor-de-temperatura [temperatura cod]
  (case cod
    :cf (+ (* temperatura (/ 9.0M 5.0M)) 32.0M)
    :ck (+ temperatura 273.15)
    :fc (* (- temperatura 32.0) (/ 5.0 9.0))
    :else "não existe"))

(conversor-de-temperatura 1.0 :cf)
(conversor-de-temperatura 1.0 :ck)
(conversor-de-temperatura 1.0 :fc)
