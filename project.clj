(defproject me.raynes/fs "1.4.6"
  :description "File system utilities for clojure"
  :license {:name "Eclipse Public License - v 1.0"
            :url "http://www.eclipse.org/legal/epl-v10.html"}
  :url "https://github.com/Raynes/fs"
  :dependencies [[org.clojure/clojure "1.8.0"]
                 [org.apache.commons/commons-compress "1.13"]
                 [org.tukaani/xz "1.6"]]

  :plugins [[lein-midje "3.1.3"]
            [codox "0.8.10"]
            [lein-ancient "0.6.10"]]

  :codox {:src-dir-uri "https://github.com/Raynes/fs/blob/master/"
          :src-linenum-anchor-prefix "L"
          :defaults {:doc/format :markdown}}
  :deploy-repositories {"releases" :clojars}
  :profiles {:dev {:dependencies [[midje "1.8.3"]]}})
