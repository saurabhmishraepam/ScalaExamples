package example

object MutliDimensionalArray extends App{

  val matrix = Array.ofDim[Double](3, 4) // Three rows, four columns

  //To access an element, two pairs of parentheses are used:
   val row:Int =2
   val column : Int =3
    matrix(row)(column) = 42

  //It is possible to create ragged arrays, with varying row lengths:

  val triangle = new Array[Array[Int]](10)
  for (i <- triangle.indices)
    triangle(i) = new Array[Int](i + 1)


}
