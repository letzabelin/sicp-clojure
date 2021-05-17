(ns sicp.chapter01.1-11-test
  (:require [clojure.test :refer [deftest is]]
            [sicp.chapter01.1-11 :refer [recursive-f iterative-f]]))

(deftest test-recursive-f
  (is (= 2 (recursive-f 2)))
  (is (= 6 (recursive-f 4)))
  (is (= 230 (recursive-f 10))))

(deftest test-iterative-f
  (is (= 2 (iterative-f 2)))
  (is (= 6 (iterative-f 4)))
  (is (= 230 (iterative-f 10))))
