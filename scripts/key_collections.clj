;maps

{:languages "Clojure" :creator "Rich Hickey"}

;;or

{:languages "Elixir", :creator "José Valim"}

(sorted-map :language "Clojure" :creator "Rich Hickey")

(array-map :language "Elixir" :creator "José Valim")

;{:language "C++" :creator}

(conj {:language "Elixir"} [:creator "José Valim"])

;;vector
[1 2 3 4 5]

["clojure" "scala" "erlang" "haskell" "elixir"]

;or with comma

["clojure", "scala" "erlang" "haskell" "elixir"]

(conj [1 2 3 4 5 6] 7)

(get [1 2 3 4 5 6 7] 6)

(assoc [1 2 3 4] 2 :three)

;list
'(1 2 3 4 5 6 7 8 9 10)

'("clojure" "scala" "erlang" "haskell" "elixir", "golang")

(list 1 2 3 4 5 6 7)

(conj '(1 2 3 4 5 6) 7)

(seqable? '(1 2 3))

;sets

#{1 2 3 4 5 6 7}

#{"clojure" "scala" "erlang" "haskell" "elixir", "golang"}

(conj #{:tea :coffe} :juice)
