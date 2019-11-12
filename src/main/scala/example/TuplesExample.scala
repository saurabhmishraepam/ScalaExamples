package example

object TuplesExample extends App{

  val t = (10, 3.14, "John")
  println(t)

  //access 2nd element
  val secondv = t._2
  println(secondv)

  // Sets first to 1, second to 3.14, third to "John"
  val (first, second, third) = t
  println(first)

  //We can use a _ if we do not need all components:
  val (first1, second1, _) = t


  val r="New York".partition(_.isUpper) // Yields the pair ("NY", "ew ork")
  println(r)

}
