(ns sicp.chapter01.1-11)

(defn recursive-f [n]
  (if (< n 3)
    n
    (+ (recursive-f (dec n))
       (recursive-f (- n 2))
       (recursive-f (- n 3)))))

(defn iterative-f [n]
  (loop [a 2 b 1 c 0 count n]
    (if (zero? count)
      c
      (recur (+ a b c)
             a
             b
             (dec count)))))