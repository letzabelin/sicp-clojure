(ns sicp.chapter01.1-08
  (:require [sicp.helpers :refer [square]]))

(defn improve
  [guess root]
  (/
   (+ (/ root (square guess))
      (* 2 guess))
   3))

(defn good-enough?
  [prev-guess current-guess]
  (< (Math/abs (- prev-guess
                  current-guess))
     0.0000001))

(defn cbrt
  [root]
  (loop [prev-guess 0.0 guess 1.0]
    (if (good-enough? prev-guess guess)
      guess
      (recur guess (improve guess root)))))