(ns sicp.chapter01.1_03_test
  (:require [clojure.test :refer [deftest is]]
            [sicp.chapter01.1_03 :refer [solution]]))

(deftest test-asserts
  (is (= 13 (solution 1 2 3))))