package day3.garageProject

abstract class Person(var name: String, var contactNo: String, var emailAddress: String) {

  final def updateName(newName: String): Unit = {
    name = newName
  }

  final def updateContactNo(newContactNo: String): Unit = {
    contactNo = newContactNo
  }

  final def updateEmailAddress(newEmailAddress: String): Unit = {
    emailAddress = newEmailAddress
  }
}
