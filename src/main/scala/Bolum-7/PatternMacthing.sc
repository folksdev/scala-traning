val name = "Claudia"
name match {
  case "Neme" => println("Gothca")
  case "Claudia" => println("I am claudia")
  case _ => println("NO")
}

val i = 11
i match {
  case a if 0 to 9 contains a => println("0-9 range: " + a)
  case b if 10 to 19 contains b => println("10-19 range: " + b)
  case c if 20 to 29 contains c => println("20-29 range: " + c)
  case _ => println("Hmmm...")
}

def matchTest(x: Int): String = x match {
  case 1 => "one"
  case 2 => "two"
  case _ => "many" // case _ will trigger if all other cases fail.
}
println(matchTest(3)) // prints "many"

val stuff = "blue"

val myStuff: Int = stuff match {
  case "red" => {
    matchTest(2)
    println("RED")
    1
  }
  case "blue" =>
    println("BLUE"); 2
  case "green" =>
    println("GREEN"); 3
  case _ =>
    println(stuff); 0 // case _ will trigger if all other cases fail.
}

myStuff

val stuff2 = "blue"

val myStuff2: (Int, Int, Int) = stuff2 match {
  case "red" => (255, 0, 0)
  case "green" => (0, 255, 0)
  case "blue" => (0, 0, 255)
  case _ => println(stuff); (0, 0, 0)
}

myStuff2

def goldilocks(expr: Any) = expr match {
  case ("porridge", "Papa") => "Papa eating porridge"
  case ("porridge", "Mama") => "Mama eating porridge"
  case ("porridge", "Baby") => "Baby eating porridge"
  case ("porridge", "Baby", 2) => "Baby eating porridge 2"
  case _ => "what?"
}

goldilocks(("porridge", "Mama"))
val a = ("porridge", "Baby", 2)
goldilocks(a)
goldilocks("Bla")

def goldilocks2(expr: Any) = expr match {
  case ("porridge", _) => "eating"
  case ("chair", "Mama") => "sitting"
  case (_, "Baby") => "sleeping"
  case _ => "what?"
}

goldilocks(("porridge", "Papa"))
goldilocks(("chair", "Mama"))

def goldilocks3(expr: Any) = expr match {
  case ("porridge", bear) =>
    bear + " said someone's been eating my porridge"
  case ("chair", bear) => bear + " said someone's been sitting in my chair"
  case ("bed", bear) => bear + " said someone's been sleeping in my bed"
  case _ => "what?"
}

goldilocks3(("porridge", "Papa"))
goldilocks3(("chair", "Mama"))


//variable shadowwing
val foodItem = "porridge"

def goldilocks4(expr: Any) = expr match {
  case (`foodItem`, _) => "eating"
  case ("chair", "Mama") => "sitting"
  case ("bed", "Baby") => "sleeping"
  case _ => "what?"
}


goldilocks4(("porridge", "Papa"))
goldilocks4(("chair", "Mama"))
goldilocks4(("porridge", "Cousin"))
goldilocks4(("beer", "Cousin"))

////method parameters
def patternEquals(i: Int, j: Int) = j match {
  case `i` => true
  case _ => false
}
patternEquals(3, 3)
//patternEquals(7, 9)
//patternEquals(9, 9)
val theList = List(1, 3, 5, 6)
val theList2 = List(1)
val theList3 = List

theList match {
  case x :: y :: tail => println(s"$x $y At least 2 elemenst" + tail.foreach(println))
  case x :: _ => println(s"$x At least 1 el")
  case _ => println("Empty list")
}
