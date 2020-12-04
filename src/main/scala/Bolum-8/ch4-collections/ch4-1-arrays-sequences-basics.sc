//List<String> sFilt = new ArrayList<String>();
val l: Seq[Int]  = List(1, 2, 3)
println(l(2))
println(l.head)
val a = l.toArray
//conversions
//int[] a1 = new int[5];
val a1: IndexedSeq[Int] = Array(1, 2, 3)
a1(0)
val s = a.toSeq
val l1 = s.toList

//for conprehensions
val sF: IndexedSeq[Int] = for (v <- 1 to 4) yield v
sF.toList

//filtering
//List<String> sFilt = new ArrayList<String>();
val sFilt = Seq("hello", "to", "you")
val sFiltT = sFilt.tail

//sFilt.stream.filter
val filtered = sFilt.filter(_.length > 2)
val filtered = sFilt.filter(x => x.length > 2)


val aFilter = Array("hello", "to", "you", "again")
val Afiltered = aFilter.filter(_.length > 3)
Afiltered

//transformatios
//
val sTransf:Seq[String] = Seq("hello", "world")
val r = sTransf.map {
  _.reverse
}




