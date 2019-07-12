package day4.Hangman


import scala.io.Source
import java.util.Calendar

import scala.collection.mutable.ListBuffer

object HangmanMain {

  def getWordOptions(): List[String] = {
    Source.fromFile("words-for-anagram.txt").getLines().toList.filter(item => !item.contains('\''))
  }

  def getPlayerInput(): Char = {
    var inputGotten = false
    var input = ""
    while(!inputGotten) {
      println("\n\nplease enter a character")
      input = scala.io.StdIn.readLine()
      if(input.length == 1 && input.matches("[a-z]")) {
        inputGotten = true
        inputGotten
      } else {
        println("error, please enter a character a-z")
      }
    }
    input.toCharArray()(0)
  }

  def searchForPlayerInput(curSolvedCharIndex: ListBuffer[Int], wordToSearch: Array[String], charToSearchFor: Char): Boolean = {
    if(wordToSearch.contains(charToSearchFor.toString)) {
      wordToSearch.zipWithIndex foreach { case(character, index) =>
        if(character.toCharArray()(0) == charToSearchFor && !curSolvedCharIndex.contains(index)) curSolvedCharIndex += index
      }
      true
    } else false
  }



  def main(args: Array[String]): Unit = {
    var playerLives = 10
    val words = getWordOptions()
    val randomNumGen = scala.util.Random
    randomNumGen.setSeed(Calendar.getInstance.get(Calendar.MILLISECOND))
    val selectedWord: String = words(randomNumGen.nextInt(words.length - 1))
    var solved = false
    val solvedCharIndex: ListBuffer[Int] = ListBuffer()

    while (!solved && playerLives > 0) {
      val charArray = selectedWord.split("")
      charArray.zipWithIndex foreach { case(character, index) =>
          print(if(solvedCharIndex.contains(index)) s" $character " else " _ ")
      }
      if (!searchForPlayerInput(solvedCharIndex, charArray, getPlayerInput())) playerLives -= 1

      drawHangman(playerLives)

      if(solvedCharIndex.length == selectedWord.length) {
        println("Congratulations!!")
        solved = true
      }
    }

    println(s"The Word was: $selectedWord")
  }

  def drawHangman(playerLives: Int): Unit = {
    playerLives match {
      case 9 => println("-------------")
      case 8 => {
        println("|\n|\n|\n|\n|\n|\n|\n|\n|\n|\n|\n|")
        println("-------------")
      }
      case 7 => {
        println("-----------")
        println("|\n|\n|\n|\n|\n|\n|\n|\n|\n|\n|\n|")
        println("---------------------------")
      }
      case 6 => {
        println("-----------")
        println("|         |\n"+
          "|         |\n" +
          "|\n|\n|\n|\n|\n|\n|\n|")
        println("---------------------------")
      }
      case 5 => {
        println("-----------")
        println("|         |\n"+
          "|         |\n" +
          "|         0\n" +
          "|\n|\n|\n|\n|\n|\n|")
        println("---------------------------")
      }
      case 4 => {
        println("-----------")
        println("|         |\n"+
          "|         |\n" +
          "|         0\n" +
          "|         |\n" +
          "|         |\n" +
          "|\n|\n|\n|")
        println("---------------------------")
      }
      case 3 => {
        println("-----------")
        println("|         |\n"+
          "|         |\n" +
          "|         0\n" +
          "|        /|\n" +
          "|         |\n" +
          "|\n|\n|\n|")
        println("---------------------------")
      }
      case 2 => {
        println("-----------")
        println("|         |\n"+
          "|         |\n" +
          "|         0\n" +
          "|        /|\\\n" +
          "|         |\n" +
          "|\n|\n|\n|")
        println("---------------------------")
      }
      case 1 => {
        println("-----------")
        println("|         |\n"+
          "|         |\n" +
          "|         0\n" +
          "|        /|\\\n" +
          "|         |\n" +
          "|        /\n" +
          "|\n|")
        println("---------------------------")
      }case 0 => {
        println("-----------")
        println("|         |\n"+
          "|         |\n" +
          "|         0\n" +
          "|        /|\\\n" +
          "|         |\n" +
          "|        / \\\n" +
          "|\n|")
        println("---------------------------")
      }

      case _ =>
    }
  }
}
