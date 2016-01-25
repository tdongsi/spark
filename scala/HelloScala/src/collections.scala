/**
  * Created by cdongsi on 1/25/16.
  */
object collections {

  def main(args: Array[String]) {
    val x = List(1,2,3,4)

    var z = Set(1,2,2,3)

    val m = Map("one" -> 1, "two" -> 2, "four" -> 4)

    println(x)
    println(z)
    println(m.get("one").get)
  }
}
