package day4.Hangman


import scala.io.Source
import java.util.Calendar

import scala.collection.mutable.ListBuffer

object HangmanMain {

  def getWordOptions(): List[String] = {
    Source.fromFile("words-for-anagram.txt").getLines().toList.filter(item => !item.contains('\''))
  }

  def main(args: Array[String]): Unit = {
    val playerLives = 11
    val words = getWordOptions()
    val randomNumGen = scala.util.Random
    randomNumGen.setSeed(Calendar.getInstance.get(Calendar.MILLISECOND))
    val selectedWord: String = words(randomNumGen.nextInt(words.length - 1))
    var solved = false
    val solvedCharIndex: ListBuffer[Int] = ListBuffer()

    while (!solved && playerLives > 0) {
      selectedWord.split("").zipWithIndex foreach { case(el, i) =>
          print(if(solvedCharIndex.contains(i)) i else " _ ")
        }
      solved = true
    }
  }


}
