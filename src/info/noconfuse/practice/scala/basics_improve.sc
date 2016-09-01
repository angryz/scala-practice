// apply method
class Foo {}

object FooMaker {
  def apply() = new Foo
}

val newFoo = FooMaker()

// or
class Bar {
  def apply() = 0
}

val bar = new Bar
bar()


// Singleton
object Timer {
  var count = 0;

  def currentCount(): Int = {
    count += 1
    count
  }
}

Timer.currentCount()

// Singleton: companion object
class Hello(foo: String) {}

object Hello {
  def apply(foo: String) = new Hello(foo)
}

val hello = Hello("foo")


// Functions are Objects
object addOne extends Function1[Int, Int] {
  def apply(a: Int): Int = a + 1
}
addOne(1)

class AddOne extends Function1[Int, Int] {
  def apply(a: Int): Int = a + 1
}
val plusOne = new AddOne
plusOne(2)

class AddTwo extends (Int => Int) {
  def apply(a: Int): Int = a + 2
}
val plusTwo = new AddTwo
plusTwo(2)


// Pattern Matching
val times = 1

times match {
  case 1 => "one"
  case 2 => "two"
  case _ => "other"
}

times match {
  case i if i == 1 => "one"
  case i if i == 2 =>"two"
  case _ => "other"
}

// Matching different Types
def bigger(o: Any): Any = {
  o match {
    case i: Int if i < 0 => i - 1
    case i: Int => i + 1
    case d: Double if d < 0.0 => d - 0.1
    case d: Double => d + 0.1
    case text: String => text + "s"
  }
}
bigger(1)
bigger(-2)
bigger(0.3)
bigger(-0.4)
bigger("a")
