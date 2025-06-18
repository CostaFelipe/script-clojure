(let [[color size] ["blue" "small"]]
  (str "The " color " door is " size))


;more verbose
(let [x ["blue" "small"]
      color (first x)
      size (last x)]
  (str "The " color " door is " size))

(let [{flower1 :flower1 flower2 :flower2}
      {:flower1 "red" :flower2 "blue"}]
  (str "The flower are " flower1 " and " flower2))

(let [{flower1 :flower1 flower2 :flower2 :or {flower2 "missing"}}
      {:flower1 "Red"}]
  (str "The flower are " flower1 " and " flower2))

(let [{flower1 :flower1 :as all-flowers}
      {:flower1 "red"}]
  [flower1 all-flowers])
