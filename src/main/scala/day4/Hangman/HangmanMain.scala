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

  def getWordToFind(): String ={
    var difficultyGotten = false
    var userInput = " "
    while(!difficultyGotten){
      println("Please enter a difficulty level:")
      println("[E}asy [M]edium [H]ard]")
      userInput = scala.io.StdIn.readLine()
      if(userInput.length == 1 && userInput.matches("[EMH]")) {
        difficultyGotten = true
      } else println("Error, please enter [E], [M] or [H]")
    }
    var lowerLimit = 3
    var upperLimit = 5
    userInput match {
      case "E" => {}
      case "M" => {
        lowerLimit = 5
        upperLimit = 7
      }
      case "H" => {
        lowerLimit = 7
        upperLimit = 15
      }
    }
    selectWord(lowerLimit, upperLimit)
  }

  def selectWord(lowerLimit: Int, upperLimit: Int ) : String = {
    val words = getWordOptions()
    val randomNumGen = scala.util.Random
    randomNumGen.setSeed(Calendar.getInstance.get(Calendar.MILLISECOND))
    var gotWord = false
    var word = ""
    while(!gotWord) {
      word = words.filter(item => !item.contains("\'"))(randomNumGen.nextInt(words.length-1))
      if(word.length >= lowerLimit && word.length < upperLimit) {
        gotWord = true
      }
    }
    word
  }


  def main(args: Array[String]): Unit = {
    var playerLives = 10
    val selectedWord: String = getWordToFind()
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
