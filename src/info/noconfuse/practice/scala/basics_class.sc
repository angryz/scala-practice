/**
  * simple class
  */
class CalculatorA {
  val brand = "Benz"

  def add(a: Int, b: Int): Int = a + b
}

val calcA = new CalculatorA
calcA.add(1, 2)
calcA.brand


/**
  * class with a constructor
  */
class CalculatorB(brand: String) {
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

val benz = new CalculatorB("Benz")
benz.color
