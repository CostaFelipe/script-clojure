(require '[clojure.string :as str])

(str/lower-case "ipsum dex")
(str/upper-case "ipsum dex")

(apply str [\H \e \l \l \o \ \W \o \r \l \d])

(def food-items ["milk" "butter" "flour" "eggs"])
(str/join ", "  food-items)

(seq "Hello World")
