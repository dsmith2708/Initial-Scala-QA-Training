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

}