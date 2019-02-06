package lectures.part1basics

/*
  Call By Value vs Call By Name
 */
object CBNvsCBV extends App{

  def calledByValue(x:Long): Unit = {
    println("by value: " + x)
    println("by value: " + x)
  }

  def calledByName(x: => Long): Unit = {
    println("by name: " + x)
    println("by name: " + x)
  }

  calledByValue(System.nanoTime())
  calledByName(System.nanoTime())

  // Called by value: The value is executed in the call itself (no lazy)
  // Called by name: The values is called when it's used (lazy)

  // Weird example to see the lazy evaluation
  def infinite(): Int = 1 + infinite()
  def printFirst(x: Int, y: => Int) = println(x)

  // printFirst(infinite(), 34) It raises a stackoverflow exception because infinite is evaluated when it's called
  printFirst(34, infinite()) // It works because the infinite function is not called, because y value is not evaluated (lazy)

}
