(ns sicp.chapter01.1-17)

(defn dbl [n]
  (+ n n))

(defn halve [n]
  (/ n 2))

(defn fast-mult-recursive [multiplicand factor]
  (cond
    (zero? factor) 0
    (even? factor) (fast-mult-recursive (dbl multiplicand)
                                        (halve factor))
    (pos? factor) (+ multiplicand
                     (fast-mult-recursive (dbl multiplicand)
                                          (halve (dec factor))))
    :else (- (fast-mult-recursive (dbl multiplicand)
                                  (halve (inc factor)))
             multiplicand)))

(defn fast-mult-iterative [multiplicand factor]
  (loop [acc 0
         m multiplicand
         f factor]
    (cond
      (zero? f) acc
      (even? f) (recur acc
                       (dbl m)
                       (halve f))
      (pos? f) (recur (+ acc m)
                      (dbl m)
                      (halve (dec f)))
      :else (recur (- acc m)
                   (dbl m)
                   (halve (inc f))))))
