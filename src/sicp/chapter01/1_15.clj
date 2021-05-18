(ns sicp.chapter01.1-15)

(defn cube [n]
  (* n n n))

(defn p [sin]
  (- (* 3 sin)
     (* 4
        (cube sin))))

(defn sine [angle]
  (if (not (> (Math/abs angle) 0.1))
    angle
    (p (sine (/
              angle
              3.0)))))