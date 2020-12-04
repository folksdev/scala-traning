package Bolum-8.ch5-collections2.homeworkCollections

8.ch5-collections2.homeworkCollections

class MapPlay {

  case class UserLight(nameAndAge: String) {
    def this(user: User) {
      this(user.name + " " + user.age)
    }
  }
  //test data
  val aSimpleNumberMap = Map(1 -> 11, 2 -> 22, 3 -> 33, 4 -> 44, 5 -> -55, 6 -> -66, 7 -> 77, 8 -> -88)

  val aMapOfLists: Map[Int, List[Int]] =
    Map(1 -> (1 to 10).toList, 2 -> (3 to 33).toList, 3 -> (4 to 6).toList, 4 -> List())

  val aUsersList: List[User] = List[User](
    User("claudia", 42),
    User("claudia", 21),
    User("johan", 31),
    User("johan", 46),
    User("eduard", 42)
  )

  val anotherUsersList: List[User] = List(
    User("zelda", 42),
    User("zelda", 21),
    User("goku", 31),
    User("goku", 46),
    User("trunks", 42)
  )

  val aMapOfDifferentUsers: Map[String, List[User]] = Map("MP" -> aUsersList, "TW" -> anotherUsersList)

  def sumAllNumbersFromSimpleMap(numbersMap: Map[Int, Int]): Int = {
    0
  }

  def sumAllPositiveNumbersFromSimpleMap(numbersMap: Map[Int, Int]): Int = {
    0
  }

  def transformAllPositiveNumbersFromSimpleMap(numbersMap: Map[Int, Int]): Int = {
    0
  }

  def getAllNumbersFromSimpleMap(numbersMap: Map[Int, Int]): Map[Int, Int] = {
    Map()
  }

  def getAllUsersForTenant(atenantToUserMap: Map[String, List[User]], tenant: String): Map[String, List[User]] = {
    Map()
  }

  def getAllUsersWithCertainName(atenantToUserMap: Map[String, List[User]], name: String): Map[String, List[User]] = {
    Map()
  }

  def getMaxValueFromMap(aMapOfLists: Map[Int, List[Int]]): Int = {
    0
  }

  def getKeyWithTheMostElementsInValue(aMapOfLists: Map[Int, List[Int]]): Int = {
    0
  }

  //invent stuff :)
  def main(args: Array[String]): Unit = {
    //test my methods using test data
  }
}
