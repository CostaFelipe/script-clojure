(ns lista-de-compras.core)

(defrecord ItemCompras [nome quantidade categoria status])

(defn criar-lista [] (atom []))

(defn adicionar-item [lista item]
  (swap! lista conj item))

(defn foo
  "I don't do a whole lot."
  [x]
  (println x "Hello, World!"))
