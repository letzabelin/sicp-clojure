(ns sicp.chapter01.1-13-test
  (:require [clojure.test :refer [deftest is]]
            [sicp.chapter01.1-13 :refer [solution]]))

(deftest test-solution
  (is (= 1 (solution 1))))