package example

import scala.beans.BeanProperty

class PersonV3 {
  @BeanProperty var name: String = _
}

object BeanPropertiesExample extends App{
  val p3=new PersonV3
  p3.setName("saurabh")
  println(p3.getName)
}
