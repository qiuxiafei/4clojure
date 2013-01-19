(fn [& args]
  (letfn [(gcd [x y]
            (let [a (max x y)
                  b (min x y)
                  m (mod a b)]
              (if (zero? m)
                b
                (recur b m))))
          (lcm [a b]
            (/ (* a b) (gcd a b)))]
    (reduce lcm args)
    ))
