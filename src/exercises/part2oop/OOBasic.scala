package exercises.part2oop

object OOBasic extends App {

  // Create two writers
  val writer1 = new Writer("Vicente", "Alexandre", 1980)
  val writer2 = new Writer("Pablo", "Neruda", 1972)

  // Create two books
  val book1 = new Novel("Scala in action", 2011, writer1)
  val book2 = new Novel("Liferay for dummies", 2000, writer2)

  println(writer1.fullName())
  println(book1.authorAge())
  println(book1.isWrittenBy(writer2))
  println(book2.copy(2019))

  // Counter example
  val counter = new Counter(1)
  println(counter.increment(10).decrement(3).increment().count)


}

class Writer(firstName: String, surName: String, val year: Int) {

  def fullName(): String = s"$firstName $surName"

}

class Novel(name: String, releaseYear: Int, author: Writer) {

  def authorAge(): Int = releaseYear - author.year

  def isWrittenBy(author: Writer): Boolean = this.author == author

  def copy(newYear: Int): Novel = new Novel(name, newYear, author)
}

class Counter(val count: Integer) {

  def increment(): Counter = increment(1)

  def increment(amount: Int): Counter = new Counter(count + amount) // immutability

  def decrement(): Counter = decrement(1)

  def decrement(amount: Int): Counter = new Counter(count - amount)


}
