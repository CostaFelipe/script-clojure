(def de-para [{:de "a" :para "4"}
              {:de "e" :para "3"}
              {:de "i" :para "1"}
              {:de "o" :para "0"}])

(map :de de-para)

(clojure.string/replace "Felipe" "e" "1")

(defn conversor [texto dicionario]
  (let [conversao (first dicionario)]
    (clojure.string/replace texto
                            (:de conversao)
                            (:para conversao))))

(defn escrita-hacker [texto dicionario]
  (if (empty? dicionario)
    texto
    (escrita-hacker (conversor texto dicionario)
                    (rest dicionario))))

(escrita-hacker "alameda" de-para)
