package DayOneMain

object DayOneMain {

  def printInput(input: String) {
    println(input)
  }

  def returnString(): String = {
    "Returned String"
  }

  def outputAnyInputToConsole(input: Any): Unit = {
    println(input)
  }

  def returnNumOfCharsFromStringEnd(numChars: Int, stringToUse: String): String ={
    stringToUse.takeRight(numChars)
  }

  def concatStringsAndReplaceCharacter(stringOne: String, stringTwo: String,
                      charToReplace: Char, replacementChar: Char): String = {

    (stringOne + stringTwo).replace(charToReplace, replacementChar)
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

  def fizzBuzzCustom(fizzEquivalent: String, buzzEquivalent: String, numToTravelTo: Int): Unit = {
    for(i <- 1 to numToTravelTo) {
      if(i % 15 == 0)println(s"$fizzEquivalent$buzzEquivalent")
      else if (i % 3 == 0)println(fizzEquivalent)
      else if (i % 5 == 0)println(buzzEquivalent)
      else println(i)
    }
  }


  def blackJackCheck(numOne: Int, numTwo: Int): Int = {
    if (numOne > 21 && numTwo > 21) 0
    else if (21 - numOne > 21 - numTwo) numTwo
    else numOne
  }

  def sumOfThreeNumsUnlessDuplicate(numOne: Int, numTwo: Int, numThree: Int): Int = {
    var numSet = scala.collection.mutable.Set[Int]()
    numSet += numOne
    numSet += numTwo
    if (numSet.sum == numOne) {
      if (numThree == numOne) 0
      else numThree
    }
    else if (numOne == numThree) numTwo
    else if (numTwo == numThree) numOne
    else {
      numSet += numThree
      numSet.sum
    }
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

    fizzBuzzCustom("ding", "dong", 100)


    var countries = java.util.TimeZone.getAvailableIDs()

    countries = countries.filter(country => country.contains('/')).map(country => country.substring(country.lastIndexOf("/") + 1))
    countries.foreach(country => println(country))

    println(blackJackCheck(20,18))

    println(sumOfThreeNumsUnlessDuplicate(10,20,30))
    println(sumOfThreeNumsUnlessDuplicate(10,10,20))
    println(sumOfThreeNumsUnlessDuplicate(10,11,10))
    println(sumOfThreeNumsUnlessDuplicate(10,11,11))
  }
}


