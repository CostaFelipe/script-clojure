(count '(1 2 3 4 5))

(count [10 20 30 40])

(count #{1 2 3 4 5})

(count {:one 1 :two 2 :three 3 :four 4})

(seq '(1 2 3 4 5))

(seq [10 20 30 40 50])

(seq #{100 101})

(seq '([:one 1] [:two 2] [:three 3] [:four 4]))

(seq [1 2 3])

(seq '(1 2 3))

(seq #{10 20 30})

(seq {1 "one" 2 "two" 3 "three"})

(partition 2 '(1 2 3 4 5))

(partition 2 (seq '(1 2 3 4)))

(partition 2 (seq #{10 30 40 50}))

(partition 2 [1 2 3 5])

(partition 2 (seq [1 2 3 4 5 6]))
