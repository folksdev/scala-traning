val someValue: Option[String] = Some("I am wrapped in something")
val emptyValue: Option[String] = None


def maybeItWillReturnSomething(flag: Boolean): Option[String] = {
  if (flag) Some("Found value") else None
}
val value1 = maybeItWillReturnSomething(true)
val value2 = maybeItWillReturnSomething(false)

//
value1.get
value1 getOrElse "No value"
value2 getOrElse 2
value2 getOrElse {
  "default function"
}

//more dafault action
case class Resource(content: String)
val resourceFromConfigDir: Option[Resource] = None
val resourceFromClasspath: Option[Resource] = Some(Resource("I was found on the classpath"))
val resource = resourceFromConfigDir orElse resourceFromClasspath

//checking if we have a value
val value3 = maybeItWillReturnSomething(true)
val value4 = maybeItWillReturnSomething(false)
value3.isEmpty
value4.isEmpty
//pattern matching

val someValue1: Option[Double] = Some(20.0)
val value = someValue1 match {
  case Some(v) => v
  case None => 0.0
}
val v = someValue1.getOrElse(0.0)

val noValue: Option[Double] = None
val value5 = noValue match {
  case Some(v) => v
  case None => 0.0
}

//option can be viewd as a collection with either 1 element or 0
val number: Option[Int] = Some(3)
val noNumber: Option[Int] = None
val result1 = number.map(_ * 1.5)
val result2 = noNumber.map(_ * 1.5).orElse(Some(1))

//or folding
val result3 = number.fold(1)(_ * 3)
val result4 = noNumber.fold(3)(_ * 3)

case class User(id: Int,
                firstName: String,
                lastName: String,
                age: Int,
                gender: Option[String])

object UserRepository {
  private val users = Map(1 -> User(1, "John", "Doe", 32, Some("male")),
    2 -> User(2, "Johanna", "Doe", 30, Some("male")))

  def findById(id: Int): Option[User] = users.get(id)

  def findAll = users.values
}

val user1 = UserRepository.findById(1)
val userNone = UserRepository.findById(3)
user1.isEmpty

if (user1.isDefined) {
  println(user1.get.firstName)
} // will print "John" ..ugly


//som emore pattern matching
val user = User(2, "Johanna", "Doe", 30, None)
println("Gender: " + user.gender.getOrElse("not specified"))

val user2 = User(2, "Johanna", "Doe", 30, None)
user2.gender match {
  case Some(gender) => println("Gender: " + gender)
  case None => println("Gender: not specified")
}

UserRepository.findById(2).foreach(user => println(user.firstName))
val gender = UserRepository.findById(1).map(_.gender)
//option of option - use flatmap


val gender1 = UserRepository.findById(1).flatMap(_.gender) // gender is Some("male")
val gender2 = UserRepository.findById(2).flatMap(_.gender) // gender is None
val gender3 = UserRepository.findById(3).flatMap(_.gender) // gender is None
//filtering
UserRepository.findById(1).filter(_.age > 30)// Some(user), because age is > 30
UserRepository.findById(2).filter(_.age > 30) // None, because age is <= 30
UserRepository.findById(3).filter(_.age > 30)

