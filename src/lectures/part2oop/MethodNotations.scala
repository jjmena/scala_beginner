package lectures.part2oop

object MethodNotations extends App {

  class Person(val name: String, favoriteMovie: String) {

    def likes(movie: String): Boolean = movie == favoriteMovie

    def +(person: Person): String = s"${this.name} is hanging out with ${person.name}"

    def unary_! : String = s"$name, what the heck?!"

    def isAlive: Boolean = true

    def apply(): String = s"Hi, my name is $name and I like $favoriteMovie"
  }

  // INFIX NOTATION

  val mary = new Person("Mary", "Inception")
  println(mary.likes("Inception"))
  println(mary likes "Inception") // Equivalent
  // Infix notation = operator notation (syntactic sugar)

  // "operators" in Scala
  val tom = new Person("Tom", "Fight Club")
  println(mary + tom)
  println(mary.+(tom))

  // We can use the same notation with number operators (dot notation).
  println(1 + 2)
  println(1.+(2))

  // ALL OPERATORS ARE METHODS
  // Akka actors have ! ?

  // prefix notation
  val x = -1 // equivalent with 1.unary_-
  val y = 1.unary_-
  // unary_ prefix only works with - + ~ !

  println(!mary)
  println(mary.unary_!)

  // postfix notation
  println(mary.isAlive)
  println(mary isAlive) // Sometimes postfix notations it's quite difficult to understand (not readable).

  // apply
  println(mary.apply())
  println(mary()) // equivalent

}
