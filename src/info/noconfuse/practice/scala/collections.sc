// List
val numberList = List(1, 2, 3, 4)

// Set : no repeat
val numberSet = Set(1, 1, 2, 2, 3)

// Tuple
val hostPort = ("localhost", 8080)
hostPort._1
hostPort._2

"remotehost" -> 8180

// Map
Map(1 -> 2)
Map("foo" -> "bar")


// Option : Map.get use Option as its return value
val nums = Map("one" -> 1, "two" -> 2)
nums.get("one")
nums.get("two")
nums.get("three")
// mutiply the number by two, otherwise return 0.
def getResult(n: Option[Int]): Int = {
  if (n.isDefined) {
    n.get * 2
  } else {
    0
  }
}
getResult(nums.get("two"))
getResult(nums.get("three"))
// use getOrElse is suggested
nums.get("one").getOrElse(0) * 2
nums.get("four").getOrElse(0) * 2
// pattern matching
def matchValue(n: Option[Int]): Int = n match {
  case Some(n) => n * 2
  case None => 0
}
matchValue(nums.get("two"))
matchValue(nums.get("three"))
