package example

import scala.io.StdIn


object Input extends App{

  val name = StdIn.readLine("Your name: ")
  print("Your age: ")
  val age = StdIn.readInt()
  println("Hello " + name + ", your age is " + age.toString)


}
