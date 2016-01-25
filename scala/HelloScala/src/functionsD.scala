/**
  * Created by cdongsi on 1/25/16.
  */
object functionsD {

  def main(args: Array[String]): Unit = {
    println(factorial(5))
    println(factorial(0))
  }

  def factorial(i: Int): Int = {

    def fact(i: Int, accumulator: Int): Int = {

      if ( i <= 1 )
        accumulator
      else {
        fact(i-1,accumulator*i)
      }
    }

    fact(i, 1)
  }
}
