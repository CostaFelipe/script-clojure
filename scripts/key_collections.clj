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

;some
(some odd? [1 2 3 4 5])

(some even? [1 3 5 7])

(some #(if (even? %) %) [1 3 4 5 6])

(some {:a 1 :b 2} [:h :t :b :y])

(some #{19} (range 20))

;every?
(every? even? (range 0 10 2))

(every? {:a 1 :b 2 :c 3} [:a :b :c])

(every? #{2 3 4} [2 3 4 2 3 4])

;map, mapv
(def numbers
  (range 1 11))

(map (partial * 2) numbers)

(mapv (partial * 1) numbers)

(def score
  {:clojure 9.0
   :golang 8.5
   :elixir 9.0
   :scala 8.0})


(map #(str "Team " (name (key %)) " has scored " (val %)) score)

;reduce
(def numeros (range 1 10))

(reduce + numeros)

(reduce + (vals score))

(reduce + 10 (vals score))

;filter, filterv
(filter even? [0 1 2 3 4 5 6])

(filter even? (range 0 20))

(filter #(< (count %) 5) ["Paul" "Celery" "Computer" "Clojure" "Elixir" "Rudd"])

(filter #{:nothing :something nil}
        [:nothing :something :things :someone nil false :pigeons])

(filter #{2 5} [1 2 3 4 5])

;remove
(remove even? (range 1 10))

(remove {:a 1 :b 2} [:h :k :z :b :s])

(remove #{:nothing :something nil false true}
        [:nothing :something :things :someone nil false :pigeons true])

;sort, sort-by
(sort [0.0 -1 1.3 nil 0.18 7])

(sort ["The case matters" "Lexicographi ordering" "The case matters" nil "%%"])

(sort [[1 "banana"] [1 "apple"] [0 "grapefruit"] [3 "strawberry"]])

(sort [5 1.0 true "abc"])

(letfn [(strings-before-numbers [x y]
          (cond
            (and (string? x) (number? y)) -1
            (and (number? x) (string? y)) 1
            :else (compare x y)))]
  (sort strings-before-numbers [1 0.0 nil "abc"]))

(sort (comp - compare) ["charlie" "delta" "alpha" "bravo"])

;sort-by
(sort-by :last [{:first "Fred" :last "Mertz"}
                {:first "Lucy" :last "Ricardo"}
                {:first "Ricky" :last "Ricardo"}
                {:first "Ethel" :last  "Mertz"}])

(sort-by (juxt count clojure.string/lower-case) ["Alpha" "bravo" "Charlie" "Delta" "echo"])

;iterate
(take 5 (iterate inc 1))

(defn multiply-by-two [value]
  (* 2 value))

(take 10 (iterate multiply-by-two 1))

;get-in
(def family
  {:dad {:shirt 5
         :pants 6
         :shoes 4}
   :mom {:dress {:work 6
                 :casual 7}}
   :son {:toy 5
         :homework 1}})

(get-in family [:mom :dress :work])

(get-in family [:dad :shirt])

(def locations [:office :home :school])

(get-in locations [1])

(def family1 {:dad {:shirt 5
                    :pants 6
                    :shoes 4}
              :mom {:dress {:work 6
                            :casual 7}
                    :book 3}
              :son {:toy 5
                    :homework 1}})

(update-in family1 [:dad :pants] inc)

(def usuario {:nome "William Doe" :idade 28 :email "doe@gmail.com"})

(assoc usuario :nome "José")

(def locations1 [:office :home :school])

(update-in locations1 [2] #(keyword (str "high-" (name %))))

;;assoc-in
(assoc-in family1 [:son :crayon] 3)

(assoc-in locations1 [3] :high-school)

;keys
