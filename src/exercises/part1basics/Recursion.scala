package exercises.part1basics

import java.util.concurrent.atomic.DoubleAccumulator

import scala.annotation.tailrec

object Recursion extends App {

  // Exercise 1 - Concatenate n strings tail recursive.
  @tailrec
  def concatenate(aString: String, n: Int, accumulator: String): String =
    if (n == 0) accumulator
    else concatenate(aString, n - 1, accumulator + aString)

  println(concatenate("helloString", 3, ""))

  // Exercise 2 - IsPrime tail recursive.
  def isPrime(n: Int): Boolean = {

    @tailrec
    def isPrimeUntil(d: Int, isStillPrime: Boolean): Boolean =
      if (!isStillPrime) false
      else if (d == 1) isStillPrime
      else isPrimeUntil(d - 1, n % d != 0)

    isPrimeUntil(n / 2, true)
  }

  println(isPrime(37))
  println(isPrime(2003))
  println(isPrime(37 * 2003))

  // Exercise 3 - Fibonacci function tail recursive
  def fibonacci(n: Int): Int = {
    @tailrec
    def fibonacciHelper(current: Int, nextToLast: Int, last: Int): Int = {
      if (current == n) last
      else fibonacciHelper(current + 1, last, nextToLast + last)
    }

    if (n <= 2) 1 else fibonacciHelper(2, 1, 1)
  }


  def checkFib(n: Int) = {
    def checkFibHelper(n: Int, current: Int): Unit = {
      if (n == current) print(fibonacci(current))
      else {
        print(fibonacci(current) + " ")
        checkFibHelper(n, current + 1)
      }

    }

    checkFibHelper(n, 1)
  }

  checkFib(20)


}
