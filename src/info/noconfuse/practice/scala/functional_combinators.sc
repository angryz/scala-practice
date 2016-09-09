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
numbers.zip(List("a", "b", "c"))


// partition: splits a list based on where it falls with respect to a predicate function
numbers.partition(_ % 2 == 0)


// find: returns the first element of a collection that matches a predicate function
numbers.find((i: Int) => i > 2)


// drop: drops the first i elements
numbers.drop(2)


// dropWhile: removes the first elements that match a predicate function
numbers.dropWhile(_ % 2 != 0)