(fn [f & args]
  (reduce (fn[map1 map2]
            (reduce (fn [m [k v]]
                      (if-let [vv (m k)]
                        (assoc m k (f vv v))
                        (assoc m k v)))
                    map1 map2))
          args))
