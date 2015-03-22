(ns ring.middleware.pratchett-test
  (:require [ring.middleware.pratchett :refer :all]
            [clojure.test :refer :all]
            [ring.mock.request :as mock]))

(deftest includes-correct-x-clacks-overhead-header
  (let [response {:status 200, :headers {}, :body "GNU Terry Pratchett"}
        handler (wrap-pratchett (constantly response))]
    (is (contains? (:headers (handler (mock/request :get "/")))
                   "X-Clacks-Overhead"))
    (is (= (get-in (handler (mock/request :get "/")) [:headers "X-Clacks-Overhead"])
           "GNU Terry Pratchett"))))
