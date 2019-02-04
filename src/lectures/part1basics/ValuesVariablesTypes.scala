package lectures.part1basics

object ValuesVariablesTypes extends App {

  val x: Int = 42
  println(x)

  // VALS ARE IMMUTABLE (like Java final)

  // COMPILER CAN INFER TYPES (Should it be maintained with the same type al the time? YES)

  val aString: String = "Hello World"
  val anotherString = "Good bye World"

  val aBoolean: Boolean = false
  val aChar: Char = 'a'
  val aInt: Int = x
  val aShort: Short = 4632
  val aLong: Long = 123123L
  val aFloat: Float = 1.02f
  val aDouble: Double = 2.04

  // variables

  var aVariable: Int = 4

  aVariable = 5 // We can modify the value of a variable

  // Example of reassign a variable infering types
  var aStringAndInt = "Value as String"

  // We cannot do that because the inferred type is String, then we cannot modify it to Int
  // aStringAndInt = 10

}
