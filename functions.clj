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

(defn multiple-args
  ([] (println "No arguments"))
  ([arg-1] (println "One argument passed:" arg-1))
  ([arg-1 arg-2] (println "Two arguments passed:" arg-1 arg-2)))

(multiple-args)
(multiple-args 1)
(multiple-args 1 2)

(defn unlimited-arguments [& args]
  (println "Arguments:" args)
  (println "Type of args:" (type args)))


(unlimited-arguments 1)
(println)
(unlimited-arguments 1 17 true "Doe" :coder)


(defn unlimited-arguments-2 [first-arg & args]
  (println "First Argument:" first-arg)
  (println "Type of args:"  args))

(unlimited-arguments-2 1)
(println)
(unlimited-arguments-2 1 17 true "Jonh doe")


(defn unlimited-arguments-3 [first-arg second-arg & args]
  (println "First Argument:" first-arg)
  (println "Second Argument:" second-arg)
  (println "Type of args:"  args))

(unlimited-arguments-3 1 2)
(println)
(unlimited-arguments-3 1 17 true "Jonh doe")
