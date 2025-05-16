{:a 1 :b 2}

(hash-map "name" "Aragorn" "age" 87)

(def character {:name "Aragorn" :age 120})

(print character)

(get character :name)

(:age character)

(print (character :name) "is very wise")

(assoc character :class "warrior")

(dissoc character :age)

(keys character)

(vals character)

(def movies
  [{:id  25
    :name  "pikachu"
    :type  "electric"
    :isFeatured  true
    },
   {
    :id 26,
    :name  "raichu"
    :type  "electric"
    :isFeatured  true
    }])

(defn list-pokemon-name [movie]
  (:name movie))

(map list-pokemon-name movies)
