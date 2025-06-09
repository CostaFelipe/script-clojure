(type 120)

(type 1.2)

(type Math/PI)

(type (/ 1 2))

(type (double 32))

(type (/ 64 (double 32)))

(type (long 3.1415))

6.0221413e23

1e-10

(* 9999 9999 9999 9999 9999)

(*' 9999 9999 9999 9999 9999)

(* 2 Double/MAX_VALUE)

(* 2 (bigdec Double/MAX_VALUE))

(* 3 (/ 1 3))

(+ (/ 1 3) 0.3)

(rationalize 0.3)

(+ (/ 1 3) (rationalize 0.3))

(Integer/parseInt "21")

(Double/parseDouble "3.1415")

(bigdec "3.141592653589793238462643383279502884197")

(bigint "122333444455555666666777777788888888999999999")

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
