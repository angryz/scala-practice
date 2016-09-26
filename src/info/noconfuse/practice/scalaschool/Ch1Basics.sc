// 表达式 expressions
1 + 1

// 值 values
val two = 1 + 1 // 不变量
var num = 2 + 2 // 变量
num = 5

// 函数 functions
def add(x: Int, y: Int): Int = x + y
val three = add(1, 2)

def four() = 2 + 2
four()
four // 如果函数不带参数,可以不写括号

val addOne = (x: Int) => x + 1 // 匿名函数 =>
addOne(2) // 可将匿名函数保存为不变量

def timesTwo(x: Int): Int = {
  println(s"${x} times two")
  x * 2
} // 多个表达式用 {} 包含

{ i: Int =>
  println(s"${i} times two")
  i * 2
} // 多个表达式的匿名函数


// 部分应用 partial application
val add1 = add(1, _: Int) // _ 可以看做一个通配符
add1(2)


// 柯里化函数
def multiply(m: Int)(n: Int): Int = m * n
multiply(2)(3)

val timesFour = multiply(4) _
timesFour(2)

(add _).curried // 可对任何多参数函数柯里化


// 可变长参数
def captializeAll(args: String*) = {
  args.map( arg =>
    arg.capitalize
  )
}
captializeAll("apple", "facebook", "twitter")


// 类
class Calculator {
  val brand: String = "HP"
  def add(x: Int, y: Int): Int = x + y
}

val calc = new Calculator
calc.add(1, 2)
calc.brand

// 类:构造函数
class Computor(brand: String) {
  // 一个构造函数
  val color: String = if (brand == "TI") {
    "blue"
  } else if (brand == "HP") {
    "black"
  } else {
    "white"
  }

  def add(x: Int, y: Int): Int = x + y
}
val compHP = new Computor("HP")
compHP.color


// 函数和方法
class C {
  var acc = 0
  def minc = { acc += 1 } // a method
  val finc = { () => acc += 1 } // a function
}
val c = new C
c.minc // call method minc()
c.finc // return the function as a value
c.acc


// 继承
class ScientificCalculator(brand: String) extends Computor(brand) {
  def log(m: Double, base: Double): Double = math.log(m) / math.log(base)
}
val sCalc = new ScientificCalculator("HP")
sCalc.color
sCalc.log(4.5, 10.88)

// 继承: 重载方法
class EvenMoreScientificCalc(brand: String) extends ScientificCalculator(brand) {
  def log(m: Int): Double = log(m, math.exp(1))
}
val emsCalc = new EvenMoreScientificCalc("TI")
emsCalc.color
emsCalc.log(8)


// 抽象类
abstract class Shape {
  def getArea(): Int
}
class Circle(r: Int) extends Shape {
  def getArea(): Int = { r * r * 3 }
}
val circle = new Circle(2)
circle.getArea()


// 特质 Traits
trait Car {
  val brand: String
}

trait Shiny {
  val shineRefaction: Int
}

// 和抽象类一样用 extends 扩展一个特质
class BMW extends Car {
  val brand = "BMW"
}

// 通过 with 关键字扩展多个特质
class Benz extends Car with Shiny {
  val brand = "Benz"
  val shineRefaction = 12
}