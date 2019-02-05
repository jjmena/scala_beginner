package lectures.part1basics

import scala.annotation.tailrec

object Recursion extends App {

  def factorial(n: Int): BigInt = {
    if (n <= 1) 1
    else {
      println(s"Computing factorial of ${n} - I first need factorial of ${n - 1}")
      val result = n * factorial(n - 1)
      println(s"Computed factorial of ${n} which is ${result}")
      result
    }
  }

  println(factorial(10))
  // println(factorial(5000)) It fails due to stack overflow

  def anotherFactorial(n: Int): BigInt = {
    @tailrec
    def factHelper(x: Int, accumulator: BigInt): BigInt = {
      if (x < 1) accumulator
      else factHelper(x - 1, x * accumulator) // TAIL RECURSION = use recursive call as the LAST expression
    }

    factHelper(n, 1)
  }

  println(anotherFactorial(10))
  println(anotherFactorial(5000))

  // WHEN YOU NEED LOOPS, USE TAIL RECURSION

  /*
    Exercises
        1. Concatenate String n times as tail recursive
        2. isPrime function as tail recursive
        3. Fibonacci fuction, tail recursive
   */

}
