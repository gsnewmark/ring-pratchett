# gtp

An example of `wrap-pratchett` middleware usage.

## Usage

Run the application using

```
lein run
```

and test using `curl` (or a similar tool):

```
$ curl -v -X GET http://localhost:8080/

> GET / HTTP/1.1
> User-Agent: curl/7.41.0
> Host: localhost:8080
> Accept: */*
>
< HTTP/1.1 200 OK
< Date: Sun, 22 Mar 2015 13:27:13 GMT
< X-Clacks-Overhead: GNU Terry Pratchett
< Content-Type: text/html
< Content-Length: 0
< Server: Jetty(7.6.13.v20130916)
<
```
