class Customer(first_Name: String, last_Name: String, var age: Int, var vehicles: List[Vehicle]) extends Person {
  def this (first_Name: String, last_Name: String, age: Int) = this(first_Name,last_Name,age,List[Vehicle])

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

}
