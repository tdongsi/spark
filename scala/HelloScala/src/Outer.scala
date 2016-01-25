/**
  * Created by cdongsi on 1/25/16.
  */

package com.tdongsi

class Outer {

  class Inner {

    def f(): Unit = {
      println("f")
    }

    class InnerMost {
      f()
    }
  }

  (new Inner).f()
}
