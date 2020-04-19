package lectures.part2oop

object Generics extends App {

  // Generic class and traits

  class MyList[+A] {
    // uses the type A
    // It also works for traits
    def add[B >: A](element: B): MyList[B] = ???
  }

  class MyMap[Key, Value]

  val listOfIntegers = new MyList[Int]
  val listOfStrings = new MyList[String]

  // Generic methods
  object MyList {
    def empty[A]: MyList[A] = ???
    /*
     A = Cat
     B = Dog = Animal
     */
  }

  val emptyListOfIntegers = MyList.empty[Int]

  // variance problem
  class Animal
  class Cat extends Animal
  class Dog extends Animal

  ////////////////
  // COVARIANZE, INVARIANCE AND CONTRAVARIANCE
  ////////////////

  // 1. yes, List[Cat] extends List[Animal] = COVARIANCE
  class CovariantList[+A]
  val animal: Animal = new Cat
  val animalList: CovariantList[Animal] = new CovariantList[Cat]
  // animalList.add(new Dog) ?? HARD QUESTION. => We return a list of animals
  // Because we are going to pollute the second questions.
  // With +A we can use inherited classes

  // 2. No - Invariance
  class InvariantList[A]
  //val invariantAnimalList: InvariantList[Animal] = new InvariantList[Cat] --> It fails due to it's not possible to use a different type
  val invariantAnimalList: InvariantList[Animal] = new InvariantList[Animal]

  // 3. Hell, no!! CONTRAVARIANCE
  class ContraVariantList[-A]
  val contraVariantList: ContraVariantList[Cat] = new ContraVariantList[Animal] // It's quite strange case, because we are creating a list of animals to contains only cats

  class Trainer[-A]
  val trainer : Trainer[Cat] = new Trainer[Animal]
  // In this case the meaning is: I wanted a trainer of cats, but I provide a trainer of animals (which is better, he can train all types of animals)

  ////////////////
  // BOUNDED TYPES
  ////////////////
  class Cage[A <: Animal](animal: A) // A is subtype of Animal
  val cage = new Cage(new Dog)

  class Car
  // val newAge = new Cage(new Car)
  // Error in execution time: Error:(54, 16) inferred type arguments [lectures.part2oop.Generics.Car] do not conform to class Cage's type parameter bounds [A <: lectures.part2oop.Generics.Animal]

  class Cage2[A >: Animal] // A is a supertype of Animal

  // Subtypes Meaning
  // [A <: Animal] => A is a subtype of Animal
  // [A >: Animal] => A is a supertype (parent) of Animal

  // Exercise: Expand MyList to be generic

}
