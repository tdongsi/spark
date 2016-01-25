/**
  * Created by cdongsi on 1/25/16.
  */
object strings {

  def main(args: Array[String]) {

    var myStr = "This is a fairly long string: your age is %d"

    println(myStr.length())
    println(myStr.charAt(3))

    printf(myStr, 35)
  }

}
