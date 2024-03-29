(ns sicp.chapter01.1-10-test
  (:require [clojure.test :refer [deftest is]]
            [sicp.chapter01.1-10 :refer [ackermann f g h]]))

(deftest test-ackermann
  (is (= 1024 (ackermann 1 10)))
  (is (= 65536 (ackermann 2 4)))
  (is (= 65536 (ackermann 3 3))))

(deftest test-f
  (is (= 2 (f 1)))
  (is (= 4 (f 2)))
  (is (= 6 (f 3)))
  (is (= 8 (f 4)))
  (is (= 10 (f 5))))

(deftest test-g
  (is (= 2 (g 1)))
  (is (= 4 (g 2)))
  (is (= 8 (g 3)))
  (is (= 16 (g 4)))
  (is (= 32 (g 5))))

(deftest test-h
  (is (= 2 (h 1)))
  (is (= 4 (h 2)))
  (is (= 16 (h 3)))
  (is (= 65536 (h 4))))
