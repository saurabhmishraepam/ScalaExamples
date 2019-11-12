package example

class Message {
  val timeStamp = java.time.Instant.now

}
class Counter {
  private var value = 0
  def increment() { value += 1 }
  def current = value // No () in declaration
}
object  CounterApp extends App{
  val myCounter= new Counter
  val n = myCounter.current // Calling myCounter.current() is a syntax error
}




