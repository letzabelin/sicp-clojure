(ns sicp.chapter01.1-11)

(defn recursive-f [n]
  (if (< n 3)
    n
    (+ (recursive-f (dec n))
       (recursive-f (- n 2))
       (recursive-f (- n 3)))))

(defn iterative-f [n]
  (loop [x 2 y 1 z 0 count n]
    (if (zero? count)
      z
      (recur (+ x y z)
             x
             y
             (dec count)))))