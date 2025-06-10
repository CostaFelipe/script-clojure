;You want to create a list data structure in your source code.

'(1 :2 "3")

(list 1 :2 "3")

(def x 2)

'(1 x)

(list 1 x)

;You have an existing sequential data structure that you would like to convert into a list
;as its concrete data type.

(apply list [1 2 3 4])

(into '() [1 2 3 4 5])

;You want to add an item to a list;

(conj (list 1 2 3 5) 7)

(conj (list 1 2 3) 4 5)

;You want to obtain a list without a particular item in it, removing an item from the
;original list

(pop '(1 2 3))

(rest '(1 2 3))

(pop '())

(rest '())

;;You want to test if a value is a list.
(list? (list 1 2 3))

(seq? (list 1 2 3))

(list? (cons 1 '(2 3)))

(seq? (cons 1 '(2 3)))

(list? (range 3))

(seq? (range 10))

(type (range 3))

;You want to create a vector data structure, either as a literal or from an existing data
;structure.

[1 :2 "3"]

(vector 1 :2 "3")

(vec '(1 :2 "3"))

;;using into for existing collections 30% more eficient for big colletions comparaded with vec
(into [1 2 3 4])

;You want to add an item to a vector, yielding a new vector containing the item.
(conj [1 2 3 4] 53)

(conj [1 2 3] 4 5)

;;attention is fragile
(assoc [:a :b :c] 3 :x)

;You want to remove an item from a vector, obtaining a new vector without the item.
(pop [100 101 102 103])

(subvec [:a :b :c :d] 1)

(subvec [:a :b :c :d] 1 3)

;You have a vector, and you want to retrieve the value the vector contains at a particular
;location (index).
