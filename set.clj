#{10 20 30 40}

(type #{1 2 3 4 5})

(set? #{1 2})

;;error
#{1 2 2 3 5 9}

#{"Apple" "Orange" "Mango" "Pineapple"}

;;error
#{"Apple" "Orange" "Mango" "Pineapple" "Apple"}

(def fruits
  #{"Apple" "Orange" "Mango" "Pineapple"})

(println fruits)

(contains? fruits "Orange")

(contains? fruits "Lime")

(fruits "Lime")

;;error gerado
("Orange" fruits)

(def programming-languages
  #{:elixir :python :c++ :clojure})

(programming-languages :clojure)

(contains? programming-languages :clojure)

(contains? programming-languages :java)

(:elixir programming-languages)

(conj programming-languages :java)

(disj programming-languages :c++)
