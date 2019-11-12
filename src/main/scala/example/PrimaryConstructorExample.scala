package example

class Person(val name: String, val age: Int) {
  println("Just constructed another person")
  def description = s"$name is $age years old"
}

object PersonApp extends App{

  val p1=new Person("saurabh", 28)
  println(p1.description)
}



