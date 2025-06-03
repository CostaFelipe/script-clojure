(defn gerar-valores []
  (* (rand-int 100001) 0.01M))

(defn gerador-de-tipo []
  (rand-nth ["despesa" "receita"]))

(defn transacao-aleatoria []
  {:valor (gerar-valores)
   :tipo (gerador-de-tipo)})

(def transacoes-aleatorias
  (repeatedly transacao-aleatoria))

(take 5 transacoes-aleatorias)
