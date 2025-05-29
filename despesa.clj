(def transacoes
  [{:valor 33.0 :tipo "despesa" :comentario "almoço" :data "20/03/2025"}
   {:valor 2700.0 :tipo "receita" :comentario "bico" :data "21/03/2025"}
   {:valor 89.9 :tipo "despesa" :comentario "Livro golang" :data "20/04/2025"}])

(defn resumo [transacao]
  (select-keys transacao [:valor :tipo]))

(map resumo transacoes)
