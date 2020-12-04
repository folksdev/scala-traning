class Duck

class MallardDuck(val name:String) {
  println("inside the constructor")
  val color: String = {
    println("Initializing color field")
    if(name == "Ducky") "red"
    else if(name == "Iffy") "pink"
    else "yellow"
  }
  println("still inside the constructor")

  def sing: String = {
    println("Doing the sing method")
    if(name == "Ducky") "squeak"
    else if(name == "Iffy") "hickup"
    else "mute"
  }
  val surName: String = {
    println("Initializing the surname")
    "The Duck"
  }

  def getTheRealName = name
  override def toString = "A duck by the name:" + name + " and color:" + color + " that sings:" + sing
}

val theDuck = new Duck
val aSpecialDuck = new MallardDuck("Ducky")
val aSpecialDuck2 = new MallardDuck("Ducky")

println("It's Color:" + aSpecialDuck.color)
println("It's song:" + aSpecialDuck.sing)
println("It's surname:" + aSpecialDuck.surName)
println("It's name:" + aSpecialDuck.getTheRealName)

//aSpecialDuck.name = "Mara"
aSpecialDuck
aSpecialDuck eq aSpecialDuck2

class Flamingo private (val name:String = "bla") {
  val color: String = {
    if(name == "LittleMan") "red"
    else if(name == "BidBird") "pink"
    else "yellow"
  }

  def computeRealName(initials: Char):String = {
    if(initials == 'L') "LittleMan"
    else if(initials == 'B') "BidBird"
    else "anonim"
  }

  def this(initials: Char) = {
    this(
      if(initials == 'L') "LittleMan"
      else if(initials == 'B') "BidBird"
      else "anonim"
    )
  }

  override def toString = "A flaming called:" + name
}

val theFlamingo = new Flamingo('L')
theFlamingo.name
theFlamingo.color

class Worker(val name: String, val age: Int){
  def equals(a: Worker) : Boolean = { this.name == a.name && this.age == a.age }
}
val claudia = new Worker("Claudia", 21)
val anotherClaudia = new Worker("Claudia", 21)

claudia.equals(anotherClaudia)