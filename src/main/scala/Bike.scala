class Bike(bike_Model: String, number_Of_Tyres: Int,var repair_Cost:Int) extends Vehicle {
   def this(bike_Model: String, number_Of_Tyres: Int) = this(bike_Model,number_Of_Tyres,100)

  override def model: String = bike_Model

  override def tyres: Int = number_Of_Tyres

  override def repair_cost: Int = repair_Cost

  override def toString: String = s"Car model: $bike_Model, Number of tyres: $number_Of_Tyres"

  override def repair_vehicle: Unit =
    if(repair_cost == 0)
      println(s"the $model doesn't need to be repaired")
    else {
      println(s"the $model was repaired for $repair_Cost")
      repair_Cost = 0
    }
}
