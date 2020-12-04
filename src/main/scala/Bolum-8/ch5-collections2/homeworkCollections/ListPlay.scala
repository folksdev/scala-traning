package Bolum-8.ch5-collections2.homeworkCollections

8.ch5-collections2.homeworkCollections

class ListPlay {

  case class UserLight(nameAndAge: String) {
    def this(user: User) {
      this(user.name + " " + user.age)
    }
  }

  //    instantiate lists
  val aNumbersList: List[Int]  = List(42, 31, 61, 1, 3, 7, -1, 22)
  val aNumbersList2: List[Int] = List()

  val aUsersList: List[User] =
    List[User](User("claudia", 42), User("claudia", 21), User("johan", 31), User("johan", 46), User("eduard", 42))

  val anotherUsersList: List[User] =
    List(User("zelda", 42), User("zelda", 21), User("goku", 31), User("goku", 46), User("trunks", 42))

  val myListOfLists: List[List[User]] = List(aUsersList, anotherUsersList)

  val categoryService: CategoryService = new CategoryService()
  val allCategories: List[Category]    = categoryService.getCategories

  val bmwCategory                     = Category(91, Some(93), 91, "Autos BMW", true)
  val audiCategory                    = Category(91, Some(96), 91, "Autos Audi", true)
  val aCategoriesList: List[Category] = List(bmwCategory, audiCategory)

  def sumUsingFolding(myList: List[Int]): Int = {
    0
  }

  def maxUsingFolding(myList: List[Int]): Int = {
    0
  }

  def maxAgeUserUsingFolding(myList: List[User]): User = {
    User("dudu", 42)
  }

  def getAllNumbersBiggerThanX(number: Int): List[Int] = {
    aNumbersList.filter(???)
  }

  def transformListIntoPositiveNumbers(): List[Int] = {
    aNumbersList.map(???)
  }

  def orderAllUsersByName(): List[User] = {
    aUsersList //
  }

  def orderAllUsersByNameDescending(): List[User] = {
    aUsersList
  }

  def orderAllUsersByNameUsingCollections(): List[User] = {
    aUsersList;
  }

  def compareByNameThenByAge(): List[User] = {
    aUsersList
  }

  def transformFrom(theInitialUsers: List[User]): List[UserLight] = {
    List()
  }

  def transformFromListOfLists(): List[UserLight] = {
    //using myListOfLists
    List()
  }

  def main(args: Array[String]): Unit = {
    val listPlay = new ListPlay();
//     testing your code make a test class

  }
}
