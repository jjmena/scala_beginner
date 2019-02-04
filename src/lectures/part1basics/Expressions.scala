package lectures.part1basics

object Expressions extends App {

  val x = 1 + 2 // EXPRESSION
  println(x)

  println(2 + 3 * 4)
  // Mathematical Expressions
  // + - * / & | ^ << >> >>> (right shift with zero extension)


  println(1 == x)
  // Boolean expressions
  // == != > >= < <=

  println(!(1 == x))
  // Boolean expressions
  // ! && ||

  var aVariable = 2
  aVariable += 3 // also works with -= *= /=  .... side effects
  println(aVariable += 3) // It doesn't return the value, it return () (Unit == () == void)

  // Instructions (Do something) vs Expressions (Return a value)
  // In general instructions have side effects and return Unit
  // Expressions doesn't have any side effect and returns a value

  // IF Expression (it's an expression, returns a value)
  val aCondition = true
  val aConditionValue = if (aCondition) 5 else 3 // It returns a value based on the condition. It returns the last line value.
  println(aConditionValue)
  println(if (aCondition) 5 else 3)
  println(1 + 3)

  // TRY TO AVOID THIS KIND OS STRUCTURE
  // While it's a part of iterative languages. Try to do it in a different way.
  // In functional programming we should skip this kind of structures
  var i = 0
  while (i < 10) {
    println(i)
    i += 1
  }

  // EVERYTHING in Scala is an Expression
  val aWeirdValue = (aVariable = 3) // Unit == void == ()
  println(aWeirdValue)

  // Those operations have side effects: println(), whiles, reassigning (all return Unit)

  // Code Block

  val aCodeBlock = {
    val y = 2
    val z = y + 1

    if (z > 2) "hello" else "good bye"
  }

  // At this point we cannot use z because it's out of scope of the block.
  // val anotherValue = z

  // EXERCISES

  // 1. Differences between "hello world" and println("hello world")
  // 2. What is the result of the next code block
  val someValue = {
    2 < 3
  }

  val someOtherValue = {
    if (someValue) 239 else 986
    42
  }


}
