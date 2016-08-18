object try_practice {

  try {
    Integer.parseInt("one")
  } catch {
    case _ => 0
  } finally {
    println("all finished")
  }
}