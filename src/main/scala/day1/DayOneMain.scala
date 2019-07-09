package DayOneMain

object DayOneMain {

  def printInput(input: String) {
    println(input)
  }

  def returnString(): String = {
    return "Returned String"
  }

  def outputAnyInputToConsole(input: Any): Unit = {
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

  def returnSumOrMultiplicationOfInts(intOne: Int, intTwo: Int, addOrMultiply: Boolean): Int = {
    if (addOrMultiply) intOne + intTwo
    else intOne * intTwo
  }

  def main(args: Array[String]): Unit = {
    println("Hello World")

    printInput(returnString())

    outputAnyInputToConsole(1.1)
    outputAnyInputToConsole("TestOutput")
    outputAnyInputToConsole(1)
    outputAnyInputToConsole(true)

    println(returnNumOfCharsFromStringEnd(5, "123456789"))

    println(concatStringsAndReplaceCharacter("Hello", "World", 'o', 'a'))

    println(returnSumOrMultiplicationOfInts(1,2, true))
    println(returnSumOrMultiplicationOfInts(1,2, false))

    
  }
}


