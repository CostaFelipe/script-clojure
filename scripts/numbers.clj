(type 120)

(type 1.2)

(type Math/PI)

(type (/ 1 2))

(type (double 32))

(type (/ 64 (double 32)))

(type (long 3.1415))

6.0221413e23

(type 6.0221413e23)

1e-10

(* 9999 9999 9999 9999 9999)

(*' 9999 9999 9999 9999 9999)

(* 2 Double/MAX_VALUE)

(* 2 (bigdec Double/MAX_VALUE))

(bigdec 1)

(type (bigdec 10))

(* 3 (/ 1 3))

(+ (/ 1 3) 0.3)

(rationalize 0.3)

(type (rationalize 0.2))

(+ (/ 1 3) (rationalize 0.3))

(Integer/parseInt "21")

(Double/parseDouble "3.1415")

(bigdec "3.141592653589793238462643383279502884197")

(bigint "122333444455555666666777777788888888999999999")

(+ (Integer/parseInt "21") (Integer/parseInt "21"))

(int 2.0001)

(int 2.9999999)

(Math/round 2.0001)

(Math/round 2.999)

(int (+ 2.99 0.5))

(Math/ceil 2.0001)

(Math/floor 2.999)

(with-precision 3 (/ 7M 9))

(with-precision 1 (/ 7M 9))

(with-precision 3 (/ 1 3))

(with-precision 3 (/ (bigdec 1) 3))

(defn fuzzy= [tolerance x y]
  (let [diff (Math/abs (- x y))]
    (< diff tolerance)))

(fuzzy= 0.01 10 10.000000000001)

(fuzzy= 0.01 10 10.1)

(- 0.22 0.23)

(- 0.23 0.24)

(def equal-within-ten? (partial fuzzy= 10))

(equal-within-ten? 100 109)

(equal-within-ten? 100 110)

(equal-within-ten? 20 29)

(defn fuzzy-comparator [tolerance]
  (fn [x y]
    (if (fuzzy= tolerance x y) ;
      0
      (compare x y))))

(sort (fuzzy-comparator 10) [100 11 150 10 9])

(def lista [1 2 3 4 5 6 7 8 9 10])

(def vowel? #(some (partial = %) lista))

(vowel? 1)

(vowel? 100)

;; Calculating sin(a + b). The formula for this is
;; sin(a + b) = sin a * cos b + sin b cos a
(defn sin-plus [a b]
  (+ (* (Math/sin a) (Math/cos b))
     (* (Math/sin b) (Math/cos a))))

(sin-plus 0.1 0.3)

;; Calculating the distance in kilometers between two points on Earth
(def earth-radius 6371.009)

(defn degress->radians [point]
  (mapv #(Math/toRadians %) point))

(defn distance-between
  ([p1 p2] (distance-between p1 p2 earth-radius))
  ([p1 p2 radius]
   (let [[lat1 long1] (degress->radians p1)
         [lat2 long2] (degress->radians p2)]
     (* radius
        (Math/acos (+ (* (Math/sin lat1) (Math/sin lat2))
                      (* (Math/cos lat1)
                         (Math/cos lat2)
                         (Math/cos (- long1 long2)))))))))

(distance-between [49.2000 -98.1000] [35.9939, -78.8989])

2r101010

3r1120

16r20

;;integer/toString
(Integer/toString 13 2)

(Integer/toString 42 16)

(Integer/toString 35 36)

;;integer for binary
(defn to-base [radix n]
  (Integer/toString n radix))

(def base-two (partial to-base 2))

(base-two 7)

;;Find the mean (average) of a collection by dividing its total by the count of the collection:
(defn mean [coll]
  (let [sum (apply + coll)
        count (count coll)]
    (if (pos? count)
      (/ sum count)
      0)))

(mean [5.0 5.0 2.0])

(mean [1 2 3 4])

(mean [1 1.6 7.4 10])

(sort [10 2 3 4])

(defn median [coll]
  (let [sorted (sort coll)
        cnt (count sorted)
        halfway (int (/ cnt 2))]
    (if (odd? cnt)
      (nth sorted halfway)
      (let [bottom (dec halfway)
            bottom-val (nth sorted bottom)
            top-val (nth sorted halfway)]
        (mean [bottom-val top-val])))))

(median [5 2 4 1 3])

(median [7 0])

(median [5 3 11])

(defn mode [coll]
  (let [freqs (frequencies coll)
        occurrences (group-by second freqs)
  ] occurrences))

(mode [:teste :one :two :teste :orange])

(mode ["orange" "one" "two" "testing" "test" "one"])

(defn mode-2 [coll]
  (let [freqs (frequencies coll)
        occurrences (group-by second freqs)
        modes (last (sort occurrences))
        modes (->> modes
                   second
                   (map first))] modes))

(mode-2 [:alan :bob :alan :greg])

(mode [:smith :carpenter :doe :smith :doe])

(shuffle [1 2 3 4 5 6])
