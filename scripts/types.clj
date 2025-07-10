;defrecord vs deftype
(defprotocol Shape
  (area [this])
  (perimeter [this]))

(defrecord Rectangle [width lenght]
  Shape
  (area [this] (* (:width this) (:lenght this)))
  (perimeter [this] (+ (* 2 (:width this)) (* 2 (:lenght this)))))

(defrecord Square [side]
  Shape
  (area [this] (* (:side this) (:side this)))
  (perimeter [this] (+ (* 4 (:side this)))))

(def sq1 (->Square 4))

(area sq1)

(def rect1 (->Rectangle 4 2))

(area rect1)
