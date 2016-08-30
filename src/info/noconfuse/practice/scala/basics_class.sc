/**
  * simple class
  */
class A {
  val brand = "Benz"

  def add(a: Int, b: Int): Int = a + b
}

val a = new A
a.add(1, 2)
a.brand


/**
  * class with a constructor
  */
class B(brand: String) {
  /**
    * constructor
    */
  val color: String = if (brand == "BMW") {
    "blue"
  } else if (brand == "Benz") {
    "white"
  } else {
    "black"
  }

  /**
    * instance method
    */
  def add(a: Int, b: Int): Int = a + b
}

val benz = new B("Benz")
benz.color


/**
  * function v.s. method
  */
class C {
  var acc = 0

  def m_inc = {
    acc += 1
  }

  def f_inc = {
    () => acc += 1
  }
}
val c = new C
c.m_inc // call instance method
c.acc
c.f_inc // returns the function as a value
c.acc

