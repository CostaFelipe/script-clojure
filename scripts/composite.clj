(require '[clojure.set :as set])
;You want to create a list data structure in your source code.

'(1 :2 "3")

(list 1 :2 "3")

(def x 2)

'(1 x)

(list 1 x)

;You have an existing sequential data structure that you would like to convert into a list
;as its concrete data type.

(apply list [1 2 3 4])

(into '() [1 2 3 4 5])

;You want to add an item to a list;

(conj (list 1 2 3 5) 7)

(conj (list 1 2 3) 4 5)

;You want to obtain a list without a particular item in it, removing an item from the
;original list

(pop '(1 2 3))

(rest '(1 2 3))

(pop '())

(rest '())

;;You want to test if a value is a list.
(list? (list 1 2 3))

(seq? (list 1 2 3))

(list? (cons 1 '(2 3)))

(seq? (cons 1 '(2 3)))

(list? (range 3))

(seq? (range 10))

(type (range 3))

;You want to create a vector data structure, either as a literal or from an existing data
;structure.

[1 :2 "3"]

(vector 1 :2 "3")

(vec '(1 :2 "3"))

;;using into for existing collections 30% more eficient for big colletions comparaded with vec
(into [1 2 3 4])

;You want to add an item to a vector, yielding a new vector containing the item.
(conj [1 2 3 4] 53)

(conj [1 2 3] 4 5)

;;attention is fragile
(assoc [:a :b :c] 3 :x)

;You want to remove an item from a vector, obtaining a new vector without the item.
(pop [100 101 102 103])

(subvec [:a :b :c :d] 1)

(subvec [:a :b :c :d] 1 3)

;You have a vector, and you want to retrieve the value the vector contains at a particular
;location (index).
(nth [:a :b :c :d :e] 3)

(nth [:a :b :c] 4)

(nth [:a :b :c] 4 :not-found)

(def v [:a :b :c])

(v 2)

(get [:a :b :c ] 5)

(get [:a :b :c :d] 5 :not-found)

;Given a vector, you would like to obtain a new vector with a different value at a particular
;index.

(assoc [:a :b :c] 1 :x)

(assoc [:a :b :c] 1 :x 2 :y)

;You want to create an unordered collection of distinct objects, which can be tested for
;membership quickly.

#{:a :b :c}

;;#{:x :y :z :z :z}

(hash-set :a :b :c)

(apply hash-set :a [:b :c])

(set "Hello")

(into #{} [:a :b :c :a])

(into #{:a :b} [:b :c :d])

(sorted-set 99 4 32 7)

(into (sorted-set) "the quick brown fox jumps over the lazy dog")

(def alphabet (into (sorted-set) "qwertyuiopasdfghjklzxcvbnm"))
;;remember

(map char (range 97 242))

(println alphabet)

(last alphabet)

(first alphabet)

(second (disj alphabet \b))

(def descending-set (sorted-set-by > 1 2 3))

(into descending-set [-1 4])

;;You want to obtain a new set with items added or removed.
(conj #{:a :b :c} :d)

(conj #{:a :b :c} :d :e)

(disj #{:a :b :c} :b)

(disj #{:a :b :c} :b :c)

;You want to check if an item is a member of a set.
(contains? #{:red :white :green} :blue)

(contains? #{:red :white :green} :green)

(get #{:red :white :green} :blue)

(get #{:red :white :green} :green)

(def my-set #{:red :white :green})

(my-set :blue)

(my-set :red)

(:blue #{:red :white :green})

(:green #{:red :white :green})

(take 3
      (filter #{1 2 3}
              (repeatedly #(rand-int 10))))

;You want to perform common operations on sets, such as taking the union, intersection,
;or difference of two sets, or you want to test if one set is a subset or superset of another.

(clojure.set/union #{:red :white} #{:white :blue} #{:blue :green})

(clojure.set/intersection #{:red :white :blue}
                          #{:red :blue :green}
                          #{:yellow :blue :red})

(set/difference #{:red :white :blue :yellow}
                        #{:red :blue}
                        #{:white})

(set/subset? #{:blue :white}
                     #{:red :white :blue})

(set/subset? #{:blue :black} #{:red :white :blue})

;You want to create an association that maps keys to values. You possibly want to maintain
;a specific ordering of keys.

{:name ""
 :class :barbarian
 :race :half-orc
 :level 20
 :skills [:bashing :hacking :smashing]}

{1 1, 8 64, 2 4, 9 81}

(array-map)

(sorted-map :key1 "val1" :key2 "val2")

(sorted-map-by #(< (count %1) (count %2))
          "pigs" 14
               "horses" 2
               "elephants" 1
               "manatees" 3)


;You want to retrieve the value stored at a particular key in a map.
(get {:name "Kvothe" :class "Bard"} :name)

(get {:name "Kvothe" :class "Bard"} :race)

(get {:name "Kvothe" :class "Bard"} :race "Human")

(:name {:name "Marcus" :class "Paladin"})

(:race {:name "Marcus" :class "Paladin"} "Human")

(def character {:name "Brock" :class "Barbarian"})

(character :name)

(:class character)

(character :race)

(character :race "Human")

(get-in {:name "Marcus" :weapon {:type :greatsword :damage "2d6"}}
        [:weapon :damage])

(get-in {:name "Marcus"}
        [:weapon :damage])

(get-in {:name "Marcus"}
        [:weapon :damage]
        "1d2 (first)")

(get-in [{:name "Marcus" :class "Paladin"}
         {:name "Kvothe" :class "Bard"}
         {:name "Felter" :class "Druid"}]
        [1 :class])

(defn square [x] (* x x))

(def square {1 1, 2 4, 3 9, 4 16, 5 25})

(square 3)

;You want to retrieve multiple values from a map at one time.
(def beans {:red 10
            :blue 3
            :green 1})

(reduce + (vals (select-keys beans [:red :green])))

((juxt :red :green) beans)

(def weird-map {"a" 1, {:foo :bar} :baz, 13 21})


(select-keys weird-map ["a" {:foo :bar}])

(vals {{:foo :bar} :baz, "a" 1})

(def a-str-then-foo-bar-map
  (juxt #(get % "a")
        #(get % {:foo :bar})))

(a-str-then-foo-bar-map weird-map)

;You want to “change” a map by adding, setting, or removing keys.

;(def villain {:honorific "Dr." :name "Mayhem"})
;(assoc villain :occupation "Mad Scientist" :status :at-large)

;(def villain {:honorific "Dr.", :name "Mayhem", :occupation "Mad Scientist", :status :at-large})

;(assoc villain :status :deceased)

(def villain {:honorific "Dr.", :name "Mayhem", :occupation "Mad Scientist", :status :deceased})

(dissoc villain :occupation :honorific)

(def book {:title "Clojure Cookbook"
           :author {:name "Ryan Neufeld"
                    :residence {:country "USA"}}})

(assoc book :author (assoc (:author book) :residence (assoc (:residence (:author book)) :country "Canada")))

(assoc-in book [:author :residence :country] "Canada")

(assoc-in book [:author :name] "Testando")

(assoc-in book [:title] "Test")

(def website {:clojure-cookbook {:hits 1236}})

(def person {:name "Jhonny Doe" :age 28})

(update-in website [:clojure-cookbook :hits] + 101)

(update-in person [:age] + 10)

(update-in person [:name] str "testing")

(update-in {} [:author :residence] assoc :country "USA")

(def retail-data (atom {:customers [{:id 123 :name "Luke"}
                                    {:id 321 :name "Ryan"}]
                        :orders [{:sku "Q2M9" :customer 123 :qty 4}
                                 {:sku "43XP" :customer 321 :qty 1}]}))

(swap! retail-data update-in [:orders] conj {:sku "9QED" :customer 321 :qty 2})

;You’d like to use a value that isn’t a simple primitive type as a lookup key in a map.
