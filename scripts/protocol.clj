(defprotocol Describe
  (describe [this]))

(defrecord Car [name top-speed]
  Describe
  (describe [this]
    (let [{name :name top-speed :top-speed} this]
      (str name " has a top speed of " top-speed "Km/hr."))))

(defrecord Ship [name top-speed]
  Describe
  (describe [this]
    (let [{name :name top-speed :top-speed} this]
      (str name " has top speed of " top-speed " knots"))))

(def tata-nano (->Car "Tata Nano" 120))
(def arctic-explore (->Ship "Artic Explore" 10))

(describe tata-nano)
(describe arctic-explore)
