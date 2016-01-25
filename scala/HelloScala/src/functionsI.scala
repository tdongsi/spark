/**
  * Created by cdongsi on 1/25/16.
  */
object functionsI {

  def main(args: Array[String]): Unit = {
    /*
    Strategy pattern is less important because you can change a function at run-time.
     */
    val inc = (x: Int) => x * 2

    println("Answer is: " + inc(7) )
  }

}
