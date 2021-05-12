(ns sicp.chapter01.1_02_test
  (:require [clojure.test :refer [deftest is]]
            [sicp.chapter01.1_02 :refer [solution]]))

(deftest test-asserts
  (is (= -37/150 solution)))