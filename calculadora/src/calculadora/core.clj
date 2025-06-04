(ns calculadora.core
  (:gen-class)
  (:require [calculadora.operacoes.operacao :refer :all]))

(comment
  (operation 100 1 :add)
  (operation 10 5 :div)
  (operation 0 5 :div)
  (operation 5 0 :div)
  (operation 5 5 :mult)
  (operation 5 20 :sub)
  )

(defn -main
  [& args]
  (println "calculadora"))
