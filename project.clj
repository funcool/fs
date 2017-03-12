(defproject me.raynes/fs "1.5.0"
  :description "File system utilities for clojure"
  :license {:name "Eclipse Public License - v 1.0"
            :url "http://www.eclipse.org/legal/epl-v10.html"}

  :url "https://github.com/funcool/fs"

  :dependencies [[org.clojure/clojure "1.8.0" :scope "provided"]
                 [org.apache.commons/commons-compress "1.13"]
                 [org.tukaani/xz "1.6"]]

  :codeina {:sources ["src"]
            :reader :clojure
            :target "doc/dist/latest/api"
            :src-uri "http://github.com/funcool/fs/blob/master/"
            :src-uri-prefix "#L"}


  :deploy-repositories {"releases" :clojars}
  :profiles {:dev {:dependencies [[midje "1.8.3"]]
                   :plugins [[lein-midje "3.2.1"]
                             [funcool/codeina "0.5.0"]
                             [lein-ancient "0.6.10"]]}})


