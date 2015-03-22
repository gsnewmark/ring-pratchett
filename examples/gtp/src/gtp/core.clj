(ns gtp.core
  (:require [ring.adapter.jetty :as t]
            [ring.middleware.pratchett :refer [wrap-pratchett]])
  (:gen-class))

(defn echo-handler [request]
  {:status 200
   :headers {"Content-Type" "text/html"}
   :body (or (:body request) "GNU Terry Pratchett")})

(def app
  (-> echo-handler
      wrap-pratchett))

(defn -main
  [& args]
  (t/run-jetty #'app {:port 8080}))
