(defproject recursion "1.0.0-SNAPSHOT"
  :dependencies [[org.clojure/clojure "1.5.1"]
                 [iloveponies.tests/recursion "0.1.0-SNAPSHOT"]
                 [org.clojure/math.numeric-tower "0.0.4"]]
  :profiles {:dev {:plugins [[lein-midje "3.1.1"]]}})
