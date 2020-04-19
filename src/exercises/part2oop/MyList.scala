package exercises.part2oop

abstract class MyList[+A] {

  /*
    Methods:
    head = first  element of the list.
    tail = remainder of the list.
    isEmpty = is this list empty.
    add(int) => new list with this element added.
    toString => a string representation of the list.
   */

  def head(): A

  def tail(): MyList[A]

  def isEmpty(): Boolean

  def add[B >: A](element: B): MyList[B]

  def printElements: String

  // polymorphic call
  override def toString: String = s"[${this.printElements}]"

}

// ??? expression means not implemented

object Empty extends MyList[Nothing] {

  override def head(): Nothing = throw new NoSuchElementException

  override def tail(): MyList[Nothing] = throw new NoSuchElementException

  override def isEmpty(): Boolean = true

  override def add[B >: Nothing](element: B): MyList[B] = new Cons(element, Empty)

  def printElements: String = ""
}

class Cons[+A](h: A, t: MyList[A]) extends MyList[A] {

  override def head(): A = h

  override def tail(): MyList[A] = t

  override def isEmpty(): Boolean = false

  override def add[B >: A](element: B): MyList[B] = new Cons(element, this)

  def printElements: String = if (t.isEmpty()) s"$h" else s"$h ${t.printElements}"
}

object ListTest extends App {
  val listOfInteger: MyList[Int] = new Cons(1, new Cons(2, new Cons(3, Empty)))
  val listOfString: MyList[String] = new Cons("hello", new Cons("world", new Cons("!!", Empty)))

  println(listOfInteger.toString)
  println(listOfString.toString)
}
