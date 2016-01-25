/**
  * Created by cdongsi on 1/25/16.
  */

package com.intuit.zoo

trait Tail {

  def wagTail: Unit = {
    println("Wagging tail")
  }

  def stopTail: Unit = {
    println("Stop")
  }
}

trait FluffyTail extends Tail {
  override def wagTail: Unit = {
    println("Wagging tail and knocking it over")
  }
}

object zoo {

  def main(args: Array[String]) {

  }

}

abstract class Pet(name: String) {

  def speak

  def ownerHome: Unit = {
    println("excited")
  }

  def jumpForJoy: Unit = {
    println("Jumping")
  }
}

class Dog(name: String) extends Pet(name) with Tail with FluffyTail {
  def speak(): Unit = {
    println("Woof")
  }

  override def ownerHome: Unit = {
    jumpForJoy
    speak()
  }
}
