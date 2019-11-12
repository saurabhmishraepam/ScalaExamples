package example

class PersonV2 {
  var age = 0
}

object PersonV2App extends App{

  val fred =new PersonV2
  println(fred.age) // Calls the method fred.age()
  fred.age = 21 // Calls fred.age_=(21)

}

