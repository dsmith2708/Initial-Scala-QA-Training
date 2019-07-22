package day3.garageProject

import scala.collection.mutable.ListBuffer

class Garage( val currentVehicles: ListBuffer[Vehicle], var currentEmployees: ListBuffer[Employee], var garageOpen: Boolean) {
  def addVehicle(vehicleToAdd: Vehicle): Boolean = {
    if(garageOpen) {
      currentVehicles += vehicleToAdd
      println(currentVehicles)
      true
    } else false
  }

  def removeVehicle(vehicleIDToRemove: Int): Unit = {

  }

  def removeVehicleType(vehicleTypeToRemove: String): Unit = {

  }

  def registerEmployee(employeeToRegister: Employee): Unit = {

  }

  def fixVehicle(vehicleIDToFix: Int): Unit = {

  }

  def calculateBill(vehicleToCalculateBillFor: Int): Unit = {

  }

  def outputGarageContents(): Unit = {

  }

  def openGarage(): Unit = {
    garageOpen = true
  }

  def closeGarage(): Unit = {

  }
}
