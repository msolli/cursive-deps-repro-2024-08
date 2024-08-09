(ns build
  (:require [my-dep.foo :as foo]))

(defn build [opts]
  (foo/bar))
