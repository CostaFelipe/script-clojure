;maps

{:languages "Clojure" :creator "Rich Hickey"}

;;or

{:languages "Elixir", :creator "José Valim"}

(sorted-map :language "Clojure" :creator "Rich Hickey")

(array-map :language "Elixir" :creator "José Valim")

(hash-map :name "Teste" :age 22)

;{:language "C++" :creator}

(conj {:language "Elixir"} [:creator "José Valim"])

;;vector
[1 2 3 4 5]

(vector 1 2 3 4 5 6 7)

["clojure" "scala" "erlang" "haskell" "elixir"]

;or with comma

["clojure", "scala" "erlang" "haskell" "elixir"]

(conj [1 2 3 4 5 6] 7)

(get [1 2 3 4 5 6 7] 6)

(assoc [1 2 3 4] 2 :three)

;list
'(1 2 3 4 5 6 7 8 9 10)

'("clojure" "scala" "erlang" "haskell" "elixir", "golang")

(list 1 2 3 4 5 6 7)

(conj '(1 2 3 4 5 6) 7)

(seqable? '(1 2 3))

;sets

#{1 2 3 4 5 6 7}

#{"clojure" "scala" "erlang" "haskell" "elixir", "golang"}

(conj #{:tea :coffe} :juice)

;seq, cons, list*
(seq [1 2 3 4])

(seq {:languages "elixir" :creator "José Valim"})

(seq '(1 2 3 4 5))

(seq #{"clojure" "scala" "erlang" "haskell" "elixir", "golang"})

(seq [])

(def xs [1 2 3])

(if (seq xs)
  (println "Do something  with this sequence")
  (println "Do something else"))

(def user {:username "User01" :email "email@.com"})

(if (seq user)
  (println "Do something  with this sequence")
  (println "Do something else"))

(cons 0 (range 1 3))

(list* 0 1 (range 2 5))

;first, rest, next
(first (seq [1 2 3 4 5 6 7]))

(rest (seq [1 2 3 4 5]))

(next (seq [1 2 3 4 5 6 7 8]))

(rest (seq [:one]))

(next (seq [:one]))

(first [1 2 3 4 5 6 7 8 9])

(second [1 2 3 4 5 6 7 8 9])

(rest [1 2 3 4 5 6 7 8 9])

(next [1 2 3 4 5 6 7 8 9])

;Key Operations on Collections and Sequences

;count
(count [1 2 3 4 5])

(count [])

(count nil)

(counted? "String")

(counted? [1 2 3 4 5])

(count "hello")

(counted? (range))

;conj
(conj '(1 2) 3)

(conj [1 2] 3)

(conj {:a 1 :b 2 :c :3} [:d 4])

(conj {:cats 1 :dogs 2} [:ants 400] [:giraffes 13])

(conj #{1 4} 5)

(conj #{:a :b :c} :b :c :d :e)

;;get

;maps
(get {:a 1 :b 2 :c 3} :b)

;index of a vector
(get [10 15 20 25] 2)

;sets
(get #{1 10 100 2 20 200} 100)

(get #{:orange :strawberry} :apple)

;get in maps
(get {:name "Test" :email "test@test.com"} :age "Not found")

(get {:name "Test" :email "test@test.com"} :email "Not found")

(defrecord Language [name create])

(get (Language. "Elixir" "José Valim") :name)

(defrecord Numbers [index middle ring pinky thumb])

(get (Numbers. 3 4 3.5 2 2) :index)

;assoc

(assoc {:a 1} :b 2)

(assoc {:a 1 :b 45 :c 3} :b 2)

(defrecord Hand [index middle ring pinky thumb])
(assoc (Hand. 3 4 3.5 2 2) :index 3.75)

;;vector
(assoc [1 2 3 4] 5 6)

(assoc [1 2 3] 3 4)

;dissoc
(dissoc {:a 1 :b 2 :c 3} :b)

(dissoc {:a 1 :b 14 :c 390 :d 75 :e 2 :f 51} :b :c :e)

(defrecord Hand1 [index middle ring pinky thumb])

(dissoc (Hand1. 3 4 3.5 2 2) :ring)

;;first

(first (range 10))

(first [:floor :piano :seagul])

(first [])

;rest
(rest [13 1 16 -4])

(rest '(:french-fry))

(if (rest '("stugg"))
  (println "Does this print?"))

;;empty?
(empty? [])

(empty? '(1 2 3))

;;empty

(if (empty [1 2 3])
  "It's empty"
  "It's not empty")

(empty [1 2 3])

(empty {:a 1 :b 2})

(empty #{1 2 3})

(empty '(:one :two :three))

;not-empty
(not-empty '(:nice :elephants :children))

(not-empty [])

(not-empty '())

;contains?
(contains? {:a 1 :b 2 :c 3} :c)

(contains? #{:a :b :c} :d)

;(contains? '(1 2 3) 0) lista não suporta
