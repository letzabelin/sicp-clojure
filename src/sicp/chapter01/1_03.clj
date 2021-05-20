(ns sicp.chapter01.1-03
  (:require [sicp.helpers :refer [square]]))

(defn sum-of-squares
  [x y z]
  (let [[_ second third] (sort [x y z])]
    (+ (square second) (square third))))
