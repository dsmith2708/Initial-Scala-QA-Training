package dayThreeMain

import scala.collection.mutable.ListBuffer
import scala.io.Source

object DayThreeMain {

  def hashMapAnagramSolver(anagramStrings: List[String]): Unit = {
    val wordsFromFile = Source.fromFile("words-for-anagram.txt").getLines().toList
    var highestAnagramCountIndex: Int = 0
    var highestAnagramCount = 0
    var highestAnagramValues: ListBuffer[String] = ListBuffer()
    var tiedNumberOfAnagramNumbers: Boolean = false


    anagramStrings.zipWithIndex foreach { case(inputWord, index) => {
        val sortedInput: String = sortString(inputWord)
        val tempAnagramValues: ListBuffer[String] = ListBuffer()
        var anagrams: Int = 0
          wordsFromFile.foreach(word => {
            val sortedWord = sortString((word))
            if(sortedWord == sortedInput) {
              anagrams += 1
              tempAnagramValues += word
            }
          })
        if(anagrams > highestAnagramCount) {
          highestAnagramCount = anagrams
          highestAnagramCountIndex = index
          highestAnagramValues = tempAnagramValues
          println(s"$inputWord currently has the highest number of anagrams with $anagrams")
          if(tiedNumberOfAnagramNumbers) tiedNumberOfAnagramNumbers = false
        } else if (anagrams == highestAnagramCount && !tiedNumberOfAnagramNumbers) {
          tiedNumberOfAnagramNumbers = true
          println(s"$inputWord is tied for the highest number of anagrams with ${anagramStrings(highestAnagramCountIndex)} with ${if(highestAnagramCount == -1) 0 else highestAnagramCount}")
        } else if (anagrams == highestAnagramCount && tiedNumberOfAnagramNumbers) {
          println(s"$inputWord is also tied for the highest number of anagrams at ${if(highestAnagramCount == -1) 0 else highestAnagramCount}")
        }


      }
    }

    if(!tiedNumberOfAnagramNumbers){
      println(s"${anagramStrings(highestAnagramCountIndex)} has the highest number of anagrams with $highestAnagramCount")
      println("these anagrams are: ")
      highestAnagramValues.foreach(println)
    }

  }

  def sortString(stringToSort: String): String = {
    stringToSort.toList.sorted.mkString("")
  }



  def main(args: Array[String]): Unit = {
    println("day three")
    hashMapAnagramSolver(List("hsdfdsf", "dfdsf", "fars","long", "song", "sdsa", "garb", "dfgdfgktjtgh", "gods", "raps", "days", "dongs", "hello", "hi"))
  }
}
