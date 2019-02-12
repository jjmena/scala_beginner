package lectures.part2oop

object Objects {

  // SCALA DOES NOT HAVE CLASS-LEVEL FUNCTIONALITY ("static")
  object Person { // type + its only instance
    // "static"/"class" - level functionality
    // It's usually create factory methods in the singleton object
    val N_EYES = 2

    def canFly: Boolean = false

    //factory method. It was started as from, but it's common to use apply as method name
    def apply(mother: Person, father: Person): Person = new Person("Bobbie")
  }

  class Person(val name: String) {
    // instance level functionality
  }

  // COMPANIONS -> class and object defined with the same name (object static, class instance level)
  // COMPANIONS can ave access to other private members

  def main(args: Array[String]): Unit = {
    println(Person.N_EYES)
    println(Person.canFly)

    // Scala object = SINGLETON INSTANCE
    val mary = Person
    val john = Person
    println(mary == john)

    // Scala instances
    var maryInstance = new Person("Mary")
    val johnInstance = new Person("John")
    println(maryInstance == johnInstance)

    // Using factories
    val bobbie = Person(maryInstance, johnInstance) // It looks like a constructor, but it's only apply method
  }

  // Scala Application = Scala object with
  // def main(args: Array[String]): Unit

  // You can create the main method, but it's better to extend from App class which has defined this main method.


}
