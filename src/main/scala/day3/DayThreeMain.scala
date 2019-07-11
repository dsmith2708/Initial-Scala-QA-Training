package dayThreeMain

object DayThreeMain {

  def hashMapAnagramSolver(anagramString: String): Unit = {
    println(sortString(anagramString))
  }

  def sortString(stringToSort: String): String = {
    stringToSort.toList.sorted.mkString("")
  }



  def main(args: Array[String]): Unit = {
    println("day three")
    hashMapAnagramSolver("atrefgvb")
  }
}
