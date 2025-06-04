(def multiverse (cycle ["universe" "antiverse"]))

(first multiverse)

(second multiverse)

(take 5 multiverse)

(nth multiverse 100)

(nth multiverse 1783)


(def programming-languages
  (cycle ["clojure" "elixir" "golang" "ocalm" "ada"]))

(nth programming-languages 5)

(take 10 programming-languages)

(def all-numbers (iterate inc 1))

(nth all-numbers 24)

(take 10 all-numbers)

(defn squared [num]
  (Math/pow num, 2))

(def squares
  (iterate squared 5))

(take 3 squares)
