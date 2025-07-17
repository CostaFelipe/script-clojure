(ns lista-de-compras.core)

(defrecord ItemCompra [nome quantidade preco categoria])

(defn criar-lista [] (atom []))

(defn adicionar-item [lista item]
  (swap! lista conj item))

(defn -main []
  (let [lista criar-lista]
    (adicionar-item lista (->ItemCompra "Arroz" 2 9.89 "Alimentos"))
    (adicionar-item lista (->ItemCompra "Feijão" 3 8.75 "Alimentos"))
    (adicionar-item lista (->ItemCompra "Sabonete" 5 2.50 "Higiene"))

    (doseq [item @lista]
      (println (str (:nome item) " - " (:quantidade item) " x R$ " (:preco item))))
    ))
