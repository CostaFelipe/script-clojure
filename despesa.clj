(def transacoes
  [{:valor 33.0 :tipo "despesa" :comentario "almoço" :data "20/03/2025"}
   {:valor 2700.0 :tipo "receita" :comentario "bico" :data "21/03/2025"}
   {:valor 89.9 :tipo "despesa" :comentario "Livro golang" :data "20/04/2025"}])

(defn resumo [transacao]
  (select-keys transacao [:valor :tipo]))

(map resumo transacoes)

(defn despesa? [transacao]
  (= (:tipo transacao) "despesa"))

(defn so-valor [transacao]
  (:valor transacao))

(filter despesa? transacoes)

(map so-valor (filter despesa? transacoes))

(reduce + (map so-valor (filter despesa? transacoes)))

(defn valor-grande? [transacao]
  (> (:valor transacao) 100))

(filter valor-grande? transacoes)

(so-valor (first transacoes))

(-> (first transacoes) (so-valor))

(->> (filter despesa? transacoes)
     (map so-valor)
     (reduce +))
