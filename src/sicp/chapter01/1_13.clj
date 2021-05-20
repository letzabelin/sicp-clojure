(ns sicp.chapter01.1-13)

(defn fib [n]
  (loop [first 0 second 1 count n]
    (if (zero? count)
      first
      (recur (+ first second)
             first
             (dec count)))))

(defn f [n]
  (let [sqrt-of-five (Math/sqrt 5.0)]
    (/ (-
        (Math/pow (/ (+ 1 sqrt-of-five)
                     2)
                  n)
        (Math/pow (/ (- 1 sqrt-of-five)
                     2)
                  n))
       sqrt-of-five)))
