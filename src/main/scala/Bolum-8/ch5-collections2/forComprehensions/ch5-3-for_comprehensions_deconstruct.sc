//Deconstructors
case class Person(name:String, isNice: Boolean)
val person = Person("Claudia", true)


val apair = (42, 'a')
val (theNumber, theChar) = apair

val Person(aName, isHHNice) = person

//deconstructors in for comprehensions
val peopleSeq = Seq(Person("Booghie", true),
  Person("Monster", true),
  Person("Costoboci", false),
  Person("Rhamnousia", true))
//homework Only Nice persons
for {
  Person(name, maybeNice) <- peopleSeq
} yield name

for {
  Person(name,true) <- peopleSeq
} yield name
//exercise write a for loop that gives all combi
// of a nice person with not nice person