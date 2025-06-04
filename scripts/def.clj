(ns-name *ns*)

(def great-books ["Lord of Kings" "East of Eden" "The Glass Bead Game"])

(ns-interns *ns*)

(get (ns-interns *ns*) 'great-books)

(deref #'user/great-books)

great-books
