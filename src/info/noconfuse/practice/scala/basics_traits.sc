trait Car {
  val brand: String
}

trait Shiny {
  val shinyRefraction: Int
}

class Benz extends Car with Shiny {
  val brand = "Benz"
  val shinyRefraction = 20
}

/**
  * Types.
  *
  * Cache of generic Keys and Values.
  */
trait Cache[K, V] {
  def get(key: K): V
  def put(key: K, value: V)
  def delete(key: K)
}
