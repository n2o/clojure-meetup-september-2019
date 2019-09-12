(ns reveal.slides
  (:require [clojure.string :as string]))

(defn- section-with-title
  [title & htmls]
  (let [slugged (string/replace title #"\W" "")]
    [:section {:data-state slugged}
     [:style (str "." slugged " header span:after {content: \"" title "\";}")]
     htmls]))

;; ----------------------------------------------------------------------------

(def slide-1
  [:section {:data-state "footer"}
   [:div#title
    [:h3
     [:img {:style "height: 3em;" :src "img/clojure_logo.svg"}]
     [:br]
     "Clojure: Erste Schritte"]
    [:hr]
    [:p {:style "font-size: 0.8em"}
     [:strong "Christian Meter"]]
    [:small
     "Institut für Informatik" [:br]
     "Heinrich-Heine-Universität Düsseldorf" [:br] [:br]
     "meter@hhu.de" [:br]
     "@cmeter_"]]])

(def slide-2
  (section-with-title
    "Clojure ist..."
    [:p "funktional"]
    [:p "dynamisch typisiert"]
    [:p "auf der JVM gehostet"]
    [:p "ein Lisp-Dialekt"]))

(def slide-history
  (section-with-title
    "Geschichte von Clojure"
    [:div.row
     [:div.col-4 [:img {:alt "", :src "img/clojure_logo.svg"}]]
     [:div.col-8
      [:p "Öffentliches Release: Okt. 2007"]
      [:p "Aktuelle Version 1.10.1"]
      [:p "Extrem seriöse Entwicklung"]
      [:p "Nicht \"der neuste heiße Scheiß\" "]
      [:p.highlight "Trotzdem nicht langweilig"]]]))

(def slide-repl
  (section-with-title
    "To the REPL!"
    [:pre [:code ";; Die REPL -- ein mächtiges Werkzeug

(loop (print (eval (read))))"]]))

(def slide-links
  (section-with-title
    "Aufgaben"
    [:p "Vorbereitete Aufgaben mit Web-IDE" [:br]
     [:a {:href "https://github.com/clojuredus/clojure-coding-dojo"}
      "github.com/clojuredus/clojure-coding-dojo"]]
    [:p "Aufgaben im Browser, ohne Konfiguration:" [:br]
     [:a {:href "http://clojurescriptkoans.com/"}
      "ClojureScriptKoans"]]
    [:p "Grundlegende Aufgaben, um Clojure kennenzulernen:"
     [:a {:href "http://www.4clojure.com/"} "4clojure.com"]]
    ))

(defn all
  "Add here all slides you want to see in your presentation."
  []
  [slide-1
   slide-2
   slide-history
   slide-repl
   slide-links])
