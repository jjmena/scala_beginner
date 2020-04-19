package lectures.part2oop

object AnonymousClasses extends App {

  abstract class Animal {
    def eat: Unit
  }

  // Anonymous class created
  // The class created was: lectures.part2oop.AnonymousClasses$$anon$1
  // This class is automatically created by the compiler.
  val funnyAnimal: Animal = new Animal {
    override def eat: Unit = println("jajajajaja")
  }

  println(funnyAnimal.getClass)

  class Person(name:String) {
    def sayHi: Unit= println(s"Hi, my name is $name, how can i help?")
  }

  // Anonymous classes work for abstract an non-abstract classes. Even traits.
  // Even if the class have parameters, we can instantiate it with parameters
  // And we can override an specific method.
  def jim = new Person("Jim") {
    override def sayHi: Unit= println(s"Hi, my name is Jim, how can i help you?")
  }

}
