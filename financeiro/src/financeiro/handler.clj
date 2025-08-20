(ns financeiro.handler
  (:require [compojure.core :refer :all]
            [compojure.route :as route]
            [cheshire.core :as json]
            [ring.middleware.defaults :refer [wrap-defaults site-defaults]]))

(defroutes app-routes
  (GET "/" [] "Hello World")
  (GET "/saldo" [] (json/generate-string {:saldo 0}))
  (route/not-found "Not Found"))

(def app
  (wrap-defaults app-routes site-defaults))
