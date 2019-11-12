package example

object Output extends App{

  print("Answer: ")
  println(42)
  //yield same output as above
  println("Answer: " + 42)

  // with formatting
  val name : String ="saurabh"
  val age :Int =28
  printf("Hello, %s! You are %d years old.%n", name, age)

  //formatted out put with String interpolation
  print(f"Hello, $name! In six months, you'll be ${age + 0.5}%7.2f years old.%n")


  //Multi-line output

  val myString ="""Hello
          my name is
          George(aka "ggg")"""

  println(myString)


  val myString2 = """ |{
                    |  "phone": "380999999999"
                    |  "addressFrom": "Some Address 1",
                    |  "addressTo": "Another Address 2",
                    |  "time": "2016-09-02T14:02:18.937Z"
                    |}
""".stripMargin

  println(myString2)







}
