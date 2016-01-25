/**
  * Created by cdongsi on 1/25/16.
  */

object functionsB {
  def main(args: Array[String]): Unit = {
    delayed(time())
  }

  /*
  Scala function takes the last executed statement as the return statement
   */
  def time(): Long = {
    println("Getting time in nano")
    System.nanoTime()
  }

  /*
  => means that the function "t" is delayed and passed into the function "delayed"
  Without "=>", the function "t" will be executed first, instead being executed inside the function "delayed".
  The output without "=>" will have "Getting time in nano" printed out first.
   */
  def delayed(t: => Long) = {
    println("In the Delayed function")
    println("Param: " + t)
  }
}
