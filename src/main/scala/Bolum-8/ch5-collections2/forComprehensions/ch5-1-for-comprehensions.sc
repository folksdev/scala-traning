val aNumbersSeq = Seq(1, 2, 4)

val aNumbersOfNumbers = Seq(Seq(2, 3), Seq(6), Seq(3, 5))

for(num <- aNumbersSeq) yield num * 2
val result = for {
  ls <- aNumbersOfNumbers
  if(ls.size > 1)
  aNum <- ls
  if(aNum % 2 == 0)
} yield aNum


aNumbersSeq.map(_ * 2)

for(character <- Seq("a", "b")) yield character.toUpperCase

val combos = for (c <- Seq('a', 'b');
                  n <- 1 to 3) yield s"$c$n"

val people = Seq("Aluki", "Ryan", "Saanvi", "Chao")

for {
  person1 <- people
  person2 <- people
  if(person1 != person2)
} yield (person1, person2)

case class Person(name: String, nice: Boolean)

val peopleSeq = Seq(
  Person("Aluki", true),

  Person("Ryan", true),

  Person("Saanvi", false),

  Person("Chao", true))

for {
  Person(nice, true) <- peopleSeq
  Person(notNice, false) <- peopleSeq
} yield (nice, notNice)


for {
  aPerson <- peopleSeq
} yield aPerson.name


val items = Seq(2, 5, 7)
def expensive(x: Int): Boolean = x > 3

for{
  item <- items
  isIt = expensive(item)
} yield (item, isIt)
