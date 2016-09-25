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

