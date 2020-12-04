import java.math.BigInteger
implicit def Int2BigIntegerConvert(value: Int): BigInteger =
  new BigInteger(value.toString)


//used to convert automatically stuff
def add(a: BigInteger, b: BigInteger) = a.add(b)
def multiply(a: BigInteger, b: BigInteger) = a.multiply(b)


add(Int2BigIntegerConvert(3), Int2BigIntegerConvert(6)) == Int2BigIntegerConvert(9)
add(3, 6) == 9


//Implicits can be used to declare a value to be provided as a default
// as long as an implicit value is set with in the scope.
// These are called Implicit Function Parameters:

def howMuchCanIMake(hours: Int)(implicit dollarsPerHour: BigDecimal) =
  dollarsPerHour * hours

implicit val hourlyRate = BigDecimal(34)
//implicit val anotherHourly = BigDecimal(22)
howMuchCanIMake(2)(14)
howMuchCanIMake(hours = 2)

// you can have multiple values
def howMuchCanIMake_?(hours: Int)
                     (implicit amount: BigDecimal,
                      currencyName: String) =
  (amount * hours).toString() + " " + currencyName

implicit val currencyName2 = "Dollars"

howMuchCanIMake_?(2)
//defining a class with functionality and then
//defining implicit conversions to that
// class so you can access the method
class IntWrapper(val original: Long) {
  def isOdd = original % 2 != 0
  def getAsString = s"$original"
}

implicit def thisMethodNameIsIrrelevant(value: Long) =
  new IntWrapper(value)

19L.isOdd
20L.isOdd
15L.getAsString
