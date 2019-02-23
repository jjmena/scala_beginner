package lectures.part2oop

object AbstractDataTypes extends App {

  // abstract
  // abstract classes cannot be instantiated
  abstract class Animal {
    val creatureType: String // abstract attribute

    def eat: Unit // abstract method
  }


  // val animal = new Animal --> Impossible because the class is abstract.

  class Dog extends Animal {
    override val creatureType: String = "Canine"

    override def eat: Unit = println("crunch crunch")
  }

  // traits
  // Like an abstract class, it could contain abstract attributes and methods.
  trait Carnivore {
    def eat(animal: Animal): Unit
  }

  trait ColdBlooded

  class Cocodrile extends Animal with Carnivore with ColdBlooded {
    override val creatureType: String = "croc"

    override def eat: Unit = println("nomnomnom")

    override def eat(animal: Animal): Unit = println(s"I'm a croc, and I'm eating a ${animal.creatureType}")
  }

  val dog = new Dog
  val croc = new Cocodrile
  croc.eat(dog)

  // traits vs abstract classes
  // Both allows abstract and non-abstract members
  // 1. Traits do not have constructor parameters.
  // 2. Multiple traits can be inherited, but only one inherited class
  // 3. Trait = behaviour, abstract class = "thing"


  // Scala types hierarchy
  // scala.Any -> This is the mother of all types.
  // scala.AnyRef -> similar to scala object class.
  // scala.Null -> It is the class for no reference value.
  // scala.AnyVal -> It contains all the primitives values.
  // scala.Nothing -> It can replace everything.


}
