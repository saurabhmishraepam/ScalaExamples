package example

class Animal

class Frog extends Animal with Philosophical {
  override def toString = "green"
}
/*
class Animal
trait HasLegs {
  def aboutMyLegs() = {
    println("I have legs")
  }
}
class Frog extends Animal with Philosophical with HasLegs {
  override def toString = "green"
}
*/