(ns sicp.chapter01.1_04)

(defn solution [a b]
  ((if (> b 0) + -) a b))