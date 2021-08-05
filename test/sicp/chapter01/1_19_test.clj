(ns sicp.chapter01.1-19-test
  (:require [clojure.test :refer [deftest is]]
            [sicp.chapter01.1-19 :refer [fib]]))

(deftest test-fib
  (is (= 0 (fib 0)))
  (is (= 1 (fib 1)))
  (is (= 1 (fib 2)))
  (is (= 21 (fib 8)))
  (is (= 6765 (fib 20))))
