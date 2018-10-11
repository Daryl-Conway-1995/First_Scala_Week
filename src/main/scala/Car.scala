class Car(car_Model: String, number_Of_Tyres: Int, var repair_Cost: Int) extends Vehicle {
  def this(car_Model: String, number_Of_Tyres: Int) = this(car_Model, number_Of_Tyres, 100)

  override def model: String = car_Model

  override def tyres: Int = number_Of_Tyres

  override def repair_cost: Int = repair_Cost

  override def toString: String = s"Car model: $car_Model, Number of tyres: $number_Of_Tyres"

  override def repair_vehicle: Unit = {
    if(repair_cost == 0)
      println(s"the $model doesn't need to be repaired")
    else {
      println(s"the $model was repaired for $repair_Cost")
      repair_Cost = 0
    }
  }
}
