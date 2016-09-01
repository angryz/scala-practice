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