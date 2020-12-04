class Duck

class MallardDuck extends Duck
class RubberDuck extends Duck

val justDuck = new Duck

val aMallard = new MallardDuck
val aRubber = new RubberDuck

justDuck.isInstanceOf[Duck]
justDuck.isInstanceOf[MallardDuck]

aMallard.isInstanceOf[Duck]
aMallard.isInstanceOf[MallardDuck]




class Hero(val heroName:String) {
  def attack(pattern: String) {
    println(s"Attack now with pattern $pattern")
  }
}

class SwordHero(heroName: String) extends Hero(heroName)
class ArcherHero(whatsMyName: String, val extraAbility: String) extends Hero(whatsMyName) {
  override def attack(pattern: String) {
    println(s"I am ignoring the pattern $pattern and doing my Things")
  }

  override def toString: String = s"My Name is $heroName and my special ability is $extraAbility"
}

val aHero = new SwordHero("Nemesisce")

val aShittyHero = new ArcherHero("Costoboci", "Run Fast")

aHero.attack("Pattern Delta")

//aHero.heroName
aShittyHero.attack("Random Pattern")
aShittyHero.heroName
aShittyHero.extraAbility

aHero.heroName
