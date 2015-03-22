(defproject gsnewmark/ring-pratchett "0.1.0"
  :description "A Ring middleware that adds X-Clacks-Overhead header to the response"
  :url "https://github.com/gsnewmark/ring-pratchett"
  :license {:name "Eclipse Public License"
            :url "http://www.eclipse.org/legal/epl-v10.html"}
  :dependencies [[org.clojure/clojure "1.4.0"]]
  :profiles
  {:dev {:dependencies [[ring/ring-mock "0.2.0"]]}
   :1.5 {:dependencies [[org.clojure/clojure "1.5.1"]]}
   :1.6 {:dependencies [[org.clojure/clojure "1.6.0"]]}
   :1.7 {:dependencies [[org.clojure/clojure "1.7.0-alpha5"]]}})
