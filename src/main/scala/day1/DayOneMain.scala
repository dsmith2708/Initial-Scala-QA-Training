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

  def returnNumOfCharsFromStringEnd(numChars: Int, stringToUse: String): String ={
    val resultOfStringSplit: String = stringToUse.takeRight(numChars)
    resultOfStringSplit
  }


  def main(args: Array[String]): Unit = {
    println("Hello World")

    printInput(returnString())

    outputAnyInput(1.1)
    outputAnyInput("TestOutput")
    outputAnyInput(1)
    outputAnyInput(true)

    println(returnNumOfCharsFromStringEnd(5, "123456789"))
  }
}


