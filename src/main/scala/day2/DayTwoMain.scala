package dayTwoMain

object DayTwoMain {

  def isTempTooHot(temp: Int, isSummer: Boolean): Boolean = {
    val lowerLimit = 60
    var upperLimit = 90
    if(isSummer) upperLimit = 100

    temp match {
      case x if lowerLimit until upperLimit contains x => true
      case _ => false
    }
  }

  def main(args: Array[String]): Unit = {
    println("hello day 2")

    println(isTempTooHot(60, true))
    println(isTempTooHot(50, true))
    println(isTempTooHot(91, false))
    println(isTempTooHot(91, true ))
  }
}
