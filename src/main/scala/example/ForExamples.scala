package example

object ForExample1 {
  def main(args: Array[String]): Unit = {
    for (i <- 1 until 5)
      print(i+", ")
  }
}
// Output: 1, 2, 3, 4,


object ForExample2 {
  def main(args: Array[String]): Unit = {
    for (i <- (1 to 5).reverse)
      print(i+", ")
  }
}
// Output: 5, 4, 3, 2, 1,

object ForExample3 {
  def main(args: Array[String]): Unit = {
    for (i <- 5 to 1 by -1)
      print(i+", ")
  }
}
// Output: 5, 4, 3, 2, 1,


object ForExample4 {
  def main(args: Array[String]): Unit = {
    for (i <- 1 to 3; j <- 1 to 2)
      print(i+","+j+"; ")
  }
}
// Output: 1,1; 1,2; 2,1; 2,2; 3,1; 3,2;

