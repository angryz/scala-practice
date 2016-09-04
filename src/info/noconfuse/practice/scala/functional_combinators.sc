val numbers = List(1, 2, 3, 4)

// map
numbers.map((i: Int) => i * 2)

def timesTwo(i: Int): Int = i * 2
numbers.map(timesTwo _)

def squared(n: Int): Int = n * n
numbers map squared


// foreach: like map but without return value
numbers.foreach((i: Int) => i * 2)

