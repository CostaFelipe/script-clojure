(defprotocol Describe
  (describe [this])
 )

(defrecord Car [name top-speed]
 Describe
  (describe [this]
    (let [{name :name top-speed :top-speed} this]
      (str name " has a top speed of " top-speed "KM/hr."))))

(def ferrari-SF90 (->Car "Ferrari SF90" 340))

(describe ferrari-SF90)

(defrecord Ship [name top-speed]
  Describe
  (describe [this]
    (let [{name :name top-speed :top-speed} this]
      (str name "has a top speed of " top-speed "knots"))))

(def artic-explore (->Ship "Arctic Explore" 10))

(describe artic-explore)

(defrecord Rocket [name orbit])

(extend-protocol Describe
  Rocket
  (describe [this] (str (:name this) " reaches " (:orbits this) "orbit.")))

(def pslv (->Rocket "PSLV" "Low Earth"))

(describe pslv)
