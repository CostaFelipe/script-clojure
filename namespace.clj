(in-ns 'cheese.taxonomy)

(def cheddars ["mild" "medium" "strong" "sharp" "extra sharp"])
(def bries ["Wisconsin" "Somerset" "Brie de Meaux" "Brie de Melun"])

(in-ns 'cheese.analysis)

cheese.taxonomy/cheddars

;;refer
(clojure.core/refer 'cheese.taxonomy)

bries

cheddars

(clojure.core/get (clojure.core/ns-map clojure.core/*ns*) 'bries)
(clojure.core/get (clojure.core/ns-map clojure.core/*ns*) 'cheddars)

(clojure.core/refer 'cheese.taxonomy :only ['bries])

bries

(clojure.core/refer 'cheese.taxonomy :only ['bries])

bries

cheddars

(clojure.core/refer 'cheese.taxonomy :rename {'bries 'yummy-bries})

bries

yummy-bries
