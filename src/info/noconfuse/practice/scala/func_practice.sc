object func_practice {

  def hello(name: String): String = {
    s"Hello ${name}!"
  }

  hello("Peter")

  def hello1(name: String) = {
    s"Hello ${name}!!"
  }

  hello1("Jackson")

  def add(x: Int, y: Int) = x + y

  add(1, 2)

}