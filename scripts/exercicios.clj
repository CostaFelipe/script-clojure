(def users
  [{:name "田中" :age 25 :salary 400000}
   {:name "佐藤" :age 30 :salary 500000}
   {:name "鈴木" :age 28 :salary 450000}])

;;Crie uma lista apenas de nomes
(def names (map :name users))
names

;Crie uma lista de usuários cuja renda anual aumentou 1,1 vezes (aumento salarial)
(def with-raise (map #(* (:salary %) 1.1M) users))
with-raise

;Por favor, escreva sua autoapresentação (por exemplo, "Sr. Tanaka (25 anos)")
(def introductions (map #(str (:name %) "さん" " (" (:age %) "歳)") users))
introductions

(def numbers [1 2 3 4 5 6 7 8 9 10])

;; TODO: Filtre apenas os números pares
(def even-numbers (filter even? numbers))
even-numbers

;; TODO: Remova os números maiores que 5
(def small-numbers (remove #(< 5 %) numbers))
small-numbers

;;; TODO: Filtre usuários com mais de 25 anos
(def older-users (filter #(> (:age %) 25) users))
older-users

;; TODO: Calcule a soma de todos os números
(def sum (reduce + numbers))
sum

;; TODO: Concatene todos os nomes dos usuários em uma string separada por vírgulas
(def all-name (reduce (fn [acc name]
                        (if (empty? acc) name (str acc ", " name))) ""
                      (map :name users)))
all-name
