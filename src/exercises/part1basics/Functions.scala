package exercises.part1basics

object Functions extends App {

  // 1. Greeting function
  def aGrettingFunction(name: String, age: Int): String = {
    s"Hi, my name is ${name} and I am ${age} years old"
  }

  println(aGrettingFunction("Daniel", 12))

  // 2. Factorial function: 1 * 2 * 3 * 4 * 5 .. n
  def aFactorialFunction(n: Int): Long = {
    if (n == 0 || n == 1) 1 else n * aFactorialFunction(n - 1)
  }

  println(aFactorialFunction(20))

  // 3. Fibonacci function
  def aFibonacciFunction(n: Int): Int = {
    if (n == 1 || n == 2) 1 else aFibonacciFunction(n - 1) + aFibonacciFunction(n - 2)
  }

  println(aFibonacciFunction(20))

  // 4. Test if a number if prime
  def isPrimeNumber(n: Int): Boolean = {
    def isPrimeUtil(t: Int): Boolean = {
      if (t == 1) true else n % t != 0 && isPrimeUtil(t - 1)
    }

    isPrimeUtil(n / 2)
  }

  println(isPrimeNumber(37))
  println(isPrimeNumber(2003))
  println(isPrimeNumber(37 * 2003))


}
