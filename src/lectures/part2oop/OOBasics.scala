package lectures.part2oop

object OOBasics extends App {

  val person = new Person("John", 26)
  println(person.age)
  person.greet("Daniel")
}

// constructor
// with val or var attributes are public
// without one of themm the attribute is private
class Person(name: String, val age: Int = 0) {

  // body
  val x = 2

  println(1 + 3)

  // method
  // In this case we can use name as parameter or as class attribute
  def greet(name: String): Unit = println(s"${this.name} says: Hi, $name")

  // overloading
  def greet(): Unit = println(s"Hi, I am $name")

  // multiple constructors
  def this(name: String) = this(name, 0)

  def this() = this("John Doe")
}
