(ns calculadora.core
  (:gen-class)
  (:require [calculadora.operacoes.operacao :refer :all]))

(comment
  (operation 100 1 :add)
  )

(defn -main
  [& args]
  (println (operation 100 1 :add)))
