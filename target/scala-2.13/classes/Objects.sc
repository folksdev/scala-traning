//singletons
//object Greeting {
//  def english = "Hi"
//  def espanol = "Hola"
//}
//Greeting.english
//Greeting.espanol
//
////check if it is actually singleton
//val x = Greeting
//val y = x
//x eq y
//val z = Greeting
//x eq z

//companion objects
//case class Movie( name: String, val year: Short)
case class Movie(val name: String = "", val year: Short = 0) {
  def apply(): Movie = new Movie("abc", 1)
}

object Movie {
  val a = "asd"
  def apply(name: String): Movie = {
    new Movie().apply()
  }

  def apply(): Movie = {
    new Movie().apply()
  }

  def apply(name: String, year: Short): Movie = {
    new Movie(name, year)
  }

  def apply(x: Int): Option[Movie] = {
    //This is a match statement, more powerful than a Java switch statement!
    x match {
      case 1930 ⇒ Some(new Movie("All Quiet On the Western Front", 1930))
      case 1931 ⇒ Some(new Movie("Cimarron", 1931))
      case 1932 ⇒ Some(new Movie("Grand Hotel", 1932))
      case _ ⇒ None
    }
  }

  def sometimesOld(x: Short) = {
    x match {
      case 1930 ⇒ Some(new Movie("All Quiet On the Western Front", 1930))
      case 1931 ⇒ Some(new Movie("Cimarron", 1931))
      case 1932 ⇒ Some(new Movie("Grand Hotel", 1932))
      case _ ⇒ None
    }
  }

  def calculate() = {

  }
}


//Movie("hehe")
//Movie("hehehe",1).apply().Movie.calculate()
Movie.apply()
//Movie(1932)

//Movie(1932).get.name
//Movie.sometimesOld(1932)

////companion object see private fields
//class Person(val name: String, private val superheroName: String) //The superhero name is private!
//
//object Person {
//  def showMeInnerSecret(x: Person) = x.superheroName
//}
//val clark = new Person("Clark Kent", "Superman")
//val peter = new Person("Peter Parker", "Spider-Man")
//
//Person.showMeInnerSecret(clark)
//Person.showMeInnerSecret(peter)
