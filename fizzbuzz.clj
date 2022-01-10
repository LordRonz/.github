(defn fizzbuzz [z]
    (let [fizz? (zero? (rem z 3))
        buzz? (zero? (rem z 5))
        fizzbuzz? (and fizz? buzz?)]

        (cond fizzbuzz? (println "FizzBuzz")
            buzz? (println "Buzz")
            fizz? (println "Fizz")
            :else (println z))))

(dotimes [i 100]
    (fizzbuzz (inc i)))
