;From a REPL, you want to read documentation for a function.
(doc conj)

(source reverse)

(find-doc #"defmacro")

(find-doc #"defn")

(source source)

(ns foo)

(doc +)

(use 'clojure.repl)

(doc +)

;You want to know what namespaces are loaded and what public vars are available inside them.
(pprint (loaded-libs))

(dir clojure.instant)

(ns-publics 'clojure.instant)
