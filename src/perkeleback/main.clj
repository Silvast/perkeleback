(ns perkeleback.main
  (:require [com.stuartsierra.component :as component]
            [reloaded.repl :refer [set-init! go]])
  (:gen-class))

(defn -main [& [port]]
  (let [port (or port 3000)]
    (require 'perkeleback.system)
    (set-init! #((resolve 'perkeleback.system/new-system) {:http {:port port}}))
    (go)))
