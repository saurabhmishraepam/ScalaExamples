package example

object MapExample extends App{
  var scores = Map("John" -> 20, "Martin" -> 30, "Alice" -> 7)
  println(scores)

  //The () notation to look up key values:
  val johnScore = scores("John")
  println(johnScore)

  //To create a mutable map
  val scoresMutable = scala.collection.mutable.Map("John" -> 20, "Martin" -> 30, "Alice" -> 7)
  println(scoresMutable)

  //To create a blank map, the type parameters must be provided:
  val scoresBlank = scala.collection.mutable.Map[String, Int]()
  println( scoresBlank)
  // throw an exception as below key doesn't exists
  //val johnScoreBlank = scoresBlank("John")


  //updating immutable map

  //scores("John") = 22 // Updates the existing value for the key "John" (assuming scores is mutable)
  //scores("Fred") = 17 // Adds a new key/value pair to scores (assuming it is mutable)


  scoresMutable += ("John" -> 20, "Fred" -> 17)
  println(scoresMutable)
  //to remove a key from a mutable map use -=key
  scoresMutable -= "Alice"
  println(scoresMutable)

//An immutable map cannot be updated. It is only possible to obtain a new map that has the desired update:
  val newScores = scores + ("John" -> 20, "Fred" -> 17)
  println(newScores)

  //iteration over map key val

  for ((k, v) <- scores)
    println(k+" "+v)


  // to visit only keys
  for(k <- scores.keySet)
    println(k)
  // to visit only values
  for(v <- scores.values)
    println(v)

  //reverse a map
    val reverseScores =for ((k, v) <- scores)
      yield (v, k)
    println(reverseScores)










}
