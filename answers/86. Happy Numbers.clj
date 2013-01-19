(letfn [(num->digits [num]
          (loop [n num res []]
            (if (zero? n)
              res
              (recur (long (/ n 10)) (cons (mod n 10) res)))))
        (change [n]
          (apply + (map #(* % %) (num->digits n))))]
  (fn [init]
    (loop [curr init results #{}]
      (println curr " - " results)
      (cond
       (= 1 curr) true
       (results curr) false
       :else (let [new-n (change curr)]
               (println curr new-n)
               (recur new-n (into results [curr])))
       )))
  )
