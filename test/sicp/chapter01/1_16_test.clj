(ns sicp.chapter01.1-16_test
  (:require [clojure.test :refer [deftest is]]
            [sicp.chapter01.1-16 :refer [fast-expt-recursive fast-expt-iterative]]))

(deftest test-fast-expt-recursive
  (is (= 4 (fast-expt-recursive 2 2)))
  (is (= 32 (fast-expt-recursive 2 5)))
  (is (= 512 (fast-expt-recursive 2 9)))
  (is (= 1024 (fast-expt-recursive 2 10)))
  (is (= 9 (fast-expt-recursive 3 2)))
  (is (= 81 (fast-expt-recursive 3 4)))
  (is (= 243 (fast-expt-recursive 3 5)))
  (is (= 19683 (fast-expt-recursive 3 9)))
  (is (= 59049 (fast-expt-recursive 3 10))))

(deftest test-fast-expt-iterative
  (is (= 4 (fast-expt-iterative 2 2)))
  (is (= 32 (fast-expt-iterative 2 5)))
  (is (= 512 (fast-expt-iterative 2 9)))
  (is (= 1024 (fast-expt-iterative 2 10)))
  (is (= 9 (fast-expt-iterative 3 2)))
  (is (= 81 (fast-expt-iterative 3 4)))
  (is (= 243 (fast-expt-iterative 3 5)))
  (is (= 19683 (fast-expt-iterative 3 9)))
  (is (= 59049 (fast-expt-iterative 3 10))))
