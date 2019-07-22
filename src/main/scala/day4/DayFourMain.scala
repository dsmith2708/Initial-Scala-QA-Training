package day4

import java.util.concurrent._

object DayFourMain {

  def helloWorldOutput(): Unit = {
    println("Hello World")
  }

  def main(args: Array[String]): Unit = {
    val ex = new ScheduledThreadPoolExecutor(1)
    val task = new Runnable {
      def run() = println("Beep!")
    }
    val f = ex.scheduleAtFixedRate(task, 1, 1, TimeUnit.SECONDS)
    f.cancel(false)}
}
