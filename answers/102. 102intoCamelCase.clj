(fn name [s]
  (let [words (re-seq #"[a-zA-Z]+" s)
        words (cons (first words)
                    (map clojure.string/capitalize (rest words)))]
    (apply str words)))
;; best answer
#(clojure.string/replace % #"-(\w)" (fn [[a b]] (clojure.string/capitalize b)))
