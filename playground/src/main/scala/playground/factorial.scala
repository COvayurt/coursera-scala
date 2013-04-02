package playground

import scala.annotation.tailrec

object Factorial {

  @tailrec
  def factorial(x:Double, acc:Double = 1): Double =
    if (x == 0)
      acc
    else
      factorial(x - 1, acc * x)

}
