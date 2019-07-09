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

  def concatStringsAndReplaceCharacter(stringOne: String, stringTwo: String,
                      charToReplace: Char, replacementChar: Char): String = {
    val result = (stringOne + stringTwo).replace(charToReplace, replacementChar)
    result
  }

  def main(args: Array[String]): Unit = {
    println("Hello World")

    printInput(returnString())

    outputAnyInput(1.1)
    outputAnyInput("TestOutput")
    outputAnyInput(1)
    outputAnyInput(true)

    println(returnNumOfCharsFromStringEnd(5, "123456789"))

    println(concatStringsAndReplaceCharacter("Hello", "World", 'o', 'a'))
  }
}


