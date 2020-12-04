import scala.collection.mutable

val myMap = mutable.Map("MI" -> "Michigan", "OH" -> "Ohio", "WI" -> "Wisconsin", "IA" -> "Iowa")
myMap.size
myMap += "OR" -> "Oregon"
myMap contains "OR"
//remove
myMap -= "OH"
myMap contains "OH"
//tuple removal
val myMapTupleRemoval = mutable.Map("MI" -> "Michigan", "OH" -> "Ohio", "WI" -> "Wisconsin", "IA" -> "Iowa")
myMapTupleRemoval -= ("IA", "OH")
myMapTupleRemoval contains "OH"
myMapTupleRemoval.size
//tuple adding
val myMapTupleAdded = mutable.Map("MI" -> "Michigan", "WI" -> "Wisconsin")
myMapTupleAdded += ("IA" -> "Iowa", "OH" -> "Ohio")
myMapTupleAdded contains "OH"
myMapTupleAdded.size
//Listadding
val myMapListAdding = mutable.Map("MI" -> "Michigan", "WI" -> "Wisconsin")
myMapListAdding ++= List("IA" -> "Iowa", "OH" -> "Ohio")
myMapListAdding contains "OH"
myMapListAdding.size
//lists removal
val myMapListRemoval = mutable.Map("MI" -> "Michigan", "OH" -> "Ohio", "WI" -> "Wisconsin", "IA" -> "Iowa")
myMapListRemoval --= List("IA", "OH")
myMapListRemoval contains "OH"
myMapListRemoval.size
//clearing maps
val myMapClearing = mutable.Map("MI" -> "Michigan", "OH" -> "Ohio", "WI" -> "Wisconsin", "IA" -> "Iowa")
myMapClearing.clear() // Convention is to use parens if possible when method called changes state
myMapClearing contains "OH"
myMapClearing.size



