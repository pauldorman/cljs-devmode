(defproject cljs-devmode "0.1.0-SNAPSHOT"
  :description "A development mode for ClojureScript"
  :url "https://github.com/maxweber/cljs-devmode"
  :dependencies [[org.clojure/clojure "1.2.1"]
                 [clj-http "0.1.3"]]
  :dev-dependencies [[compojure "0.6.5"]
                     [ring/ring-jetty-adapter "0.3.11"]
                     [lein-clojars "0.7.0"]]
  :repositories [["clojars" "http://clojars.org/repo"]]
  :license {:name "Eclipse Public License - v 1.0"
            :url "http://www.eclipse.org/legal/epl-v10.html"
            :distribution :repo
            :comments "same as Clojure"})
