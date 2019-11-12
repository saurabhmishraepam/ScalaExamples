package example

object ArrayExample extends App {

  val nums = new Array[Int](10)
  // An array of ten integers, all initialized with
  display(nums)
  val a = new Array[String](10)
  // A string array with ten elements, all initialized with null
  display(a)

  val s = Array("Hello", "World")
  // An Array[String] of length 2—the type is inferred
  // Note: No new when you supply initial values
  display(s)
  s(0) = "Goodbye"
  // Array("Goodbye", "World")
  // Use () instead of [] to access elements
  display(s)

  def display(b:Array[String]) = {
    b.foreach(v=>print(v+" "))
    println()}
  def display(b:Array[Int]) = {
    b.foreach(v=>print(v+" "))
    println()}
}
