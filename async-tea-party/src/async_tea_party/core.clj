(ns async-tea-party.core
  (:require [clojure.core.async :as async]))

(def google-tea-service-chan (async/chan 10))
(def yahoo-tea-service-chan (async/chan 10))

(def tea-channel (async/chan 10))

(def milk-channel (async/chan 10))

(def sugar-channel (async/chan 10))

(defn random-add []
  (reduce + (conj [] (repeat 1 (rand-int 100000)))))

(defn request-google-tea-service []
  (async/go
    (random-add)
    (async/>! google-tea-service-chan
              "tea compliments of google")))

(defn request-yahoo-tea-service []
  (async/go
    (random-add)
    (async/>! yahoo-tea-service-chan
             "tea compliments of yahoo")))

(defn request-tea []
  (request-google-tea-service)
  (request-yahoo-tea-service)
  (async/go (let [[v] (async/alts!
                       [google-tea-service-chan
                        yahoo-tea-service-chan])]
              (println v))))

(request-tea)

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
