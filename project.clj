(defproject perkeleback "0.1.0-SNAPSHOT"
  :description "FIXME: write description"
  :dependencies [[org.clojure/clojure "1.8.0"]
                 [http-kit "2.1.19"]
                 [com.stuartsierra/component "0.3.1"]
                 [reloaded.repl "0.2.2"]
                 [metosin/palikka "0.5.1"]
                 [metosin/kekkonen "0.3.2"]
                 [metosin/ring-swagger "0.22.11"]
                 [clojurewerkz/neocons "3.1.0"]]
   :main perkeleback.main
  :profiles {:uberjar {:aot [perkeleback.main]
                       :main perkeleback.main
                       :uberjar-name "perkeleback.jar"}})
