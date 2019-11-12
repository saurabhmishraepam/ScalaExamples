package example

class Functions {

}

object Functions {

  def main(args: Array[String]): Unit = {
    println(min(1,3))
  }

  def min(x: Int, y: Int): Int = {
    if (x < y)
      x
    else
      y
  }

}
