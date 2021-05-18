(ns sicp.chapter01.1-13-test
  (:require [clojure.test :refer [deftest is]]
            [sicp.chapter01.1-13 :refer [f fib]]))

(deftest test-solution
  (is (= (double (fib 1)) (Math/floor (f 1))))
  (is (= (double (fib 3)) (Math/floor (f 3))))
  (is (= (double (fib 8)) (Math/floor (f 8))))
  (is (= (double (fib 11)) (Math/floor (f 11)))))