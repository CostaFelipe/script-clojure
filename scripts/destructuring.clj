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

(let [{:keys [flower1 flower2]}
      {:flower1 "red" :flower2 "blue"}]
  (str "The flowers are " flower1 " and " flower2))

(defn flower-colors [colors]
  (str "The flowers are "
       (:flower1 colors)
       " and "
       (:flower2 colors)))

(flower-colors {:flower1 "red" :flower2 "blue"})

(defn flower-colors-one [{:keys [flower1 flower2]}]
  (str "The flowers are " flower1 " and " flower2))

(flower-colors-one {:flower1 "red" :flower2 "blue"})
