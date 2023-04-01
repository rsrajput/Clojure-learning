(ns learn.core
  (:gen-class))

(defn greet
  [name]
  (println "hello, " name))

(defn prompt
  []
  (println "Please enter your name: ")
  (println (str "hello, " (read-line))))

(defn add-two-numbers
  []
  (println "enter first number: ")
  (def num1 (Integer/parseInt (read-line)))
  (println "enter second number: ")
  (def num2 (Integer/parseInt (read-line)))
  (println (+ num1 num2)))






(defn -main
  "I don't do a whole lot ... yet."
  [& args]
  (println "Hello, World!")
  (greet "Rituraj Singh Rajput")
  (prompt)
  (add-two-numbers))
