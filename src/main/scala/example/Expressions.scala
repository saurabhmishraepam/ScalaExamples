package example

class Expressions {

}

object Expressions extends App{
  val x: Int = 10
  val x0: Int = 5
  val y: Int =20
  val y0: Int = 10

  val distance = { val dx = x - x0; val dy = y - y0; Math.sqrt(dx * dx + dy * dy) }

  println(distance)

}
