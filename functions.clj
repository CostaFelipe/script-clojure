(defn say-hello []
  (println "Hello world!"))

(say-hello)

(defn say-hello-name [name]
  (println "Hello" name "!"))

(say-hello-name "Jhon Doe")

(defn circle-area [radius]
  (* Math/PI radius radius))

(circle-area 7)

(defn hypotenuse [a b]
  (Math/sqrt (+ (* a a) (* b b))))

(hypotenuse 3 4)
