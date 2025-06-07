(require '[clojure.string :as str])

(print "Hello World!")

(type "Hello")

(str "1 + 2 = " (+ 1 2))

(count "Testing")

(str/reverse "Hello")

(str/replace "Hello" #"l" "1")

(str/lower-case "ipsum dex")
(str/upper-case "ipsum dex")

(apply str [\H \e \l \l \o \  \W \o \r \l \d])

(def food-items ["milk" "butter" "flour" "eggs"])
(str/join ", "  food-items)

(seq "Hello World")

(frequencies (str/lower-case "An adult all about A's"))

(defn yelling? [s]
  (every? #(or (not (Character/isLetter %))
               (Character/isUpperCase %))
          s))

(yelling? "TESTE")

(yelling? "testing")

(apply str [\H \e \l \l \o \  \W \o \r \l \d])

(int \a)

(int \$)

(int \u09B1)

(map int "Hello World")

(char 100)

(char 72)

(char 945)

(reduce #(str %1 (char %2)) "" [115 101 99 114 101 116 32 109 101 115 115 97 103 101 115])

(map char (range 97 122))

(map (comp str char) (range 97 122))
