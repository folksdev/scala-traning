case class User(name: String, age: Int)
case class UserLight(user: User) {
  private var nameAndAge = user.name + " " + user.age

  def setNameAndAge(nameAndAge: String) {
    this.nameAndAge = nameAndAge
  }
}

var aUsersList :List[User] = List(
  User("claudia", 42),
  User("claudia", 21),
  User("johan", 31),
  User("johan", 46),
  User("eduard", 42))

var anotherUsersList: List[User] = List(
  User("zelda", 42),
  User("zelda", 21),
  User("goku", 31),
  User("goku", 46),
  User("trunks", 42))


var myListOfLists = List(aUsersList, anotherUsersList)
//foreach
aUsersList.foreach { user: User => if(user.age > 25) println("adult") else println("padawan")}
//filter
aUsersList filter {user => user.age > 25}
aUsersList.filter {user => user.age > 25}
aUsersList.filter {user => user.name.equals("claudia")}
aUsersList.filter {user => user.name == "claudia" && user.age > 25}
aUsersList.filter (_.name == "claudia")

//transform -> map?
aUsersList.map(UserLight(_))
aUsersList.map(user => UserLight(user))
//reduce??
aUsersList.reduce((user1, user2) =>
  if(user1.age > user2.age) user1 else user2)
//fold
