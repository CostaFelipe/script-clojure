(require '[clojure.string :as str])

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

;; TODO: Calcule o salário total de todos os usuários
(def total-salary (reduce + (map :salary users)))
total-salary

(def person {:name "Carlos" :age 35})

;; TODO: Adicione um campo :city com valor "São Paulo"
(def with-city (assoc person :city "São Paulo"))
with-city

;; TODO: Atualize a idade para ser 1 ano maior
(def one-year-older (update person :age inc))
one-year-older

;; TODO: Adicione o campo :job com valor "Programador"
(def with-job (assoc person :job "Programador"))
with-job

(def alphabet (seq "abcdefghijklmnopqrstuvwxyz"))

;; TODO: Pegue as primeiras 5 letras
(def first-five (take 5 alphabet))
first-five

;; TODO: Descarte as primeiras 20 letras e pegue o resto
(def last-letters (drop 20 alphabet))
last-letters

;; TODO: Pegue letras enquanto forem anteriores a 'j' no alfabeto
(def before-j (take-while #(not (= % \j)) alphabet))
before-j

;; TODO: Descarte letras enquanto forem anteriores a 'x' no alfabeto
(def last-few (drop-while #(not (= % \x)) alphabet))
last-few

(def more-users
  [{:name "Carlos" :department "TI" :salary 450000}
   {:name "Ana" :department "RH" :salary 380000}
   {:name "Pedro" :department "TI" :salary 500000}
   {:name "Maria" :department "Marketing" :salary 420000}
   {:name "João" :department "RH" :salary 390000}])

;; TODO: Agrupe os usuários por departamento
(def users-by-department (group-by :department more-users))
users-by-department

;; TODO: Agrupe os números pela sua paridade (par/ímpar)
(def users-by-parity (group-by (fn [acc]
                                   (if (even? (count acc)) :even :odd)) (map :name more-users)))
users-by-parity

(def numbers-by-parity (group-by (fn [x] (if (even? x) :even :odd)) numbers))
numbers-by-parity

;; TODO: Agrupe os usuários originais por faixa salarial (abaixo de 450000 e acima)
(def users-by-salary (group-by (fn [user]
                                 (if (> 450000 (:salary user)) "Abaixo de 450000" "Acima de 450000"))
                               more-users))
users-by-salary

;; TODO: Crie uma função que dobre um número e depois some 10
(def double-then-add-10 (comp (partial + 10)))
double-then-add-10

;; TODO: Crie uma função que filtre apenas usuários com salário acima de 400000
(def high-earners (partial filter #(> (or (:salary %) 0) 400000)))
(high-earners more-users)

;; TODO: Crie uma função que receba um nome e retorne uma saudação "Olá, Maria!"
(def hello (partial str "Hello,"))
(hello "Maria")

;; TODO: Crie uma função que retorne um vetor com o primeiro e o último elemento de uma coleção
(def first-and-last ((juxt first last) numbers))
first-and-last

;; TODO: Crie uma função que retorne um vetor com o nome e a idade de um usuário
(def name-and-age
  ((juxt :name :age) person))

name-and-age

;; TODO: Use threading macro para transformar uma lista de números:
;; 1. Filtre apenas os números pares
;; 2. Multiplique cada um por 3
;; 3. Pegue apenas os 5 primeiros resultados
(def processed-numbers
  (->> [1 2 3 4 5 6 7 8 9 10 11 12 13 14 15]
       (filter even?)
       (map (partial * 3))
       (take 5)
       ))

processed-numbers

;; TODO: Use threading macro para processar uma string:
;; 1. Converta para minúsculas
;; 2. Substitua espaços por hífens
;; 3. Pegue apenas os primeiros 10 caracteres
(def slug
  (-> "Este é um Titulo de Artigo"
       (str/lower-case)
       (str/replace #" " "-")
       (subs 0 10)))

slug

(def keys-k [:a :b :c :d])

(def vals-v [1 2 3 4])

;; TODO: Crie um mapa combinando as chaves com os valores
(def combined (zipmap keys-k vals-v))
combined

;; TODO: Crie um mapa onde as chaves são os nomes dos usuários e os valores são suas idades
(def name-to-age (zipmap (map :name users) (map :age users)))
name-to-age

;; TODO: Crie uma função que retorne um mapa com as chaves :min, :max e :count de uma coleção de números
(def stats (comp (partial zipmap [:min :max :count])
                 (juxt (partial apply min) (partial apply max) count)))

(stats numbers)

;; TODO: Divida a sequência em grupos de 3 elementos
(def group-of-three (partition 3 numbers))
group-of-three

;; TODO: Agrupe números consecutivos com o mesmo sinal (positivo/negativo)
(def by-sign (partition-by #(compare % 0) [1 2 3 -1 -2 0 1 2 -5 -6]))
by-sign
