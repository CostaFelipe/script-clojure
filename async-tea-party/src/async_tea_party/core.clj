(ns async-tea-party.core
  (:require [clojure.core.async :as async]))

(def tea-channel (async/chan))

(defn foo
  "I don't do a whole lot."
  [x]
  (println x "Hello, World!"))
