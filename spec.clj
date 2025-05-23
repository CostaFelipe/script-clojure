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

(defn string-or-keyword? [a]
  (if (or (string? a) (keyword? a))
      true
      false
    ))
;;or

(s/valid? string-or-keyword? 101)
(s/valid? string-or-keyword? :abc)
(s/valid? string-or-keyword? "32")
