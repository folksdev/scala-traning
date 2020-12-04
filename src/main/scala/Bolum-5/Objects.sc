//singletons
object Greeting {
  val aString = "nemesisce"
  def english = "Hi"
  def espanol = "Hola"
}
Greeting.english
Greeting.espanol

//check if it is actually singleton
val x = Greeting
val y = x
x eq y
val z = Greeting
x eq z
val t = Greeting
x eq t
x.aString eq t.aString



//companion objects
class Movie(val name: String = "", val year: Short = 0) {
  override def toString: String = s"${Greeting.english} from ${Greeting.aString} name: $name year: $year"
}

object Movie {
  val a = "asd"
  def apply(name: String): Movie = {
    new Movie(name)
  }

  def apply(): Movie = {
    new Movie()//.apply()
  }

  def apply(name: String, year: Short): Movie = {
    new Movie(name, year)
  }

  def apply(x: Int): Option[Movie] = {
    //This is a match statement, more powerful than a Java switch statement!
    x match {
      case 2001 => Some(new Movie("The Lord of the Rings", 2001))
      case 1999 => Some(new Movie("Matrix", 1999))
      case 2012 => Some(new Movie("Hobbit", 2012))
      case _ => None
    }
  }

  def sometimesOld(x: Short) = {
    x match {
      case 2001 => Some(new Movie("The Lord of the Rings", 2001))
      case 1999 => Some(new Movie("Matrix", 1999))
      case 2012 => Some(new Movie("Hobbit", 2012))
      case _ => None
    }
  }

  def calculate() = {

  }
}


object Movie2 {
  def apply(name: String, year: Short): Movie = {
    Movie(name, year)
  }
}

Movie("hehe")
Movie2("hehehe",2019)
Movie.apply()
Movie(2001)

Movie(2012).get.name
Movie.sometimesOld(1999)

val a = Movie
val b = Movie
a eq b

//companion object see private fields
class Person(val name: String, private val superheroName: String)
//The superhero name is private!

object Person {
  def showMeInnerSecret(x: Person) = x.superheroName
}

val clark = new Person("Clark Kent", "Superman")
val peter = new Person("Peter Parker", "Spider-Man")

Person.showMeInnerSecret(clark)
Person.showMeInnerSecret(peter)
