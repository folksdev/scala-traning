case class User(name: String, salary: Int)

def printMessage(user: User): Unit = user match {
  case User(_, salary) if salary > 100000 => println("You get paid too much, dude!")
  case User(name, _) => println("Hey " + name + ", Let's negociate!")
}

//no side effect
def message(user: User) = user match {
  case User(_, salary) if salary > 100000 => "You get paid too much, dude!"
  case User(name, _) => "Hey " + name + ", Let's negociate!"
}

def printActualMessage(user: User): Unit = println(message(user))

//make some actual users and test

//another place where we have values is the left side of a value definition
//wait what?

def currentUser(): User = User("Daniel", 35000)
def doSomethingWithTheName(name: String): Unit = println(name)


val theUser = currentUser()
doSomethingWithTheName(theUser.name)

//or

val User(aName, _ ) = currentUser()
doSomethingWithTheName(aName)

//make sure your pattern matches
def scores: List[Int] = List()
//val best :: rest = scores
//println("The score of our champion is " + best)
def gameResult(): (String, Int) = ("Daniel", 3500)
//ugly tuples
val result = gameResult()
println(result._1 + ": " + result._2)
//or
val (name, score) = gameResult()
println(name + ": " + score)

//now with for's
def gameResults(): Seq[(String, Int)] =
  ("Daniel", 3500) :: ("Melissa", 13000) :: ("John", 7000) :: Nil

def hallOfFame = for {
  result <- gameResults()
  (name, score) = result
  if (score > 5000)
} yield name
//left side of a generator is also a patter

def hallOfFame2 = for {
  (name, score) <- gameResults()
  if (score > 5000)
} yield name
//pattern on left side can be used for filtering

val lists = List(1, 2, 3) :: List.empty :: List(5, 3) :: Nil
//technically does not match e,pty lists, so it will not throw match error
for {
  list @ head :: _ <- lists
} yield list.size
