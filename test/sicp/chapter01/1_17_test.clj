(ns sicp.chapter01.1-17-test
  (:require [clojure.test :refer [deftest is]]
            [sicp.chapter01.1-17 :refer [fast-mult-recursive fast-mult-iterative]]))

(deftest test-fast-mult-recursive
  (is (= 0 (fast-mult-recursive 10 0)))
  (is (= 0 (fast-mult-recursive 0 10)))
  (is (= 10 (fast-mult-recursive 10 1)))
  (is (= -10 (fast-mult-recursive -10 1)))
  (is (= 30 (fast-mult-recursive 10 3)))
  (is (= -30 (fast-mult-recursive 10 -3)))
  (is (= 30 (fast-mult-recursive -10 -3)))
  (is (= 100 (fast-mult-recursive 10 10))))

(deftest test-fast-mult-iterarative
  (is (= 0 (fast-mult-iterative 10 0)))
  (is (= 0 (fast-mult-iterative 0 10)))
  (is (= 10 (fast-mult-iterative 10 1)))
  (is (= -10 (fast-mult-iterative -10 1)))
  (is (= 30 (fast-mult-iterative 10 3)))
  (is (= -30 (fast-mult-iterative 10 -3)))
  (is (= 30 (fast-mult-iterative -10 -3)))
  (is (= 100 (fast-mult-iterative 10 10))))
