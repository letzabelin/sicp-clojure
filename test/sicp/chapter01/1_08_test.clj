(ns sicp.chapter01.1-08-test
  (:require [clojure.test :refer [deftest is]]
            [sicp.chapter01.1-08 :refer [cbrt]]))

(deftest test-cbrt
  (is (= 2.0 (cbrt 8)))
  (is (= 3.0 (cbrt 27)))
  (is (= 4.0 (cbrt 64)))
  (is (= 5.0 (cbrt 125)))
  (is (= 6.0 (cbrt 216)))
  (is (= 7.0 (cbrt 343)))
  (is (= 8.0 (cbrt 512)))
  (is (= 9.0 (cbrt 729))))