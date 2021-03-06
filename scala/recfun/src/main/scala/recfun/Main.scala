package recfun

object Main {
  def main(args: Array[String]) {
    println("Pascal's Triangle")
    for (row <- 0 to 10) {
      for (col <- 0 to row)
        print(pascal(col, row) + " ")
      println()
    }
  }

  /**
   * Exercise 1
   */
    def pascal(c: Int, r: Int): Int = {
      if (c == 0 || c == r) 1 else {
        pascal(c-1, r-1) + pascal(c, r-1)
      }
    }
  
  /**
   * Exercise 2
   */
    def balance(chars: List[Char]): Boolean = {
      def checkBalance(count: Int, chars: List[Char]): Boolean = {
        if (count < 0 )
          false
        else if (chars.isEmpty && count == 0)
          true
        else if (chars.isEmpty && count != 0)
          false
        else if (chars.head == '(')
          checkBalance(count+1, chars.tail)
        else if (chars.head == ')')
          checkBalance(count-1, chars.tail)
        else
          checkBalance(count, chars.tail)
      }

      if (chars.isEmpty) true else
        checkBalance(0, chars)
    }
  
  /**
   * Exercise 3
   */
    def countChange(money: Int, coins: List[Int]): Int = {

      def _countChange(money: Int, coins: List[Int]): Int = {
        if (money == 0)
          1
        else if (money < 0 || coins.isEmpty)
          0
        else
          countChange(money-coins.head, coins) + countChange(money, coins.tail)
      }

      val ordered = coins.sorted(Ordering[Int].reverse)
      _countChange(money, ordered)

    }
  }
