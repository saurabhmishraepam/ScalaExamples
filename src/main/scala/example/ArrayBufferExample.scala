package example
import scala.collection.mutable.ArrayBuffer

object ArrayBufferExample extends App{

  val b = ArrayBuffer[Int]() // Or new ArrayBuffer[Int]

  b += 1 // ArrayBuffer(1)
  display(b)
  // Add an element at the end with +=
  b += (1, 2, 3, 5) // ArrayBuffer(1, 1, 2, 3, 5)
  display(b)
  // Add multiple elements at the end by enclosing them in parentheses
  b ++= Array(8, 13, 21) // ArrayBuffer(1, 1, 2, 3, 5, 8, 13, 21)
  display(b)
  // Remove the last five elements
  b.trimEnd(5) // ArrayBuffer(1, 1, 2)
  display(b)

  def display(b:ArrayBuffer[Int]) = {
    b.foreach(v=>print(v+" "))
    println()}
}
