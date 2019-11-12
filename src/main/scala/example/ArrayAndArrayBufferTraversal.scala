package example

object ArrayAndArrayBufferTraversal extends App{
  val a = new Array[String](10)

  for (i <- 0 until a.length)
    println(s"$i: ${a(i)}")


}
