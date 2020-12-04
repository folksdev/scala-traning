val aList = Seq(42, 31, 61, 1, 3, 7, -1, 22)

aList.reduce(_ - _)
//val empty: List[Int] = List()
//empty.reduce(_ * _)
//reduce takes ll elements nd combines them
// to produce a single value
aList.reduce {(x, y) => x + y}
aList.reduce (_ + _)
aList.sum

aList.reduce {(x, y) => x * y}
aList.reduce (_ * _) //weird underscore stuff
aList.product

//mkString concatenates tsuff a case of reduce
val joined = Seq("do","mi","sol","do") reduce {
      (x,y) => x + "-" + y
}
//empty collections?
//can you reduce to a different type?
//what about order does it matter? as a binary operation

//fold operation -- FoldLeft
//can handle empty
//can reduce to a different type
def multiply(x: Int, y: Int) = x * y

val product = Seq(5,3,6).fold(1)(multiply)
val product1 = Seq().fold(1)(_*_)
//interesting problems
val illJoined = Seq("do","mi","sol").foldLeft("")(_ + "-" + _) //(("" - do) - mi) - sol
val illJoined2 =  Seq("do","mi","sol").foldRight("")(_ + "-" + _) // do - (mi - (sol - "")
//from one type to another
//the type of the result must
// be type of the starting value.
val reversed =
  (1 to 10).foldLeft(List[Int]()) {
    (xs, x) => x :: xs //hmm no case?
  }
//longest string size in a list
val longest =
  List(
    "a","borborygmus","sesquipedalian","small"
  ).foldLeft(0) {
    (currentMax, currentElem) => math.max(currentMax, currentElem.length)
  }

//implementing map with fold left
//make all elemnt > 0
val fifi = aList.foldLeft(List[Int]()) {
  (accuList, nextElem) => accuList ::: List(Math.abs(nextElem))
}

val zuzu = aList.foldLeft(List[Int]()) {
  (accuList, nextElem) => Math.abs(nextElem) :: accuList
}

//fold Right
aList.foldRight(List[Int]()) {
  (nextElem, accuList) => accuList ::: List(Math.abs(nextElem))
}
aList.foldRight(List[Int]()) {
  (nextElem, accuList) => Math.abs(nextElem) :: accuList
}


aList.foldLeft(0) { (m: Int, n: Int) => println("m: " + m + " n: " + n); m + n }
aList.foldRight(0) { (m: Int, n: Int) => println("m: " + m + " n: " + n); m + n }

aList.dropWhile((i:Int) => i > 7)

