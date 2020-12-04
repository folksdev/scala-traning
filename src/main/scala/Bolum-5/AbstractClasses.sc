//abstract classes -

abstract class Duck(val canFly: Boolean = false) {
  def this(canFly: Int) = this(canFly == 0)
  def sing(): String = {
    "This is the sign function"
  }
  def nameMe(initials: String): String
  val surName: String
}

abstract class Sky(canFly: Boolean) extends Duck(canFly) {
  def colorOfSky: String
}


class MallardDuck(canFly: Boolean) extends Sky(canFly) {
  def nameMe(initials: String): String = {
    if(initials.equals("dk")) "Ducky" else "Missy"
  }
  val surName = "The Surname"
  override def toString = "The duck: " + surName

  override def colorOfSky = "Sky is blue today"
}

class RubberDuck(canFly: Int) extends Duck(canFly) {
  override def sing() = {
    "I can Squack! Squack!"
  }

  def nameMe(initials: String) = {
    "I don't care " + initials
  }

  override val surName = "HEHE"

  override def toString = "The duck that is rubber: " + surName
}

val theDuck = new MallardDuck(true)
theDuck.sing()
theDuck.nameMe("dk")
theDuck.canFly
theDuck.colorOfSky

val theDuck2 = new MallardDuck(false)
theDuck2.canFly
val theDuck3 = new RubberDuck(1)

//val theDuck4 = new Duck(true)

def getTheDucks(theDucks: List[Duck]): Unit = {
  theDucks.foreach(duck => println(duck.sing()))
}
getTheDucks(List(theDuck, theDuck2, theDuck3))