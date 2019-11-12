package example

class Frog extends Philosophical {
  override def toString = "green"
}

object TraitsMixingWithExtendsApp extends App{

  val frog = new Frog
  println(frog)
  println(frog.philosophize())
}

