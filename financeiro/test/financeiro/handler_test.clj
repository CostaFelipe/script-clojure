(ns financeiro.handler-test
  (:require [midje.sweet :refer :all]
            [ring.mock.request :as mock]
            [financeiro.handler :refer :all]))

(facts "Dá um 'Hello World' na rota raiz"
       (fact "o status da resposta é 200"
             (let [response (app (mock/request :get "/"))]
               (:status response) => 200))

       (fact "o texto do corpo é 'Hello World'"
             (let [response (app (mock/request :get "/"))]
               (:body response) => "Hello World")))

(facts "Rota inválida não existe"
       (fact "o código de erro é 404"
             (let [response (app (mock/request :get "/invalid"))]
               (:status response) => 404)))
