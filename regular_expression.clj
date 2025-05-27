(require '[clojure.string :as str])
"A string"

(type "A String")

#"regexp"

(type #"regexp")

(re-matches #"\d" "There is no number here.")

(re-matches #"\d" "42")

(re-matches #"\d+" "42")

(re-matches #"\d+" "42 is the ultimate answer.")

(re-find #"\d+" "42 is the ultimate answer.")

(re-find #"\d+" "42 is ultimate answer, and so is 52.")

(re-find #"\d+" "Forty two is the ultimate answer, and so is 52.")

(re-seq #"\d+" "42 is the ultimate answer, and so is 52.")

(re-seq #"(?i)abc" "abc are small letters and ABC are capitals")

(re-seq #"abc" "abc are small letters and ABC are capitals.")

(re-seq #"(?i)ABC" "abc are small letters and ABC are capitals.")

(re-seq #"[A-Z]+" "Finds all CAPITAL letter WORDS.")

;;clojure string
(str/replace "There   are    lots   of   spaces" #"\s+" " ")

(str/split "There   are  lots   of   spaces" #"\s")

(str/split "There are lots of spaces" #"\s+")
