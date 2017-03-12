(defproject me.raynes/fs "1.4.6"
  :description "File system utilities for clojure"
  :license {:name "Eclipse Public License - v 1.0"
            :url "http://www.eclipse.org/legal/epl-v10.html"}

  :url "https://github.com/funcool/fs"

  :dependencies [[org.clojure/clojure "1.8.0" :scope "provided"]
                 [org.apache.commons/commons-compress "1.13"]
                 [org.tukaani/xz "1.6"]]

  :codox {:src-dir-uri "https://github.com/funcool/fs/blob/master/"
          :src-linenum-anchor-prefix "L"
          :defaults {:doc/format :markdown}}

  :deploy-repositories {"releases" :clojars}
  :profiles {:dev {:dependencies [[midje "1.8.3"]]
                   :plugins [[lein-midje "3.2.1"]
                             [codox "0.10.3"]
                             [lein-ancient "0.6.10"]]}})


