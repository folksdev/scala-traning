import java.util.Date

val tuple = ("apple", "dog")

val fruit = tuple._1
val animal = tuple._2
val tuple5 = ("a", 1, 2.2, new Date(), BigDecimal(5))

tuple5._2
tuple5._5

val times2: Int => Int = x => x* 2
def times3(x:Int):Int = x* 2
val times3Val = times3 _

List(1,2).foreach(println(_))

val tup = (times3 _, "apple")
val t = tup._1(2)

val tuple2 = ("apple", 3).swap
tuple2._1
tuple2._2


type DataTypeMap = (Int, String, BigDecimal)

def getDataType(str: String): DataTypeMap = {
  (0, str, BigDecimal(1))
}

val a = getDataType("Hello")
val b = new DataTypeMap(1, a._2, BigDecimal(2))