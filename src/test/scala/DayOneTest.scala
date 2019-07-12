import collection.mutable.Stack
import org.scalatest._
import DayOneMain.DayOneMain

class DayOneTest extends FlatSpec with Matchers {

  "returnNumOfCharsFromStringEnd" should "return the correct characters from string end" in {
    val initialString = "abcdefghijklmnopqrstuvwxyz"
    val charsToReturn = 4
    val expectedOutput = "wxyz"

    DayOneMain.returnNumOfCharsFromStringEnd(charsToReturn, initialString) should be (expectedOutput)
  }

  "concatStringsAndReplaceCharacter" should "concatinate strings and replace characters correctly" in {
    val initialStringOne = "Hello"
    val initialStringTwo = "World"
    val replacingChar = 'o'
    val replacingCharWith = 'i'
    val expectedOutput = "HelliWirld"
    DayOneMain.concatStringsAndReplaceCharacter(initialStringOne, initialStringTwo, replacingChar, replacingCharWith) should be (expectedOutput)

  }

  "returnSumOrMultiplicationOfIntsUnlessZero" should "return multiplication of two ints if both are positive," +
    "and boolean is false" in {
    val expectedResult = 25
    val inputValue = 5
    val inputBool = false
    assertResult(expectedResult)(DayOneMain.returnSumOrMultiplicationOfIntsUnlessZero(inputValue, inputValue, inputBool))
  }

  "returnSumOrMultiplicationOfIntsUnlessZero" should "return addition of two ints if both are positive," +
    "and boolean is false" in {
    val expectedResult = 10
    val inputValue = 5
    val inputBool = true
    assertResult(expectedResult)(DayOneMain.returnSumOrMultiplicationOfIntsUnlessZero(inputValue, inputValue, inputBool))
  }

  "returnSumOrMultiplicationOfIntsUnlessZero" should "return the first value if a 0 is provided as the second value" +
    "and boolean is false" in {
    val expectedResult = 5
    val inputValueOne = 5
    val inputValueTwo = 0
    val inputBool = true
    assertResult(expectedResult)(DayOneMain.returnSumOrMultiplicationOfIntsUnlessZero(inputValueOne, inputValueTwo, inputBool))
  }

  "returnSumOrMultiplicationOfIntsUnlessZero" should "return the second value if a 0 is provided as the first value" +
    "and boolean is false" in {
    val expectedResult = 5
    val inputValueOne = 0
    val inputValueTwo = 5
    val inputBool = true
    assertResult(expectedResult)(DayOneMain.returnSumOrMultiplicationOfIntsUnlessZero(inputValueOne, inputValueTwo, inputBool))
  }

  "blackJackCheck" should "output the closest value to 21 of two numbers below 21" in {
    val inputValueOne = 15
    val inputValueTwo = 20
    DayOneMain.blackJackCheck(inputValueOne, inputValueTwo) should be (inputValueTwo)
  }

}