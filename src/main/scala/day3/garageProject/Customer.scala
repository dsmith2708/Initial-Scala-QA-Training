package day3.garageProject

class Customer(name: String, contactNo: String, emailAddress: String)
  extends Person(name, contactNo, emailAddress) {
  override def toString: String = s"\n       Name- $name\n       Contact Number- $contactNo\n       email- $emailAddress"
}
