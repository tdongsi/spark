/**
  * Created by cdongsi on 1/25/16.
  */
object closeme {

  /*
  Demonstrate closure in Scala
   */
  def main(args: Array[String]): Unit = {
    println( "multi: = " + multiplier(6) )

    factor = 16
    println("new val: " + multiplier(6) )
  }

  var factor = 3
  val multiplier = (i: Int) => i * factor
}
