(ns sicp.chapter01.1-02-test
  (:require [clojure.test :refer [deftest is]]
            [sicp.chapter01.1-02 :refer [solution]]))

(deftest test-asserts
  (is (= -37/150 solution)))
