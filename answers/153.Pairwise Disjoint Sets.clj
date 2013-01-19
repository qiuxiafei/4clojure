(fn [coll]
  (let [ss (for [a coll b coll
                 :when (not (identical? a b))]
             (clojure.set/intersection a b))]
    (every? empty? ss)))
;; best answer
#(apply distinct? (mapcat seq %))
