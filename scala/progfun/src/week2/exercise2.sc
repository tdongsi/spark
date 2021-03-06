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

  def mapReduce(map: Int => Int, reduce: (Int, Int) => Int, zero: Int)(a: Int, b: Int): Int = {
    if (a > b) zero
    else reduce(map(a), mapReduce(map, reduce, zero)(a+1, b))
  }

  def factorial3(n: Int) = mapReduce(x => x, (a, b) => a*b, 1)(1, n)

  for (a <- 0 to 10) {
    println("Value: " + factorial3(a) + " " + factorial2(a))
  }

}