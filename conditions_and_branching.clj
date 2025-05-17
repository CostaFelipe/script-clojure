;;if

(let [a 5]
  (if (> a 0)
    (println "is positive")
    (println "tirando error")))

(let [a -5]
  (if (> a 0)
    (println "is positive")
    (println "is negative")))

(let [a 0]
  (if (> a 0)
    (println "is positive")
    (if (< a 0)
      (println "is negative")
      (println "is neither positive nor negative"))))

(defn verificar-idade [idade]
  (if (>= idade 18)
    "maior idade"
    "menor idade"))

;;do
(let [a -700]
  (if (> a 0)
    (do
      (println a "is positive")
      (println "There are infinite positive numbers"))
    (do
      (println a "is negative")
      (println "the are infinite negative numbers"))))

(defn inicializar-sistema []
  (do
    (println "Carregar configuração...")
    (println "conectar ao banco de dados")
    "Sistema inicializado com sucesso"))

;;when
(def usuario {:name "Jhon doe" :email "teste@gmail.com"})

(defn salvando-usuario [usuario]
  (println "Salvando usuario" (:name usuario)) )

(defn registrar-usuario [usuario]
  (when (:email usuario)
     (println "Enviando email de boas vindas")
     (println (salvando-usuario usuario))
     true))

(registrar-usuario usuario)


;;cond

(let [number 5]
  (cond
    (> number 0) (println number "is positive")
    (< number 0) (println number "is negative")
    :else (println "is neither positive nor negative")
    ))

(defn classificar-temperatura [temp]
  (cond
    (< temp 0) "Congelante"
    (< temp 15) "Frio"
    (< temp 25) "Agradável"
    (< temp 35) "Quente"
    :else "Muito Quente"
    ))

(defn avaliar-desempenho [nota]
  (cond
    (>= nota 90) "Excelente"
    (>= nota 80) "Muito bom"
    (>= nota 70) "Bom"
    (>= nota 60) "Regular"
    :else "Insuficiente"))

(classificar-temperatura 15)
(avaliar-desempenho 100)

 (comment
   comment
     (verificar-idade 17)
     (inicializar-sistema))
