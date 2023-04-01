(ns chaldean.core
  (:gen-class) 
  (:require clojure.string))

(def chaldean-numbers
  {\a 1 \b 2 \c 3 \d 4 \e 5 \f 8 \g 3 \h 5 \i 1 \j 1 \k 2 \l 3 \m 4 \n 5 \o 7 \p 8 \q 1 \r 2 \s 3 \t 4 \u 6 \v 6 \w 6 \x 5 \y 1 \z 7})

(defn -main []
  (println "Please enter your name: ")
  (let [yname (read-line)]
  (println (reduce + (map #(get chaldean-numbers (Character/toLowerCase %)) yname)))))

