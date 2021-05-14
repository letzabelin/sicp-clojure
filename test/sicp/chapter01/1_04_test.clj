(ns sicp.chapter01.1_04_test
  (:require [clojure.test :refer [deftest is]]
            [sicp.chapter01.1_04 :refer [solution]]))

(deftest test-asserts
  (is (= 7 (solution 3 4)))
  (is (= 15 (solution 10 -5))))