class Customer(firstName: String, lastName: String, var age: Int, var vehicles: List[Vehicle]) extends Person {
  def this(firstName: String, lastName: String, age: Int) = this(firstName, lastName, age, List[Vehicle]())

  override def fName: String = firstName

  override def lName: String = lastName

  override def currentAge: Int = age

  override def workClearance: Boolean = false

  def addVehicle(vehicle: Vehicle): Unit = {
    vehicles = vehicle :: vehicles
  }

  def getVehicle(whichVehicle: Int): Vehicle = {
    vehicles(whichVehicle)
  }

  def removeVehicle(vehicleModel: Any): Unit = {
    val names = scala.collection.mutable.ListBuffer[Vehicle]()
    if (vehicleModel.getClass == "".getClass) {
      vehicles.foreach(v => if (v.model != vehicleModel) names += v)
    }
    if (vehicleModel.getClass == 4.getClass) {
      vehicles.foreach(v => if (vehicles.indexOf(v) != vehicleModel) names += v)
    }
    vehicles = names.toList
  }


  def showAllRepairCosts(): Unit = {
    var totalCost =0
    vehicles.foreach(v=>println(s"The cost of repairing ${v.model} will be ${v.repairCost}."))
    vehicles.foreach(v=>totalCost += v.repairCost)
    println(s"The total cost will be $totalCost")
  }

  def repairvehicle(vehicleModel: String): Unit = {
    vehicles.foreach(v=>if(v.model==vehicleModel) v.repairVehicle())
  }

  def numberOfVehicles(): Int = {
    vehicles.length
  }

  def getVehicleNames(): List[String] = {
    val names = scala.collection.mutable.ListBuffer[String]()
    vehicles.foreach(v=>names+=v.model)
    names.toList
  }

  override def toString: String = s"First name: $firstName, Last name: $lastName, Age: $age"
}
