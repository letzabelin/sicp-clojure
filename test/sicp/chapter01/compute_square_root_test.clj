(ns sicp.chapter01.compute-square-root-test
  (:require [clojure.test :refer [deftest is]]
            [sicp.chapter01.compute-square-root :refer [sqrt]]
            [sicp.helpers :refer [square]]))

(deftest test-asserts
  (is (= 3.00009155413138 (sqrt 9)))
  (is (= 11.704699917758145 (sqrt (+ 100 37))))
  (is (= 1.7739279023207892 (sqrt (+ (sqrt 2) (sqrt 3)))))
  (is (= 1000.000369924366 (square (sqrt 1000)))))