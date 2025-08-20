(ns saldo-aceitacao-test
  (:require [midje.sweet :refer :all]
            [cheschire.core :as json]
    [auxiliares :refer :all]))

(against-background [(before :facts (iniciar-servidor porta-padrao))
                     (after :facts (parar-servidor))]
 (fact "O saldo inicial é 0" :aceitacao
      ;;(conteudo "/saldo")
       (json/parse-string (conteudo "/saldo")) => {:saldo 0}))
