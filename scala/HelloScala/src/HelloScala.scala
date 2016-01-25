/**
  * Created by cdongsi on 1/25/16.
  */

import scala.collection.immutable.HashMap
import scala.collection.immutable.{HashMap, TreeMap}

object HelloScala {

  def main(args: Array[String]) {
    // var keyword is for mutable
    var myVar: String = "World"

    println("Hello Scala!!!")

    println( "Hello " + myVar + " check out.")
    myVar = "Scala"
    println( "Hello " + myVar + " check out.")

    // val keyword is for immutable
    val oneMore = 30
    if (oneMore < 20) {
      println("Try out if statement")
    } else {
      println("Else statement")
    }
  }

}
