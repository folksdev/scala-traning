def justPrint() = {
  print("Merhaba Youtube!")
}

justPrint()

def justPrint2():Unit = {
  print("Merhaba Youtube!")
}

justPrint2()

def addTo(m: Int): Int = {
  val s: String = "Hello"
  m + 2
}

addTo(3)

def addTo2() : Int = {
  2 + 1
}

addTo2()

addTo2().toString
addTo2() toString

def add(m: Int = 2, n: Int = 3) = {
  m + n
}
add(5, 6)
add(n = 5)
add()

def combine(str: String = "hello", n: Int = 1) = {
  s"$str and $n"
}

combine()
