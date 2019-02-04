package lectures.part1basics

object Functions extends App {

  def aFunction(a: String, b: Int): String = {
    a + " " + b
  }

  println(aFunction("hello", 38))

  def aParameterLessFunction(): Int = 42

  // It's not necessary to define return type of functions (it could be inferred too as variable and values)
  println(aParameterLessFunction())
  println(aParameterLessFunction)

  def aRepeatedFunction(aString: String, n: Int): String = {
    if (n == 1) aString
    else aString + aRepeatedFunction(aString, n - 1)
  }

  println(aRepeatedFunction("hello", 5))

  // WHEN YOU NEED LOOPS, USE RECURSION.
  // For recursion it's needed to add the return type of a function.
  // It's a good practice specify the return type of a function.

  def aFunctionWithSideEffect(aString: String): Unit = println(aString)

  // We use functions with side effect to: print data, log data, write to a file ...
  // Apart from those cases, we should try to skip them (skip side effects as much as possible).

  // We can define functions inside functions (as small pieces)
  def aBigFunction(n: Int): Int = {
    def aSmallFunction(a: Int, b: Int): Int = a + b

    aSmallFunction(n, n - 1)
  }

  /* Exercises
    1. A greeting function (name, age) => "Hi, my name is ${name} and I am ${age} years old".
    2. Factorial function: 1 * 2 * 3 * 4 * 5 .. n
    3. A Fibonacci function:
      f(1) = 1
      f(2) = 1
      f(n) = f(n-1) + f(n-2)
    4. Test if a number is prime
   */

}
