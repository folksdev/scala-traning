val myMap = Map("MI" -> "Michigan",
  "OH" -> "Ohio",
  "WI" -> "Wisconsin",
  "IA" -> "Iowa")
myMap.size
val myMapDuplicateKeys = Map("MI" -> "Michigan",
  "OH" -> "Ohio",
  "WI" -> "Wisconsin",
  "MI" -> "Michigan")
myMapDuplicateKeys.size
val aNewMap = myMap + ("IL" -> "Illinois")
aNewMap.contains("IL")
val mapValues = myMap.values
mapValues.size
mapValues.head
val lastElement = mapValues.last
lastElement
// for (mval <- mapValues) println(mval)
// NOTE that the following will not compile, as iterators do not implement "contains"
//mapValues.contains("Illinois") should be (true)
//what is the final value
val myMapSameKey = Map ("MI" -> "Michigan",
  "OH" -> "Ohio",
  "WI" -> "Wisconsin",
  "MI" -> "Meechigan")
val mapValuesSameKey = myMapSameKey.values
mapValuesSameKey.size
myMapSameKey ("MI")
val myMapMixedKeys = Map ("Ann Arbor" -> "MI",
  49931 -> "MI")
myMapMixedKeys("Ann Arbor")
myMapMixedKeys(49931)

val myMapMixedValues = scala.collection.mutable.Map.empty[String, Any]
myMapMixedValues + ("Ann arbour" -> (48103, 48104, 48108))
myMapMixedValues + ("Houghton" -> 49931)



//myMapMixedValues("Houghton")
//myMapMixedValues("Ann Arbor")
// what happens if you change the Any to Int

myMap ("MI")
myMap ("IA")
//removing elemenst
val aNewMapRemovedElSimple = myMap - "MI"
aNewMapRemovedElSimple.contains ("MI")

//what if key not found
val myMapForException = Map ("OH" -> "Ohio", "WI" -> "Wisconsin", "IA" -> "Iowa")

// Cheat Code (because this is hard to illustrate): uncomment the intercept code to make this pass
//intercept[NoSuchElementException] {
//myMapForException ("MI")
//}
val aNewMapWithMultipleRemovals = myMap -- List ("MI", "OH")
aNewMapWithMultipleRemovals.contains("MI")
aNewMapWithMultipleRemovals.contains("WI")
aNewMapWithMultipleRemovals.size
val aNewMapWithTupleRemovals = myMap - ("MI", "WI")
// Notice: single '-' operator for tuples
aNewMapWithTupleRemovals.contains ("MI")
aNewMapWithTupleRemovals.contains ("OH")
aNewMapWithTupleRemovals.size
//remove nonExistentEl
val aNewMapNonExistent = myMap - "MN"
aNewMapNonExistent.equals (myMap)

//order in maps does not matter
val myMap1 = Map ("MI" -> "Michigan",
  "OH" -> "Ohio",
  "WI" -> "Wisconsin",
  "IA" -> "Iowa")
val myMap2 = Map ("WI" -> "Wisconsin",
  "MI" -> "Michigan",
  "IA" -> "Iowa",
  "OH" -> "Ohio")

myMap1.equals(myMap2)