(ns guessing-game.core
  (:gen-class))

(defn guess-number []
  (let [answer (rand-int 100) ; generate a random integer between 0 and 99
        tries 7 ; set the maximum number of tries
        ]
    (loop [n tries]
      (when (pos? n) ; keep looping while there are still tries left
        (println "Guess a number between 0 and 99. You have " n " tries remaining.")
        (let [guess (read-line)
              guess-int (Integer/parseInt guess)]
          (cond
            (= guess-int answer)
            (println "Congratulations! You guessed the number.")
            (> guess-int answer)
            (println "Too high. Try again.")
            (< guess-int answer)
            (println "Too low. Try again.")
            :else
            (println "Invalid input. Try again.")))
        (recur (dec n))))
    (println "The answer was" answer ".")))


(defn -main
  "I don't do a whole lot ... yet."
  []
  (println "Welcome to number guessing game.")
  (guess-number))

