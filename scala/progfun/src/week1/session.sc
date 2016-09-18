object session {

  def abs(x: Double) = if (x < 0) -x else x

  def sqrt(x: Double): Double = {

    def sqrtIter(guess: Double): Double =
      if (isGoodEnough(guess)) guess
      else sqrtIter(improve(guess))

    def isGoodEnough(guess: Double) =
      abs(guess*guess/x-1) < 1e-5

    def improve(guess: Double) =
      (guess + x/guess) / 2

    sqrtIter(1.0)
  }

  sqrt(2)
  sqrt(4)
  sqrt(1e-20)
  sqrt(0.001)
  sqrt(1.0e20)
  sqrt(1.0e50)
}