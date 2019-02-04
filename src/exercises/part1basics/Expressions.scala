package exercises.part1basics

object Expressions extends App {

  // EXERCISES

  // 1. Differences between "hello world" and println("hello world")

  // "hello world" returns a String without side effect
  // println("hello world") returns Unit and side effect.

  // 2. What is the result of the next code block

  // The vallue returned in someOtherValue is 42. The last line.

  val someValue = {
    2 < 3
  }

  val someOtherValue = {
    if (someValue) 239 else 986
    42
  }

}
