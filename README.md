# ring-pratchett

A [Ring](https://github.com/ring-clojure/ring) middleware that adds
`X-Clacks-Overhead` header to each response.

Inspired by [this thread](http://redd.it/2yt9j6) on reddit and
[rack-pratchett gem](https://github.com/wonderbread/rack-pratchett).

## Install

Add the following dependency to your `project.clj`:

```
[gsnewmark/ring-pratchett "0.1.0"]
```

## Usage

Middleware doesn't accept any options, so simply add it to your application
middleware stack:

```clojure
(ns ring.app
  (:require [ring.middleware.pratchett :refer [wrap-pratchett]]))

(def handler)

(def app
  (-> handler
      wrap-pratchett))
```

Detailed example could be found in the `examples/gtp`.

## License

Copyright © 2015 Ivan Kryvoruchko

Distributed under the Eclipse Public License either version 1.0 or (at
your option) any later version.
