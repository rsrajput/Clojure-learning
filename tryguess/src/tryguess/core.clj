(ns tryguess.core
  (:gen-class))

(defn -main
  []
  (println "welcome to guessing game.")
  (println "Keep guessing number between 0 & 100")
  (let [answer (rand-int 100) tries 7 ]
    (loop [n tries] 
      (when (pos? n)
            (println "tries remaining:" n)
            (println "Enter your guess: ")
            (let [guess (Integer/parseInt (read-line))]
              (cond
                (= guess answer) (println "correct")
                (< guess answer) (println "too low!")
                (> guess answer) (println "too high!")
                :else (println "Something's wrong"))))
          (recur (dec n)))
    (println "The answer is" answer)))
