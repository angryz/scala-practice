/*
 * Expressions
 */
1 + 1

/*
 * Values
 */
val two = 1 + 1
// two = 2 + 2 is invalid

/*
 * Variables
 */
var foo = "hello"
foo = "bar"

/*
 * Functions
 */
def addOne(n: Int): Int = n + 1
val three = addOne(2)
// 不带参数可以不写括号
def four() = 1 + 3
four

// Anonymous Functions
val addOneToo = (x: Int) => x + 1
addOneToo(4)

// use {}
def timesTwo(x: Int): Int = {
  println(s"${x} times 2")
  x * 2
}
timesTwo(3)

// Partial application
def add(x: Int, y: Int) = x + y
val add2 = add(2, _:Int)
add2(3)

// Curried functions
def multiply(x: Int)(y: Int) = x * y
multiply(2)(3)
val timesThree = multiply(3)_
timesThree(4)

// curry any function
val curriedAdd = (add _).curried
val addTow = curriedAdd(2)
addTow(5)

// Variable length arguments
def capitalizeAll(args: String*) = {
  args.map{ arg =>
    arg.capitalize
  }
}
capitalizeAll("foo", "bar", "Hello", "world")
