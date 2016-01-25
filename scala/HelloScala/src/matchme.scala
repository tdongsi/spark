/**
  * Created by cdongsi on 1/25/16.
  */
object matchme {

  def main(args: Array[String]): Unit = {
    println(matchTest("two"))
    println(matchTest(2))
    println(matchTest(1))
    println(matchTest("bubba"))

    val alice = new Person("Alice", 25)
    val bob = new Person("Bob", 44)
    val chuck = new Person("Chuck", 56)

    for (person <- List(alice, bob, chuck)) {
      person match {
        case Person("Alice", 25) => println("Yo Alice")
        case Person(name, age) => println( "Age: " + age + " name: " + name)
      }
    }
  }

  def matchTest(x: Any) = {

    x match {
      case 1 => "one"
      case "two" => 2
      case y:Int => "scala.int"
      case _ => "who knows"
    }

  }

  /*
  This declaration will create a value object for each case statement above.
   */
  case class Person(name: String, age: Int)

}
