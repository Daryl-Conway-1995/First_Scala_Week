class Car(car_Model: String, number_Of_Tyres: Int) extends Vehicle {

  override def model: String = car_Model

  override def tyres: Int = number_Of_Tyres
}