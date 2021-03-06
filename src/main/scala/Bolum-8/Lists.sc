//just create
val a = List(1, 2, 3)
val b = List(1, 2, 3)
val c = a

a.equals(b)
a eq b // same object
a eq c
a == b
//null values
val a1: List[String] = Nil
val b1: List[Int] = Nil

val q: Seq[Int] = Nil


//equality check
a1 == Nil
a1 eq Nil
a == b
a eq b

a1.headOption
//head and tail
a.headOption
a.tail
a.head//what could go wrong

//lists are immutable
val a3: List[Int] = List(1, 3, 5, 7, 9)
val b3 = a3.filterNot(_ == 5) // remove where value is 5

a3 == List(1, 3, 5, 7, 9)
b3 == List(1, 3, 7, 9)
//utility methods

//add elements
val a4 = 5 :: a3
//add lists
val a5 = a3 :: a //huh?
val a6 = a3 ::: a
val a7 = 5 :: a3


a3.length
// reverse the list
a3.reverse


// map a function to double the numbers over the list
a3.map { elem => elem * 2}
a3.map ( elem => elem * 2)

val dudu = a1.map(_ * 2)
// filter any values divisible by 3 in the list
a3.filter { elem => elem % 3 == 0}
import java.lang.Math._

//foreach
a3.foreach { x: Int => println(abs(x))}
//a3.foreach { _ => println(abs(_))}


val aList = List(42, 31, -61, 1, 3, -7, -1, 22)
//to do make all > 0
aList.map(abs)
//make function that always returns all bigger then x
def biggerThanX(x: Int) = {
  aList.filter(_ > x)
}
biggerThanX(30)

val aListOfLists: List[List[Int]] = List(a, a3, a)

val second:  List[List[Any]] = List(List("a", "c"), List(1, 2))
second.flatten
aListOfLists.flatten

aListOfLists.flatMap {current => current.map(_ * 2)}

//partial application
aList.filter((i: Int) => i % 2 == 0)

def isEven(i: Int): Boolean = i % 2 == 0
aList.filter(isEven _)
def timesTwo(i: Int): Int =  i * 2
aList.map((i: Int) => i * 2)
aList.map(timesTwo _)
//interestiing zip
a
a3
a zip a3






