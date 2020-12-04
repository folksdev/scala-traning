//print all numbers
for (n <- Seq(1, 2, 3)) println(n)
//the same with
Seq(1, 2, 3).foreach(println)


val squares = for (n <- Seq(1, 2, 3)) yield n * n
//the same as
val squaresOther = Seq(1, 2, 3).map(n => n * n)

//exercise write a for loop that prints the line number from 1 - 5 like line:$i

//exercise write a for loop that  converst a Seq('a','b', 'c') into a seq of upper case

//multiple loops
val combi = for (c <- Seq('a', 'b'); n <- 1 to 3) yield s"$c$n"

//same as
Seq('a', 'b').flatMap(c => (1 to 3).map(n => s"$c$n"))

Seq('a', 'b').flatMap(c => s"$c")

//exercise write a for that gives pairs with each possible combination or throwing 2 dices

//exercise write for loop that gives all posible conversation options between 2 people
val people = Seq("Eduard", "Jeroen", "Claudia", "Tor")

//how to fix duplicates
for {
  p1 <- people
  p2 <- people if p1 < p2
} yield (p1, p2)


val aList = List(1,2,3,4,5,6,7)
val bList = List(1,2,3)
val newList = for {
  a <- aList if a % 2 == 0
  b <- bList
} yield a + b
println(newList)