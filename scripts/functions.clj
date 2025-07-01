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

;;return
(defn add [a b]
  (+ a b))

(println (add 1 101))

(defn do-math [a b]
  ;;(* a b)
  (+ a b))

(do-math 3 5)


;;recursion
(defn count-down [number]
  (println number)
  (if (pos? (dec number))
    (count-down (dec number))))

(count-down 5)

(defn count-down-recur [number]
  (println number)
  (if (pos? (dec number))
    (recur (dec number))))

(count-down-recur 10)

(defn sum [numbers total]
  (if (empty? numbers)
    total
    (recur (rest numbers) (+ total (first numbers)))))

(println (sum [1 2 3 4 5] 0))

(defn collection-sum [collection]
  (sum collection 0))

(collection-sum [1 2 3 4 5])

;;multimethod
(defmulti  factorial identity)

(defmethod factorial 0 [_] 1)

(defmethod factorial :default [num]
 (* num (factorial (dec num))))

(factorial 0)
(factorial 1)
(factorial 3)
(factorial 7)

(defn grow [name direction]
  (if (= direction :small)
    (str name " is growing smaller")
    (str name " is growing bigger")))

(grow "Alice" :small)

(grow "Marcus" :big)

(partial grow "Jhonny")

((partial grow "Peter") :small)

(defn toggle-grow [direction]
  (if (= direction :small) :big :small))

(toggle-grow :big)

(toggle-grow :small)

(defn oh-my [direction]
  (str "Oh My! You are growing " direction))

(oh-my (toggle-grow :small))

(oh-my (toggle-grow :big))

(defn surprise [direction]
  ((comp oh-my toggle-grow) direction))

(surprise :small)

(surprise :big)

;Practical Polymorphism
(defn who-are-you [input]
  (cond
    (= java.lang.String (class input)) "String - Who are you?"
    (= clojure.lang.Keyword (class input)) "Keyword - Who are you?"
    (= java.lang.Long (class input)) "Number - Who are you?"))

(who-are-you :keyword)
(who-are-you "orange")
(who-are-you 101)

(defmulti who_are_you class)

(defmethod who_are_you java.lang.String [input]
  (str "String - Who are you? " input))

(defmethod who_are_you clojure.lang.Keyword [input]
  (str "Keyword - Who are you? " input))

(defmethod who_are_you java.lang.Long [input]
  (str "Number - Who are you? " input))

(defmethod who_are_you :default [input]
  (str "I don't know - who are you? " input))

(who_are_you :keyword)
(who_are_you "Elixir")
(who_are_you 1001)
(who_are_you true)
