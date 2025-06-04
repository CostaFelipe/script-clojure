(try
  (slurp "does_not_exist.txt")
  (catch Exception e (println (str "caught exception: " (.getMessage e)))))


(try
  (slurp "not_exist.txt")
  (println "this won't be printed")
  (catch Exception e (println (str "caught expection: " (.getMessage e)))))

(try
  (slurp "not_exist")
  (println "This won't be printed")
  (catch Exception e (println (str "cagth expection: " (.getMessage e))))
  (finally (println "code something that will deal with this exception")))

(try
  (let [x (Integer/parseInt "not-a-number")]
    (println x))

  (catch NumberFormatException e
    (println "Caught a NumberFormatException: " (.getMessage e)))

  (catch NullPointerException e
    (println "Caught a NullPointerException:" (.getMessage e)))

  (catch Exception e
    (println "Caught a generic exception:" (.getMessage e))))

(defn print-length [s]
  (println "Length of the string is:" (.length s)))

(print-length "Hello, world!")

(print-length nil)

(try
  (print-length 1)
  (catch NumberFormatException e
    (println "Caught a NumberFormatException:" (.getMessage e)))

  (catch NullPointerException e
    (println "Caught a NullPointerException:" (.getMessage e)))

  (catch Exception e
    (println "Caught a generic exception:" (.getMessage e))))
