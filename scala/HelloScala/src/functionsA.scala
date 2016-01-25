/**
  * Created by cdongsi on 1/25/16.
  */
object functionsA {

  def main(args: Array[String]): Unit = {
    println("Functions")

    println("Check addInt: " + addInt(5,6))
    println("Check addInt2: " + addInt2(5,7))
    println("Check addInt_default: " + addInt_default())
  }

  /*
  The last statement is the return statement by default
   */
  def addInt(a: Int, b: Int) : Int = {
    a+b
  }

  def addInt2(a: Int, b: Int) : Int = {
    var sum:Int = 0
    sum = a + b
    return sum
  }

  def addInt_default(a: Int=3, b: Int=4): Int = {
    a+b
  }

}
