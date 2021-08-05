(ns sicp.chapter01.1-19)

(defn fib [power]
  (loop [a 1
         b 0
         p 0
         q 1
         count power]
    (cond
      (zero? count) b
      (even? count) (recur a
                           b
                           ()
                           ()
                           (/ count 2))
      :else (recur (+ (* b q) (* a q) (* a p))
                   (+ (* b p) (* a q))
                   p
                   q
                   (dec count)))))
