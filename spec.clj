(require '[clojure.spec.alpha :as s])

(s/valid? string? "Hello")
(s/valid? string? 42)
(s/valid? number? 21)
(s/valid? integer? 123)
(s/valid? double? 3.1415)
(s/valid? vector? [1 2 3 4 5])
(s/valid? map? {1 "one" 2 "two"})
(s/valid? set? #{:apple :orange})
(s/valid? keyword? :ubuntu)


;;or - exercício

(defn string-or-keyword-um? [a]
  (if (or (string? a) (keyword? a))
    true
    false))

(s/valid? string-or-keyword-um? 101)
(s/valid? string-or-keyword-um? :abc)
(s/valid? string-or-keyword-um? "32")

;;refatorando string-or-keyword?
(def string-or-keyword?
  (s/or :keyword keyword? :string string?))

(s/valid? string-or-keyword? 1001)
(s/valid? string-or-keyword? :ubuntu)
(s/valid? string-or-keyword? "404")

;;collection spec

(def string-collection? (s/coll-of string?))

(s/valid? string-collection? ["Hi" "Hello"])

(def number-or-string?
  (s/or :number number? :string string?))

(s/valid? number-or-string? 1)

(def number-or-string-colletion?
  (s/coll-of number-or-string?))

(s/valid? number-or-string-colletion? [1 "Hi" "India" 42])

(s/valid? number-or-string-colletion? [1 "Hi" "India" 42 :mint])

(def valid-person-vector?
  (s/cat :name string? :age number? :gender keyword?))

(s/valid? valid-person-vector? ["Johnny B Goode" 40 :male])

;;valid map
(def valid-person-map?
  (s/keys :req-un [::name
                   ::age
                   ::gender]))

(s/valid? valid-person-map? {:name "Johnny B Goode"
                             :age 45
                             :gender :male})


;;verificando mapas
(s/def ::name string?)

(s/valid? ::name "Johnny Doe")

(s/def ::user (s/keys :req-un [::name ::age ::gender]))

(s/valid? ::user {:name "Johnny B Goode"
                             :age 45
                             :gender :male})
