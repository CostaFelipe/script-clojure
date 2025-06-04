(defrecord Car [name top-speed])

(def tata-car (->Car "Tata Nano" 120))

(:name tata-car)

(:top-speed tata-car)

(get tata-car :name)

(get tata-car :top-speed)


(def ambassador (map->Car {:name "Ambassador",
                           :top-speed 240}))

(:name ambassador)

(:top-speed ambassador)

(get ambassador :name)

(get ambassador :top-speed)

(defn describe [vehicle]
  (let [{name :name top-speed :top-speed} vehicle]
    (str name "has top speed of " top-speed "KM/hr")))

(describe tata-car)

(defrecord Ship [name top-speed])
(def artict-explore (->Ship "Artic Explore" 10))

(defn describe-ship [vehicle]
  (let [{name :name top-speed :top-speed} vehicle]
    (str name " has top speed of " top-speed " knots.")))

(describe-ship artict-explore)
