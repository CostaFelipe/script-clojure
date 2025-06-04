(defn teste-da-preguicao []
  (prn "Não deveria aparecer nada aqui") "Nada")

(defn um-oi [a b]
  "Oi")

(um-oi (teste-da-preguicao) (teste-da-preguicao))

(def transacoes
  [{:valor 33.0 :tipo "despesa" :comentario "Almoço" :moeda "R$" :data "19/11/2016"}
   {:valor 2700.0 :tipo "receita" :comentario "Bico" :moeda "R$" :data "01/12/2016"}
   {:valor 29.0 :tipo "despesa" :comentario "Livro de Clojure" :moeda "R$" :data "03/12/2016"}
   {:valor 45M :tipo "despesa" :comentario "Jogo no Steam" :moeda "R$" :data "26/12/2016"}])

(defn despesa? [transacao]
  (= (:tipo transacao) "despesa"))

(defn valor-sinalizado [transacao]
  (prn "Pegando o valor e a moeda da transacao" transacao)
  (let [moeda (:moeda transacao "R$")
        valor (:valor transacao)]
    (if (= (:tipo transacao) "despesa")
      (str moeda " -" valor)
      (str moeda " +" valor))))

(def despesa (filter despesa? transacoes))

(def valores (map valor-sinalizado transacoes))

(def transacao-aleatoria {:valor 9.0})

(valor-sinalizado transacao-aleatoria)

(filter despesa? transacoes)

(class (filter despesa? transacoes))

despesa

valores
