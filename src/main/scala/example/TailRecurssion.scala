package example

import scala.annotation.tailrec

object TailRecurssion extends App{

  def fibWithTailRec(n: BigInt): BigInt = {
    @tailrec
    def innerFib(curr: BigInt, prev: BigInt, next: BigInt): BigInt = {
      if (curr == 0) prev
      else innerFib(curr - 1, next, next+prev)
    }
    innerFib(n, 1, 1)
  }
  println(fibWithTailRec(10000))


}
