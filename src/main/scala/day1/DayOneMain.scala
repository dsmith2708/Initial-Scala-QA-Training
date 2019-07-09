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

  def returnSumOrMultiplicationOfIntsUnlessZero(intOne: Int, intTwo: Int, addOrMultiply: Boolean): Int = {
    if(intOne == 0) intTwo
    else if (intTwo == 0) intOne
    else if (addOrMultiply) intOne + intTwo
    else intOne * intTwo
  }

  def outputInputSpecifiedTimes(stringToOutput: String, numTimes: Int): Unit = {
    for(i <- 1 to numTimes) {
      println(stringToOutput)
    }
  }

  def outputCharNumTimesInEveryDimension(charToOutput: Char, numToMutiply: Int): Unit = {
    var stringOutput = ""
    for(i <- 1 to numToMutiply) stringOutput += charToOutput
    for(i <- 1 to numToMutiply) println(stringOutput)
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

    println(returnSumOrMultiplicationOfIntsUnlessZero(1,2, true))
    println(returnSumOrMultiplicationOfIntsUnlessZero(1,2, false))
    println(returnSumOrMultiplicationOfIntsUnlessZero(0,5, true))
    println(returnSumOrMultiplicationOfIntsUnlessZero(5, 0, true))

    outputInputSpecifiedTimes("Hello", 3)

    outputCharNumTimesInEveryDimension('h', 4)
  }
}


