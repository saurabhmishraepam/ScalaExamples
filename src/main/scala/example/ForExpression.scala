package example

object ForExpression extends App{

  val s = "Hello"
  var sum = 0
  for (i <- 0 to s.length - 1)
    sum += s(i)
  println(sum)
  sum=0
  for (ch <- "Hello") sum += ch
  println(sum)

  val f=for (i <- 1 to 10) yield i % 3
  // Yields Vector(1, 2, 0, 1, 2, 0, 1, 2, 0, 1)
  println(f)

  val sqList = for (i <- 1 to 5) yield i*i
  println(sqList)



}
