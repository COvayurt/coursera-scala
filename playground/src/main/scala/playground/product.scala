package playground

import scala.annotation.tailrec

object Product {

  def calc(f: Int => Int, g: (Int, Int) => Int, z: Int)(a:Int, b:Int): Int = {
    if (a > b) z
    else g(a, calc(f, g, z)(a + 1, b))
  }

  def product(f: Int => Int)(a: Int, b: Int): Int = calc(f, (x, y) => x * y, 1)(a, b)

  def sum(f: Int => Int)(a: Int, b: Int): Int = calc(f, (x, y) => x + y, 0)(a, b)

  def factorial(x: Int) = product(x => x)(1, x)

}