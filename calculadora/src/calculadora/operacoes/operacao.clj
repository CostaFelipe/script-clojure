(ns calculadora.operacoes.operacao)

(def operadores
  {:add +
   :sub -
   :div /
   :mult *}
   )

(defn- valid-number? [a b]
  (and (number? a) (number? b)))

(defn- apply-operator [a b operator]
  (if (and (zero? 0) (= operator :div))
    "Error: Divide by zero"
    ((operator operadores) a b)))

(defn operation [a b operator]
  (if (valid-number? a b)
    (apply-operator a b operator)
    "Não pode colocar string"))
