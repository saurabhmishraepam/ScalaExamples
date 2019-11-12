package example

import java.util.concurrent.Callable

class DoNothing extends Callable[Unit]
{
  def call: Unit = ()
}

