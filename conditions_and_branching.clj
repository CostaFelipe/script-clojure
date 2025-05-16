;;if
(let [a 5]
  (if (> a 0)
    (println "is positive")
    (println "tirando error")))

(let [a -5]
  (if (> a 0)
    (println "is positive")
    (println "is negative")))

(let [a 0]
  (if (> a 0)
    (println "is positive")
    (if (< a 0)
      (println "is negative")
      (println "is neither positive nor negative"))))

;;do
