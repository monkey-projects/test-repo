(ns podman-basic
  (:require [monkey.ci.build
             [core :as c]
             [shell :as s]]))

(def inspect
  (s/bash "ls -al"))

(def simple-container
  {:container/image "docker.io/alpine:latest"
   :script ["echo Hello > output.txt"]})

(c/defpipeline build
  [inspect
   simple-container])

[build]
