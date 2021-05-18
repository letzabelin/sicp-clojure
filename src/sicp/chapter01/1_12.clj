(ns sicp.chapter01.1-12)

(defn get-pascal-triangle-element [row-index col-index]
  (cond
    (or (neg? row-index) (neg? col-index) (>= col-index (inc row-index))) nil
    (or (zero? col-index) (= col-index row-index)) 1
    :else (+
           (get-pascal-triangle-element (dec row-index) (dec col-index))
           (get-pascal-triangle-element (dec row-index) col-index))))