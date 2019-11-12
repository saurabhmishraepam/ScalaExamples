package example

class Counter {
  private var value = 0 // You must initialize the field
  def increment() { value += 1 } // Methods are public by default
  def current() = value
}

object CounterApp extends App{
  val myCounter = new Counter // Or new Counter()

  println(myCounter.current) // OK
  println(myCounter.current()) // Also OK

}