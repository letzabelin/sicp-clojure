(ns sicp.chapter01.1-14)

(defn get-first-denomination [kinds-of-coins]
  (cond
    (= kinds-of-coins 1) 1
    (= kinds-of-coins 2) 5
    (= kinds-of-coins 3) 10
    (= kinds-of-coins 4) 25
    (= kinds-of-coins 5) 50))

(defn cc [amount kinds-of-coins]
  (cond
    (zero? amount) 1
    (or (zero? kinds-of-coins)
        (neg? amount)) 0
    :else (+ (cc amount
                 (dec kinds-of-coins))
             (cc (- amount
                    (get-first-denomination kinds-of-coins))
                 kinds-of-coins))))

(defn get-changes-count [amount]
  (cc amount 5))