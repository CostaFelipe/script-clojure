;;data
(def transacoes
  [{:valor 33.0M :tipo "despesa" :comentario "almoço" :moeda "R$" :data "20/03/2025"}
   {:valor 2700.0M :tipo "receita" :comentario "bico" :moeda "R$" :data "21/03/2025"}
   {:valor 89.9M :tipo "despesa" :comentario "Livro golang" :moeda "R$" :data "20/04/2025"}])

(def cotacoes
  {:yuan {:cotacao 2.15M :simbolo "¥"}
   :euro {:cotacao 6.49M :simbolo "€"}})

;;functions
(defn resumo [transacao]
  (select-keys transacao [:valor :tipo :data]))

(defn despesa? [transacao]
  (= (:tipo transacao) "despesa"))

(defn so-valor [transacao]
  (:valor transacao))

(defn valor-grande? [transacao]
  (> (:valor transacao) 100))

(defn valor-sinalizado [transacao]
  (let [moeda (:moeda transacao "R$")
        valor (:valor transacao)]
    (if (= (:tipo transacao) "despesa")
      (str moeda " -" valor)
      (str moeda " +" valor))))

(defn data-valor [transacao]
  (str (:data transacao) " => " (valor-sinalizado transacao)))

(defn transacao-em-yuan [transacao]
  (let [{{cotacao :cotacao simbolo :simbolo} :yuan} cotacoes]
    (assoc transacao :valor (* cotacao (:valor transacao))
           :moeda simbolo)))

(defn texto-resumo-em-yuan [transacao]
  (-> (transacao-em-yuan transacao)
      (data-valor)))

(defn transacao-em-outra-moeda [moeda transacao]
  (let [{{cotacao :cotacao simbolo :simbolo} moeda} cotacoes]
    (assoc transacao :valor (* cotacao (:valor transacao))
                     :moeda simbolo)))

;;executing

(map resumo transacoes)

(so-valor (first transacoes))

(filter despesa? transacoes)

(map so-valor (filter despesa? transacoes))

(filter valor-grande? transacoes)

(-> (first transacoes) (so-valor))

(->> (filter despesa? transacoes)
     (map so-valor)
     (reduce +))

;;bricando de acesso
(:cotacao (:euro cotacoes))
(:simbolo (:euro cotacoes))

;;aplicando destructions
(let [euro (:euro cotacoes)]
  (:simbolo euro))

(let [yuan (:yuan cotacoes)]
  (:cotacao yuan))

(reduce + (map so-valor (filter despesa? transacoes)))

(valor-sinalizado (first transacoes))

(map valor-sinalizado transacoes)

(def transacao-aleatoria {:valor 99.0})

(valor-sinalizado transacao-aleatoria)

(data-valor (first transacoes))

(map data-valor transacoes)

(transacao-em-yuan (first transacoes))

(data-valor (transacao-em-yuan (first transacoes)))

(map texto-resumo-em-yuan transacoes)

;;(def texto-resumo-em-yuan (comp data-valor transacao-em-yuan))
;;(map texto-resumo-em-yuan transacoes)

(transacao-em-outra-moeda :euro (last transacoes))
(transacao-em-outra-moeda :yuan (first transacoes))
