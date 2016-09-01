// apply method
class Foo {}

object FooMaker {
  def apply() = new Foo
}

val newFoo = FooMaker()

// or
class Bar{
  def apply() = 0
}
val bar = new Bar
bar()


