(ns sicp.chapter01.compute-square-root
  (:require [sicp.helpers :refer [square]]))

; From 1.1.17
(defn average
  [x y]
  (/ (+ x y) 2))

(defn get-quotient
  [guess root]
  (/ root guess))

(defn good-enough?
  [guess root]
  (< (Math/abs (- (square guess)
                  root))
     0.001))

(defn improve
  [guess root]
  (average
   (get-quotient guess root)
   guess))

; example from book
(defn compute-square-root
  [guess root]
  (if (good-enough? guess root)
    guess
    (compute-square-root (improve guess root)
                         root)))

(defn sqrt
  [root]
  (loop [guess 1.0]
    (if (good-enough? guess root)
      guess
      (recur (improve guess root)))))
