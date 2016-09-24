object exercise2 {

  def sum(f: Int => Int)(a: Int, b: Int): Int = {
    def loop(a: Int, acc: Int): Int = {
      if (a > b) acc
      else loop(a+1, acc + f(a))
    }

    loop(a, 0)
  }

  def product(f: Int => Int)(a: Int, b: Int): Int = {
    def loop(a: Int, acc: Int): Int = {
      if (a > b) acc
      else loop(a+1, acc*f(a))
    }

    loop(a, 1)
  }

  def factorial(n: Int) = product(x => x)(1, n)

  def integrate(op: (Int, Int) => Int, init: Int)(f: Int => Int)(a: Int, b: Int): Int = {
    def loop(a: Int, acc: Int): Int = {
      if (a > b) acc
      else loop(a+1, op(acc, f(a)))
    }

    loop(a, init)
  }

  def factorial2(n: Int) = integrate((a, b) => a*b, 1)(x => x)(1,n)

  for (a <- 0 to 10) {
    println("Value: " + factorial(a) + " " + factorial2(a))
  }
}