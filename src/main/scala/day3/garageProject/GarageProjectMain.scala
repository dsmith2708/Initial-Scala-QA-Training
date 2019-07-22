package day3.garageProject

import scala.collection.mutable.ListBuffer

object GarageProjectMain {
  def main(args: Array[String]): Unit = {
    println("Garage works")

    val garage = new Garage(ListBuffer(), ListBuffer(), false)

    garage.openGarage()
    val customerToAdd = new Customer("Daniel Smith", "+447854543256", emailAddress = "fakeEmail@emailfakes.com")

    if(garage.addVehicle(new Car("Honda", "CRV", "2005", "Car", "NC55 HTT",
      customerToAdd))) {
      println("Car added")
    } else {
      println("Car not added as garage is closed")
    }

  }
}
