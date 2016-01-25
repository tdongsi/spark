/**
  * Created by cdongsi on 1/25/16.
  */
object functionsC {

  def main(args: Array[String]): Unit = {
    printStrings("Groovy", "Clojure", "Python", "Java")
  }

  /*
  varargs method in Scala
   */
  def printStrings(args: String*)= {
    var i: Int = 0

    for (arg <- args) {
      println("Arg value: ["+ i + "]: " + arg)
      i += 1
    }
  }

}
