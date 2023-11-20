(ns podman-basic
  (:require [monkey.ci.build.core :as c]))

(def simple-container
  {:container/image "docker.io/alpine:latest"
   :script ["echo Hello > output.txt"]})

(c/defpipeline build
  [simple-container])

[build]
