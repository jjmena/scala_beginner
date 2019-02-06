package lectures.part1basics

object StringOps extends App {

  val str: String = "Hello, I am learning Scala"

  println(str.charAt(2))
  println(str.substring(7, 11))
  println(str.split(" ").toList)
  println(str.startsWith("Hello"))
  println(str.replace(" ", "-"))
  println(str.toLowerCase())
  println(str.length)

  // Scala own utilities
  val aNumberString = "45"
  val aNumber = aNumberString.toInt
  println('a' +: aNumberString :+ 'z')
  println(str.reverse)
  println(str.take(2))

  // Scala-specific: String interpolator

  // S-interpolators
  val name = "David"
  val age = 12
  val greeting = s"Hello, my name is $name and I am $age years old" // without s at the beginning it's the string without interpolation
  val anotherGreeting = s"Hello, my name is $name and I will be turning ${age + 1} years old" // with ${} we can specify whatever expression
  print(anotherGreeting)

  // F-interpolators
  val speed = 1.2f
  val myth = f"$name%s can eat $speed%2.2f burgers per minute" // Here we specify the format of the number (two decimals)
  // %s means string, %2.2f means 2 character minimum and 2 decimal precision.
  // Probably it's related with Java String format convention.
  println(myth)

  // Format interpolator it's similar to printf function.

  // raw-interpolator
  // Just to print string without interpretation
  println(raw"This is a \n newline")
  val escaped = "This is a \n newline"
  print(raw"$escaped") // At this case it doesn't ignore \n character.

}
