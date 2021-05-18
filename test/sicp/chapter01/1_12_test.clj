(ns sicp.chapter01.1-12-test
  (:require [clojure.test :refer [deftest is]]
            [sicp.chapter01.1-12 :refer [get-pascal-triangle-element]]))

(deftest test-get-pascal-triangle-element
  (is (=  1 (get-pascal-triangle-element 0 0)))
  (is (=  1 (get-pascal-triangle-element 1 0)))
  (is (=  1 (get-pascal-triangle-element 1 1)))
  (is (=  1 (get-pascal-triangle-element 2 0)))
  (is (=  2 (get-pascal-triangle-element 2 1)))
  (is (=  1 (get-pascal-triangle-element 2 2)))
  (is (=  6 (get-pascal-triangle-element 4 2)))
  (is (=  nil (get-pascal-triangle-element 1 2)))
  (is (=  nil (get-pascal-triangle-element 1 -2)))
  (is (=  nil (get-pascal-triangle-element -1 0))))