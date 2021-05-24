(ns sicp.chapter01.1-16
  (:require [sicp.helpers :refer [square]]))

(defn fast-expt-recursive [base power]
  (cond
    (zero? power) 1
    (even? power) (square (fast-expt-recursive base
                                               (/ power 2)))
    :else (* base (fast-expt-recursive base
                                       (dec power)))))

(defn fast-expt-iterative [base power]
  (loop [acc 1 b base p power]
    (cond
      (zero? p) acc
      (even? p) (recur acc
                       (square b)
                       (/ p 2))
      :else (recur (* acc b)
                   b
                   (dec p)))))
