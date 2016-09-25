class Rational(x: Int, y: Int) {
  require(y != 0, "denomintor must be non-zero")

  def this(x: Int) = this(x, 1)

  private def gcd(a: Int, b: Int): Int = if (b == 0) a else gcd(b, a%b)
  private val g = gcd(x, y)

  def numer = x / g
  def denom = y / g

  def add(that: Rational) = {
    new Rational(numer * that.denom + denom * that.numer, denom * that.denom)
  }

  def neg() = {
    new Rational(-numer, denom)
  }

  def subtract(that: Rational) = {
    add(that.neg)
  }

  def less(that: Rational): Boolean = {
    numer * that.denom < that.numer * denom
  }

  def max(that: Rational): Rational = {
    if (this.less(that)) that else this
  }

  override def toString() = numer + "/" + denom
}

def addRational(x: Rational, y: Rational): Rational = {
  new Rational(x.numer * y.denom + x.denom * y.numer, y.denom * x.denom)
}

def makeString(x: Rational) =
  x.numer + "/" + x.denom

val a = new Rational(1, 2)
val b = new Rational(2, 3)
// Procedural way
makeString(addRational(a, b))
// Object-oriented way
a.add(b).toString()

val x = new Rational(1, 3)
val y = new Rational(5, 7)
val z = new Rational(3, 2)
x.add(y).subtract(z)
y.add(y)
x.less(y)
y.max(z)
