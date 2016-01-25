/**
  * Created by cdongsi on 1/25/16.
  */
object functionsH {

  def main(args: Array[String]): Unit = {
    println( apply(layout, 10) )
  }

  /*
  One implication is that we can serialize functions and transfer it over network.
  Then running this function on the local data.
  In short, code as data.
  In Big Data, code transfer is faster than data transfer.
   */
  def apply(f:Int => String, v:Int) = f(v)

  /*
  Generic method
   */
  def layout[T](x: T) = "[" + x.toString() + "]"

}
