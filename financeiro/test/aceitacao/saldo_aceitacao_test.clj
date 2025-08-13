(ns saldo-aceitacao-test
  (:require [midje.sweet :refer :all]
   [financeiro.handler :refer[app]]
   [ring.adapter.jetty :refer [run-jetty]]
            [clj-http.client :as http]))

(def servidor (atom nil))

(defn iniciar-servidor [porta]
  (swap! servidor
         (fn [_] (run-jetty app {:port porta :join? false}))))

(defn parar-servidor []
  (.stop @servidor))

(def porta-padrao 3001)

(defn endereco-para [rota]
  (str "http://localhost:" porta-padrao rota))

(def requisicao-para (comp http/get endereco-para))

(defn conteudo [rota] (:body (requisicao-para rota)))

(against-background [(before :facts (iniciar-servidor porta-padrao))
                     (after :facts (parar-servidor))]
 (fact "O saldo inicial é 0" :aceitacao
      (conteudo "/saldo") => "0"))
