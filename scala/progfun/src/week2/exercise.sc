object exercise {
  def factorial(n: Int): Int = {

    def loop(acc: Int, n: Int): Int = {
      if (n <= 1) acc else loop(acc*n, n-1)
    }

    loop(1, n)
  }

  def cube(x: Int): Int = x*x*x

  // Naive versions for computing sum_a^b( f(n) )
  def sumInts(a: Int, b: Int): Int = {
    if (a > b) 0 else a + sumInts(a+1, b)
  }

  def sumCubes(a: Int, b: Int): Int = {
    if (a > b) 0 else cube(a) + sumCubes(a+1, b)
  }

  def sumFactorials(a: Int, b: Int): Int = {
    if (a > b) 0 else factorial(a) + sumFactorials(a+1, b)
  }

  // High-order functions
  def sumFunc(a: Int, b: Int, f: Int => Int): Int = {
    if (a > b) 0 else f(a) + sumFunc(a+1, b, f)
  }

  def sumInt(a: Int, b: Int) = sumFunc(a, b, x => x)
  def sumCube(a: Int, b: Int): Int = sumFunc(a, b, cube)
  def sumFactorial(a: Int, b: Int) = sumFunc(a, b, factorial)

  def sum(f: Int => Int)(a: Int, b: Int): Int = {
    def loop(a: Int, acc: Int): Int = {
      if (a > b) acc
      else loop(a+1, acc + f(a))
    }

    loop(a, 0)
  }

  def sumCube2(a: Int, b: Int): Int = sum(cube)(a, b)

  for (a <- 1 to 10) {
    println("Value: " + sumCube(0, a) + " " + sumCube2(0, a))
  }

}
