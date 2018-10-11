class Customer(first_Name: String, last_Name: String, var age: Int, var vehicles: List[Vehicle]) extends Person {
  def this(first_Name: String, last_Name: String, age: Int) = this(first_Name, last_Name, age, List[Vehicle]())

  override def f_Name: String = first_Name

  override def l_Name: String = last_Name

  override def current_age: Int = age

  override def work_Clearance: Boolean = false

  def add_Vehicle(vehicle: Vehicle): Unit = {
    vehicles = vehicle :: vehicles
  }

  def get_Vehicle(which_Vehicle: Int): Vehicle = {
    vehicles(which_Vehicle)
  }

  def remove_Vehicle(vehicle_Model: String):Unit ={
    val names = scala.collection.mutable.ListBuffer[Vehicle]()
    for (i <- vehicles.indices) {
      if (vehicles(i).model != vehicle_Model) {
        names += vehicles(i)
      }
    }
    vehicles = names.toList
  }

  def remove_Vehicle(vehicle_Index: Int):Unit ={
    val names = scala.collection.mutable.ListBuffer[Vehicle]()
    for (i <- vehicles.indices) {
      if (i != vehicle_Index) {
        names += vehicles(i)
      }
    }
    vehicles = names.toList
  }

  def show_All_Repair_Costs():Unit ={
    var total_cost =0
    for (i <- vehicles.indices) {
      val name = vehicles(i).model
      val cost = vehicles(i).repair_cost
      total_cost += cost
      println(s"The cost of repairing $name will be $cost.")
    }
    println(s"The total cost will be $total_cost")
  }

  def repair_vehicle(vehicle_Model: String):Unit={
    for (i <- vehicles.indices) {
      if (vehicle_Model == vehicles(i).model)
        {
          vehicles(i).repair_vehicle
        }
    }
  }

  def number_Of_Vehicles(): Int = {
    vehicles.length
  }

  def get_Vehicle_Names(): List[String] = {
    val names = scala.collection.mutable.ListBuffer[String]()
    for (i <- vehicles.indices) {
      names += vehicles(i).model
    }
    names.toList
  }

  override def toString: String = s"First name: $first_Name, Last name: $last_Name, Age: $age"
}
