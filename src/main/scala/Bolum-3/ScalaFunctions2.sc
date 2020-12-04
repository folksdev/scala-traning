/*
 * Workshop - 1
 * 'total' isminde bir anonim fonksiyon tanimi yapin ve bu fonksiyon
 * 2 parametre alsin String ve Int ve string degerinin uzunlugu ile n degerinin toplamini donsun.
 *
 * Olusturdugunuz 'total' fonskiyon once string parametresi alan bir fonksiyon tarafindan cagirilip
 * bir degere atanarak, farkli bir degerde uygulanmasini saglayin.
 *
 */

def total = (str: String, n: Int) => {
  n + str length
}

def strIncome(str: String) : (Int => Int) = {
  total(str, _: Int)
}

val result = strIncome("Hello World").apply(2)


def anonim = (x: Int) => {
  x + 2
}

anonim

anonim(2)
anonim.apply(2)

val anotherAnonim = () => "Merhaba Youtube!"

anotherAnonim
anotherAnonim()
anotherAnonim.apply()

def add3to(m : Int, n: Int): Int = {
  m + 3
}

add3to(3, 2)
val add3Func = add3to _

val result = add3Func.apply(2, 3)


def multiplyBy(m: Int) = {
  m * 2
}
multiplyBy(3)

def multiply(m: Int, n: Int) = {
  m * n
}

val firstResult = multiply(2, _: Int)
firstResult.apply(5)

def showAll(args: Int*) = {
  args.foreach(print(_))
}

def showList(args: List[Int]) = {
  args.foreach(print(_))
}

showAll(1,2,3,4,5,6,7)

showList(List(1,2,3,4,5,6,7))

/*
def total = (str: String, n: Int) => {
  n + str length
}

def strIncome(str: String) : (Int => Int) = {
  total(str, _: Int)
}

val totalCount = strIncome("Hello Youtube!")(2)*/