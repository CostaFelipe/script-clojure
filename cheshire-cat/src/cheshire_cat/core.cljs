(ns cheshire-cat.core
  (:require [clojure.browser.repl :as repl]))

(defn ^:export init []
  (repl/connect "http://localhost:9000/repl")
  (js/alert "This is a browser connected REPL"))
