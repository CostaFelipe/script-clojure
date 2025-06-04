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

(= (take 5 transacoes-aleatorias) (take 5 transacoes-aleatorias))

;;macro lazy-seq
;;(cons (transacao-aleatoria) transacoes)

(defn aleatorias
  ([quantidade] (aleatorias quantidade 1 (list (transacao-aleatoria))))
  ([quantidade quantas-ja-foram transacoes]
   (if (= quantas-ja-foram quantidade)
     transacoes
     (recur quantidade (inc quantas-ja-foram)
            (cons (transacao-aleatoria) transacoes)))))

(aleatorias 4)

(time (class (aleatorias 900000)))

(defn aleatorias-lazy []
  (lazy-seq
   (cons (transacao-aleatoria) (aleatorias-lazy))))

(time (class (take 4 (aleatorias-lazy))))

(time (class (take 900000 (aleatorias-lazy))))

(take 4 (aleatorias-lazy))
