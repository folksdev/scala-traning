case class Child(name:String, age: Int) {
  def aFunc(name: String) = {
    Child(name, 0)
  }
}
val c = Child("bob", 2)

//definition
val child = Child("alice", 8)
child.aFunc("a")
//equality
val child1 = Child("alice", 14)
val child2 = Child("alice", 14)

child1 == child2

//pattern matching
val child3 = Child("bob", 15)
child3 match {
  case Child("bob", 15) => {
    s"This is ${child1.name}"
  }
  case _ => s"alien"
}


//deep copy and shallow copy
val c2 = child1.copy()
val c3 = child1.copy(age = 15)

//case class extensions
//case class Student(schoolNumber: Int, child: Child) extends Child(child.name, child.age)
//val s1 = Student(123, child1)

class Student(child: Child) {
  def goToTheSchool(): String = {
    this.child.age match {
      case a if a < 7 => s"${this.child.name} should not be allowed to the school. $a"
      case _ => s"${this.child.name} is allowed to the school."
    }
  }
}
case class StudentChild(studentNumber: Int, name: String, age: Int) extends Student(Child(name, age))

//unapply function
val (name, age) = Child.unapply(child1).get

val s1 = StudentChild(123, name, 6)
s1.goToTheSchool()

/*class Child(_name: String, _age: Int) extends Serializable {

  // Constructor parameters are promoted to members
  val name = _name
  val age = _age

  // Equality redefinition
  override def equals(other: Any): Boolean = other match {
    case that: Child =>
      (that canEqual this) &&
        name == that.name &&
        age == that.age
    case _ => false
  }

  def canEqual(other: Any): Boolean = other.isInstanceOf[Child]

  // Java hashCode redefinition according to equality
  override def hashCode(): Int = {
    val state = Seq(name, age)
    state.map(_.hashCode()).foldLeft(0)((a, b) => 31 * a + b)
  }

  // toString redefinition to return the value of an instance instead of its memory addres
  override def toString = s"Note($name,$age)"

  // Create a copy of a case class, with potentially modified field values
  def copy(name: String = name, age: Int = age): Child =
    new Child(name, age)

}

object Child {

  // Constructor that allows the omission of the `new` keyword
  def apply(name: String, age: Int): Child =
    new Child(name, age)

  // Extractor for pattern matching
  def unapply(child: Child): Option[(String, Int)] =
    if (child eq null) None
    else Some((child.name, child.age))

}*/

