(ns sicp.chapter01.1_03
  (:require [sicp.helpers :refer [square]]))

(defn solution [x y z]
  (let [[_ second third] (sort [x y z])]
    (+ (square second) (square third))))