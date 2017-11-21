; let's try simple functions first.
(defn hello [x y]
  (println (+ x y)))

(defn say
  [x]
  (println x))


(hello 1 1)
(hello 2 3)
(say "hello")

; a little bit more involved with with if statement.
(defn error-message
  [severity]
  (str "Hello World From "
       (if (= severity :mild)
         "IfClojure!" ; return if true
         "ElseClojure!"))) ; return else

(println (error-message :mild))

; no let us try sequecnes.
; print 100 of random numbers from -100 to 100
(println (map (fn [x] (- (rand-int x) 100))(take 100 (repeat 200))))


; now lets try a different syntax
(println (map #(- (rand-int %) 100) (take 100 (repeat 200))))

; filter out them element
(println (filter #(= (mod % 2) 0) (map #(- (rand-int %) 100) (take 100 (repeat 200)))))
; now easier version
(println (filter even? (map #(- (rand-int %) 100) (take 100 (repeat 200)))))

; a couple of syntax cheat sheets
; or returns first true value
(or (= 1 1) (= 2 2) 1)

; and return last true value
(and (= 1 1) (= 2 2) 1)

; get second of vector
(get [3 2 1] 1)

; add element to the list
; they are added to the back of the list
; [3 2 1 6 5 4]
(conj [3 2 1] 6 5 4)

; front of the list (4 5 6 3 2 1)
(conj '(3 2 1) 6 5 4)

; hash set conj items are unique
(conj #{:a :b} :b)

; turn range into a list
(into [] (range 0 200))
