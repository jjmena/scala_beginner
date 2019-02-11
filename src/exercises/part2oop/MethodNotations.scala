package exercises.part2oop

object MethodNotations extends App {

  /*
    Exercises
      1. Overload the + operator
        mary + "the rockstar" => new person "Mary (the rockstar)"

      2. Add an age to the person class (default value 0)
        Add a unary + operator => new person with the age + 1
        +mary => mary with the age incrementer

      3. Add a "learns" method in the Person class receive a String parameter => "Mary learns Scala"
         Add a learnsScala method (which receives any parameter), calls learns method with Scala
         Use it in postfix notation

      4. Overload the apply method to receive a String
         mary.apply(2) => "Mary watched Inception 2 times"

   */

  class Person(val name: String, favoriteMovie: String, age: Int = 0) {

    def likes(movie: String): Boolean = movie == favoriteMovie

    def +(person: Person): String = s"${this.name} is hanging out with ${person.name}"

    def +(nickname: String): Person = new Person(s"$name ($nickname)", favoriteMovie, age)

    def unary_! : String = s"$name, what the heck?!"

    def unary_+ : Person = new Person(this.name, this.favoriteMovie, this.age + 1)

    def isAlive: Boolean = true

    def apply(): String = s"Hi, my name is $name and I like $favoriteMovie with $age years old"

    def apply(times: Int): String = s"$name watched $favoriteMovie $times times"

    def learns(topic: String): String = s"$name learns $topic"

    def learnsScala(): String = this learns "Scala"


  }

  val mary = new Person("Mary", "Inception", 34)

  // CHECK EXERCISE 1
  println((mary + "the Rockstar")())

  // CHECK EXERCISE 2
  println((+mary)())

  // CHECK EXERCISE 3
  println(mary learns "Java")
  println(mary learnsScala)

  // CHECK EXERCISE 4
  println(mary(2))


}
