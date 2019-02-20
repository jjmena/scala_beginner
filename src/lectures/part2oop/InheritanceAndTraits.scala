package lectures.part2oop

object InheritanceAndTraits extends App {

  sealed class Animal {
    val creatureType = "wild"

    protected def eat = println("nomnom")

    //protected final def eat = println("nomnom") --> This version is not overrideable
  }

  class Cat extends Animal {
    def crunch = {
      eat
      println("crunch crunch")
    }
  }

  val cat = new Cat
  // cat.eat It's impossible to call this method due to method isolation level.
  cat.crunch

  // constructors
  class Person(name: String, age: Int) {
    def this(name: String) = this(name, 0)
  }

  class Adult(name: String, age: Int, idCard: String) extends Person(name) // We can define the extension with the constructor.

  // overriding
  class Dog(override val creatureType: String) extends Animal {
    // override val creatureType = "domestic"
    override def eat: Unit = {
      super.eat // We can call parent method using super keyword.
      println("crunch crunch")
    }
  }

  // Alternative way to create a Dog class
  //class Dog(dogType: String) extends Animal {
  //  override val creatureType: String = dogType
  //}
  val dog = new Dog("K9")
  dog.eat
  println(dog.creatureType)

  // type substitution
  val unknownAnimal: Animal = new Dog("K9")
  // unknownAnimal.eat It's impossible due to eat method is not available in Animal class

  // overRIDING vs overLOADING

  // super --> We can call parent method using super

  // preventing overrides --> We can use final keyword to prevent method overriding.
  // 1. use final on member
  // 2. use final on the entire clas
  // 3. seal the class = extend classes in THIS FILE, prevent extension in other files

}
