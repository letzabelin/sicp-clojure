(ns sicp.chapter01.1-04-test
  (:require [clojure.test :refer [deftest is]]
            [sicp.chapter01.1-04 :refer [a-plus-abs-b]]))

(deftest test-asserts
  (is (= 7 (a-plus-abs-b 3 4)))
  (is (= 15 (a-plus-abs-b 10 -5))))