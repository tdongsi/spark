val x = new Rational(1, 2)
x.numer
x.denom

class Rational(x: Int, y: Int) {
  def numer = x
  def denom = y

  def add(that: Rational) = {
    new Rational(numer * that.denom + denom * that.numer, denom * that.denom)
  }

  def neg() = {
    new Rational(-numer, denom)
  }

  def subtract(that: Rational) = {
    add(that.neg())
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