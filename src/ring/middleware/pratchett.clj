(ns ring.middleware.pratchett)

(defn wrap-pratchett
  "Middleware that adds X-Clacks-Overhead header to the response"
  [handler]
  (let [header "X-Clacks-Overhead"
        header-value "GNU Terry Pratchett"]
    (fn [request]
      (when-let [response (handler request)]
        (assoc-in response [:headers header] header-value)))))
