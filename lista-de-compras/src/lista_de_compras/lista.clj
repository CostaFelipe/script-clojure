(ns lista-de-compras.lista)

(defrecord ItemCompra [nome quantidade preco categoria])

(defrecord Categoria [nome])

(defonce criar-lista (atom []))

(defonce lista-categoria
  [(->Categoria "Cereal")
   (->Categoria "Frutas")
   (->Categoria "Higiene")])

(defn adicionar-item [lista item]
  (swap! lista conj item))

(defn calcular-valor-item [item]
  (* (:quantidade item) (:preco item)))

(defn valor-total[item]
  (->> item
       (map calcular-valor-item)
       (reduce +)))
  ;(reduce + (map calcular-valor-item item)))

(defn remover-item-lista [lista nome]
  (swap! lista (fn [items]
                 (filterv #(not= :nome %) nome) items)))

(defn agrupar-por-categoria [lista]
  (group-by :categoria lista))

(defn get-all-items []
  @criar-lista)

(defn tem-item-above? [items nome]
  (some #(= (:nome %) nome) items))

(defn -main []
  (let [lista criar-lista]
    (adicionar-item lista (->ItemCompra "Arroz" 2 9.89 "Alimentos"))
    (adicionar-item lista (->ItemCompra "Feijão" 3 8.75 "Alimentos"))
    (adicionar-item lista (->ItemCompra "Sabonete" 5 2.50 "Higiene"))

    @lista

    (calcular-valor-item (@lista 1))
    (valor-total @lista)))
