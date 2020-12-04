//cannot have constructor arguments. can have partial implementation
trait Animal {
  val power: Int
  def drainPowerBy(rage: Int): Int
  def KO:String = if(power > 35) "Doing KO" else "Not enough rage!"
}

trait Race {
  val specialPowers: String
}

trait NightElf extends Race {
  override val specialPowers = "stars rain"
}
trait BloodElf extends Race {
  override val specialPowers = "arcane Rain"
}

class Player(powerLevel: Int, specials: String) extends Animal with Race{
  val power = powerLevel
  val specialPowers = specials
  def drainPowerBy(rage:Int):Int = power - rage
  override def KO:String = if(power > 25) "Doing KO" else "Not enough rage!"
}

class AnotherPlayer (powerLevel: Int, specials: String) extends Animal with NightElf {
  val power = powerLevel
  def drainPowerBy(rage:Int):Int = power - rage
  override def KO:String = if(power > 25) "Doing KO" else "Not enough rage!"
}
//what happens here?
class AnimalPlayers(powerLevel:Int, special:String) extends Animal {
  val power = powerLevel
  val specialPowers = special
  def drainPowerBy(rage:Int):Int = power - rage
  override def KO:String = if(power > 25) "Doing KO" else "Not enough rage!"
}
val animal = new AnimalPlayers(35, "ROAR")

val theWarrior = new Player(34, "SkullBash")
theWarrior.power
theWarrior.specialPowers
theWarrior.drainPowerBy(15)
theWarrior.KO

val thePriest = new Player(34, "Renew") with NightElf
thePriest.specialPowers
thePriest.isInstanceOf[NightElf]
thePriest.isInstanceOf[BloodElf]
thePriest.isInstanceOf[Player]

theWarrior.isInstanceOf[NightElf]
theWarrior.isInstanceOf[BloodElf]
theWarrior.isInstanceOf[Player]

val anotherPlayer = new AnotherPlayer(55, "Running")
anotherPlayer.specialPowers
//add another player how does the list change??

val thePlayers:List[Player with Race] = List(thePriest, theWarrior)

