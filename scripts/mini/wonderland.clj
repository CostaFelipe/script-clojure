(ns wonderland
  (:require [clojure.set :as s]))

(defn common-fav-food [food1 food2]
  (let [food-set1 (set food1)
        food-set2 (set food2)
        common-foods (s/intersection food-set1 food-set2)]
    (str "Common Foods: " common-foods)))

(def food1 [:jam :brownies :toast])
(def food2 [:lettuce :carrots :jam])

(common-fav-food food1 food2)
