(ns sicp.chapter01.1-14-test
  (:require [clojure.test :refer [deftest is]]
            [sicp.chapter01.1-14 :refer [get-changes-count]]))

(deftest test-get-changes-count
  (is (= 292 (get-changes-count 100)))
  (is (= 4 (get-changes-count 11))))