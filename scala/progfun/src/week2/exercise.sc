object exercise {
  def factorial(n: Int): Int = {

    def loop(acc: Int, n: Int): Int = {
      if (n <= 1) acc else loop(acc*n, n-1)
    }

    loop(1, n)
  }

  for ( a <- 0 to 10) {
    println("Value: " + factorial(a))
  }
}