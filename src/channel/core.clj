(ns channel.core
  (:gen-class))

;; Why do I want to rewrite this in clojure?
;;   $HOME/source/git/semiosis/pen.el/scripts/channel
;;   $EMACSD/pen.el/src/pen-channel.el
;; Because I want to use external prompt functions (i.e. the bash interop)
;; and I want to have a program loop which is independent of emacs.
;; This will be the main program loop. It may work directly with tmux.

(defn -main
  "I don't do a whole lot ... yet."
  [& args]
  (println "Hello, World!"))
