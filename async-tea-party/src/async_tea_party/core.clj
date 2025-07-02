(ns async-tea-party.core
  (:require [clojure.core.async :as async]))

(def tea-channel (async/chan 10))

(def milk-channel (async/chan 10))

(def sugar-channel (async/chan 10))

(async/go-loop []
  (println "Thanks for the " (async/<! tea-channel))
  (recur))

(async/go-loop []
  (let [[v ch] (async/alts! [tea-channel
                             milk-channel
                             sugar-channel])]
    (println "Got " v " from " ch)
    (recur)))

(async/>!! sugar-channel :sugar)

(async/>!! milk-channel :milk)

(async/>!! tea-channel :tea)

(comment
  (async/>!! tea-channel :hot-cup-of-tea)
  (async/>!! tea-channel :tea-with-sugar))

(defn foo
  "I don't do a whole lot."
  [x]
  (println x "Hello, World!"))
