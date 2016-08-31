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

