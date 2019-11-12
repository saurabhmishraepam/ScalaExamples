package example

class PersonV1 {
  private var name = ""
  private var age = 0

  def this(name: String) { // An auxiliary constructor
    this() // Calls primary constructor
    this.name = name
  }

  def this(name: String, age: Int) { // Another auxiliary constructor
    this(name) // Calls previous auxiliary constructor
    this.age = age
  }
}

object  PersonV1App extends App{

  val p1 = new PersonV1("John") // First auxiliary constructor
  val p2 = new PersonV1("John", 42) // Second auxiliary constructor


}

