(ns calculadora.operacoes.operacao)

(defn valid-number? [a b]
  (and (number? a) (number? b)))


(defn- sum [a b]
  (+ a b))

(defn apply-operator [a b operator]
  (case operator
    :add (sum a b)
    :sub (- a b)
    :mult (* a b)
    :div (/ a b)
    :not_exist))

(defn operation [a b operator]
  (if (valid-number? a b)
    (apply-operator a b operator)
    "Não pode colocar string"))
