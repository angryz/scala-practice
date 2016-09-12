val numbers = List(1, 2, 3, 4)

// map
numbers.map((i: Int) => i * 2)

def timesTwo(i: Int): Int = i * 2
numbers.map(timesTwo _)

def squared(n: Int): Int = n * n
numbers map squared


// foreach: like map but without return value
numbers.foreach((i: Int) => i * 2)


// filter
numbers.filter((i: Int) => i % 2 == 0)
def isEven(i: Int): Boolean = i % 2 == 0
numbers.filter(isEven _)
numbers filter isEven


// zip: aggregates the contents of two lists into a single list of pairs
numbers.zip(List("a", "b", "c", "d", "e"))


// partition: splits a list based on where it falls with respect to a predicate function
numbers.partition(_ % 2 == 0)


// find: returns the first element of a collection that matches a predicate function
numbers.find((i: Int) => i > 2)


// drop: drops the first i elements
numbers.drop(2)


// dropWhile: removes the first elements that match a predicate function
numbers.dropWhile(_ % 2 != 0)


// foldLeft: 0 is the starting value (Remember that numbers is a List[Int]), and m acts as an
// accumulator
numbers.foldLeft(0)((m: Int, n: Int) => m + n)


// foldRight: same as foldLeft except it runs in the opposite direction
numbers.foldRight(0)((m: Int, n: Int) => m + n)


// flatten: collapses one level of nested structure
List(List(1, 2), List(3, 4)).flatten


// flatMap: takes a function that works on the nested lists and then concatenates the results
// back together
val nestedNumbers = List(List(1, 2), List(3, 4))
nestedNumbers.flatMap(x => x.map(_ * 2))
// same as
nestedNumbers.map((x: List[Int]) => x.map(_ * 2)).flatten


// generalized functional combinators
def ourMap(numbers: List[Int], fn: Int => Int): List[Int] = {
  numbers.foldRight(List[Int]()) { (x: Int, xs: List[Int]) =>
    fn(x) :: xs
  }
}
ourMap(numbers, timesTwo(_))
