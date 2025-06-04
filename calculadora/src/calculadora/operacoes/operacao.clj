(ns calculadora.operacoes.operacao)

(defn- valid-number? [a b]
  (and (number? a) (number? b)))

(defn- sum [a b]
  (+ a b))

(defn- sub [a b]
  (- a b))

(defn- mult [a b]
  (* a b))

(defn- div [a b]
  (if (zero? b)
    "Erro: divisão por zero"
    (/ a b)))

(defn- apply-operator [a b operator]
  (case operator
    :add (sum a b)
    :sub (sub a b)
    :mult (mult a b)
    :div (div a b)
    :not_exist))

(defn operation [a b operator]
  (if (valid-number? a b)
    (apply-operator a b operator)
    "Não pode colocar string"))
