 (fn
  [f & args]
  (loop [res (apply f args)]
    (if (fn? res)
      (recur (res))
      res)))
