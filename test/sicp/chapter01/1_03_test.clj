(ns sicp.chapter01.1-03-test
  (:require [clojure.test :refer [deftest is]]
            [sicp.chapter01.1-03 :refer [sum-of-squares]]))

(deftest test-asserts
  (is (= 13 (sum-of-squares 1 2 3)))
  (is (= 113 (sum-of-squares 7 8 5))))
