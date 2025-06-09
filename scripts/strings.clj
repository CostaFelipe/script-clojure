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

(def me {:first-name "Ryan", :favorite-language "Clojure"})

(str "My name is " (:first-name me) ", and I really like to program in " (:favorite-language me))

(apply str (interpose " " [1 2.000 (/ 3 1) (/ 4 9)]))

(format "%07.3f" 0.005)

(defn filename [name i]
  (format "%03d-%s" i name))

(filename "my-awesome-file.txt" 1)

(defn tableify [row]
  (apply format "%-20s | %-20s | %-20s" row))

(def header ["First Name" "Last Name" "Employee ID"])

(def employees [["Ryan" "Neufeld" 2]
                ["Luke" "Vanderhart" 1]])

(->> (concat [header] employees)
     (map tableify)
     (mapv println))

(re-find #"\d+" "teste 123")

(re-find #"Beads" "Beads aren't cheap.")

(re-matches #"\w+" "my-params")

(re-matches #"\w+" "justLetters")

(re-seq #"\w+" "My favorite things")

(re-seq #"\d{3}-\d{4}" "My phone number is 777-2222")

(defn mentions [tweet]
  (re-seq #"(@|#)(\w+)" tweet))

(mentions "So long, @earth, and thanks for all the #fish. #goodbyes")

(def re-phone-number #"(\w+): \((\d{3})\) (\d{3}-\d{4})")

(re-seq re-phone-number "Home: (919) 555-1234, Work: (191) 555-1234")

(def about-me "My favorite color is green")

(str/replace about-me "green" "red")

(defn de-canadianize [s]
  (str/replace s "ou" "o"))

(de-canadianize (str "Those Canadian neighbours have coloured behaviour
                      when it comes to word endings"))

(defn linkify-comment [repo comment]
  (str/replace comment
               #"#(\d+)"
               (str "[#$1](https://github.com/)" repo "/issues/$1)")))

(linkify-comment "next/big-thing" "As soon as we fix #42 and #1337 we
                 should be set to release!")

(str/split "HEADER1,HEADER2,HEADER3" #",")

(str/split "Spaces   Newlines\n\n" #"\s+")

(str/split "field1     field2  field3"  #"\s+")

(str/split "ryan,neufeld," #"," -1)

(def data-delimiters #"[ :-]")

(str/split "2013-04-05 14:39" data-delimiters)

(str/split "2013-04-05 14:39" data-delimiters 1)

(str/split "2013-04-05 14:39" data-delimiters 2)

(str/split "2013-04-05 14:39" data-delimiters 100)

;;convert
(symbol "valid?")

(str "valid?")

(:name :triumph)

(str :triumph)

(keyword "fantastic")

(keyword 'fantastic)

(symbol (name :wonderful))

(name :user/valid?)

(namespace :user/valid?)

(str :user/valid?)

(.substring (str :user/valid?) 1)

(keyword 'produce/onions)

(symbol (.substring (str :produce/onions) 1))

(def shopping-area "bakery")

(keyword shopping-area "bagels")

(symbol shopping-area "cakes")
