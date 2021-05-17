(ns sicp.chapter01.1-10)

(defn ackermann
  [x y]
  (cond
    (zero? y) 0
    (zero? x) (* 2 y)
    (= y 1)   2
    :else (ackermann (dec x)
                     (ackermann x
                                (dec y)))))

(defn f [n]
  (ackermann 0 n))

(defn g [n]
  (ackermann 1 n))

(defn h [n]
  (ackermann 2 n))