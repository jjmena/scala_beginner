package lectures.part1basics

object DefaultArgs extends App {

  def trFact(n: Int, acc: Int = 1): Int =
    if (n <= 1) acc
    else trFact(n - 1, n * acc)

  val fact10 = trFact(10) // We don't have to pass default values

  // Default arguments are useful when you call the function with the same values

  def savePicture(format: String = "jpg", width: Int = 1920, height: Int = 1080): Unit = println("Saving picture")

  savePicture("jpg", 800, 600)
  // savePicture(800, 600) Impossible. It need leading argument.
  savePicture()
  // savePicture(800) Impossible too. It needs leading argument.

  /*
    Rules
      1. Pass in every leading argument
      2. name the arguments
   */

  savePicture(width = 800) // It's possible naming arguments
}
