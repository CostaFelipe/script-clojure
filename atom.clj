(def counter (atom 0))

@counter
counter

(swap! counter inc)

;;reset
(reset! counter 101)
@counter

;;ex

(def robo-count (atom 0))

(defn make-robot []
  (swap! robo-count inc)
  (str "Made a robot. Total robots: " @robo-count))

(make-robot)

(println (str "Robots made: " @robo-count))
