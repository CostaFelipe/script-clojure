(def people ["johnny Doe" "Ada"])

(let [[musician scientist artist] people]
  (println "Musician is" musician)
  (println "Scientist is" scientist)
  (println "Artist is" artist))

(def fruits ["orange" "açai" "apple" "banana" ])

(let [[acidas semi-acidas neutra doce] fruits]
  (println "Fruta ácida is" acidas)
  (println "Fruta semi-ácida" semi-acidas)
  (println "Fruta neutra" neutra)
  (println "Fruta doce" doce))

(let [[_ scientist _] people]
  (println "Scientist is" scientist))


(def people
  {:musician "Bash"
   :scientist "Ada"
   :artist "Clint Eastwood"})

(let [{scientist :scientist musician :musician artist :artist} people]
  (println "Scientist is" scientist)
  (println "Musician is" musician)
  (println "Artist is" artist))
