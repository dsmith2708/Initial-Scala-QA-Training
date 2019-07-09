package DayOneMain

object DayOneMain {

  def printInput(input: String) {
    println(input)
  }

  def returnString(): String = {
    return "Returned String"
  }

  def outputAnyInput(input: Any): Unit = {
    println(input)
  }


  def main(args: Array[String]): Unit = {
    println("Hello World")

    printInput(returnString())

    outputAnyInput(1.1)
    outputAnyInput("TestOutput")
    outputAnyInput(1)
    outputAnyInput(true)
  }
}


