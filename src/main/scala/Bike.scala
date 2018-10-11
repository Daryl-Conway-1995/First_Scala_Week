class Bike(bike_Model: String, number_Of_Tyres: Int) extends Vehicle {

  override def model: String = bike_Model

  override def tyres: Int = number_Of_Tyres
}
