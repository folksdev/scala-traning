val mySet = Set("Michigan", "Ohio", "Wisconsin", "Iowa")
mySet.size
val mySetDistinct = Set("Michigan", "Ohio", "Wisconsin", "Michigan")
mySetDistinct.size
val aNewSet = mySet + "Illinois"
aNewSet.contains("Illinois")



val mySetMixedType = Set("Michigan", "Ohio", 12)
mySetMixedType.contains(12)
mySetMixedType.contains("MI")

val mySetDelete = Set("Michigan", "Ohio", "Wisconsin", "Iowa")
val aNewSetDelete = mySet - "Michigan"
aNewSetDelete.contains("Michigan")

val mySetMultipleDeletion = Set("Michigan", "Ohio", "Wisconsin", "Iowa")
val aNewSetMultipleDeletion = mySet -- List("Michigan", "Ohio")
aNewSetMultipleDeletion.contains("Michigan")
aNewSetMultipleDeletion.contains("Wisconsin")
aNewSetMultipleDeletion.size

val mySetTupleDeletion = Set("Michigan", "Ohio", "Wisconsin", "Iowa")
val aNewSetTupleDeletion = mySet - ("Michigan", "Ohio") // Notice: single '-' operator for tuples
aNewSetTupleDeletion.contains("Michigan")
aNewSetTupleDeletion.contains("Wisconsin")
aNewSetTupleDeletion.size
//remove non existent
val mySetNonExistent = Set("Michigan", "Ohio", "Wisconsin", "Iowa")
val aNewSetNonExistent = mySet - "Minnesota"
aNewSetNonExistent.equals(mySet)

val mutableSet = scala.collection.mutable.Set("A", "B")
mutableSet += "C"
mutableSet -= "B"

val mySetNumbers = Set(1, 3, 4, 9)
var sum = 0
for (i <- mySetNumbers)
  sum = sum + i //Of course this is the same thing as mySet.reduce(_ + _)

//intersection
val mySet1 = Set("Michigan", "Ohio", "Wisconsin", "Iowa")
val mySet2 = Set("Wisconsin", "Michigan", "Minnesota")
val aNewSetIntersect = mySet1 intersect mySet2
// NOTE: Scala 2.7 used **, deprecated for & or intersect in Scala 2.8
aNewSetIntersect.equals(Set("Michigan", "Wisconsin"))
//union
val aNewSetUnion = mySet1 union mySet2 // NOTE: You can also use the "|" operator
aNewSetUnion.equals(Set("Michigan", "Wisconsin", "Ohio", "Iowa", "Minnesota"))

//subset checking
val mySet3 = Set("Wisconsin", "Michigan")
mySet2 subsetOf mySet1
mySet3 subsetOf mySet1

//difference of sets
val aNewSetDifference = mySet1 diff mySet3 // Note: you can use the "&~" operator if you *really* want to.
aNewSetDifference.equals(Set("Ohio", "Iowa"))

val mySetNoOrder1 = Set("Michigan", "Ohio", "Wisconsin", "Iowa")
val mySetNoOrder2 = Set("Wisconsin", "Michigan", "Ohio", "Iowa")
mySetNoOrder1.equals(mySetNoOrder2)





