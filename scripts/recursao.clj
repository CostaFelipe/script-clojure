(def adjs ["normal"
           "too small"
           "too big"
           "is swimming"])

(defn person-is [in out]
  (if (empty? in)
    out
    (person-is
     (rest in)
     (conj out
           (str "Person is " (first in))))))

(person-is adjs [])

(defn person-input [input]
  (loop [in input
         out []]
    (if (empty? in)
      out
      (recur (rest in)
             (conj out
                   (str "Alice is " (first in)))))))

(person-input adjs)

(defn countdown [n]
  (if (= n 0)
    n
    (recur (- n 1) ))
  )

(countdown 5)

(countdown 100)
