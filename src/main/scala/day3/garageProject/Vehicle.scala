package day3.garageProject

class Vehicle(make: String, model: String, productionYear: String, vehicleType: String, numberPlate: String, owner: Person) {
  override def toString(): String = s"Make: $make\nModel: $model\nYear: $productionYear\n" +
    s"Type: $vehicleType\nNumber Plate: $numberPlate\nOwner: ${owner}"
}
