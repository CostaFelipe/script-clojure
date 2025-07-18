(ns lista-de-compras.lista)

(defrecord ItemCompra [nome quantidade preco categoria])

(defonce criar-lista (atom []))

(defn adicionar-item [lista item]
  (swap! lista conj item))

(defn calcular-valor-item [item]
  (* (:quantidade item) (:preco item)))

(defn -main []
  (let [lista criar-lista]
    (adicionar-item lista (->ItemCompra "Arroz" 2 9.89 "Alimentos"))
    (adicionar-item lista (->ItemCompra "Feijão" 3 8.75 "Alimentos"))
    (adicionar-item lista (->ItemCompra "Sabonete" 5 2.50 "Higiene"))
    @lista

    (calcular-valor-item (@lista 1))

    ))
