(ns sicp.chapter01.1-15-test
  (:require [clojure.test :refer [deftest is]]
            [sicp.chapter01.1-15 :refer [sine]]))

(deftest test-sine
  (is (true? (< (Math/abs (- (Math/sin 12.5)
                             (sine 12.5)))
                0.1))))