import math.abs

object exercise3 {
  val tolerance = 0.001

  def isCloseEnough(x: Double, y: Double) = {
    abs(1 - y/x)/x < tolerance
  }

  def fixedPoint(f: Double => Double)(firstGuess: Double) = {
    def iterate(guess: Double): Double = {
      val next = f(guess)
      if (isCloseEnough(guess, next)) next
      else iterate(next)
    }

    iterate(firstGuess)
  }

  fixedPoint(x => 1 + x/2)(1)

  // Square root of x is fixed point of the function y = x/y
  // Damping (for stability) by averaging
  def sqrt(x: Double) = fixedPoint(y => (x/y + y)/2)(1.0)
  sqrt(2)

  // Damping by averaging
  def averageDamp(f: Double => Double)(x: Double) = (x + f(x))/2

  def sqrt2(x: Double) = fixedPoint(averageDamp(y => x/y))(1.0)
  sqrt2(2)
}
