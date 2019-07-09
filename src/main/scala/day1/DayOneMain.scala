package DayOneMain

object DayOneMain {

  def printInput(input: String) {
    println(input)
  }

  def returnString(): String = {
    return "Returned String"
  }

  def main(args: Array[String]): Unit = {
    println("Hello World")

    printInput(returnString())
  }
}


