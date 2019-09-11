(ns reveal.repl)

(def 🦄 '🦄)
(def 🥚 '🥚)
(def 🌽 '🌽)
(def 🥔 '🥔)
(def 🌈 '🌈)

(defn 🔥 [x]
  (case x
    🥚 '🍳
    🌽 '🍿
    🥔 '🍟
    🦄 '🌈
    x))
























(comment
  ;; Zahlen
  42
  1.3
  4/3

  ;; Strings
  "foo"
  (type "foo")

  ;; Characters
  \f
  (type \f)

  ;; Keywords, evaluieren zu sich selbst
  :foo
  (type :foo)

  ;; Symbole, referenzieren i.d.R. etwas anderes
  ;; `def` definiert global, `let` lokal
  (def x 42)
  x

  (let [y 21]
    y)
  y


  ;; Funktionen
  +
  (+ 1 2)
  (* 2 (inc 2))

  (def square1
    (fn [n]
      (* n n)))
  (square1 4)


  (defn square2
    [n]
    (* n n))
  (square2 4)

  (def square3 #(* % %))
  (square3 4)

  🔥

  ;; Lazy Sequences
  (set! *print-length* 20)

  (range)




  ;; Collections
  []
  (type [])

  '()

  (def mymap
    #{"key" "value",
      :clojure :rocks})

  (get mymap "key")
  (get mymap :clojure)
  (get mymap :non-existent)

  (:clojure mymap)


  ;; Higher Order Functions -- Funktionen, die Funktionen als Parameter bekommen
  map

  (map inc [1 2 3])
  ;; => [(inc 1) (inc 2) (inc 3)]

  (apply + [1 2 3])
  ;; => (+ 1 2 3)

  (filter
    (fn [n] (not (= 0 (mod n 2))))
    (range 1 5))

  ;; Motto: There is a function for it...

  )

