val l = List(1, 2, 3)
val a = l.toArray
//conversions
val a1 = Array(1, 2, 3)
val s = a.toSeq
val l1 = s.toList
//for conprehensions
val sF = for (v <- 1 to 4) yield v
sF.toList

//conditions
val sC = for (v <- 1 to 10 if v % 3 == 0) yield v
sC.toList

//filtering
val sFilt = Seq("hello", "to", "you")
val filtered = sFilt.filter(_.length > 2)

val aFilter = Array("hello", "to", "you", "again")
val Afiltered = aFilter.filter(_.length > 3)
Afiltered

//transformatios
val sTransf = Seq("hello", "world")
val r = sTransf map {
  _.reverse
}

// 2.12
import scala.collection.JavaConverters._

// 2.13
//import scala.jdk.CollectionConverters._
val b = r.asJava

