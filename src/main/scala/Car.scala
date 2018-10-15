class Car(carModel: String, numberOfTyres: Int, var currentRepairCost: Int) extends Vehicle {
  def this(carModel: String, numberOfTyres: Int) = this(carModel, numberOfTyres, 100)

  override def model: String = carModel

  override def tyres: Int = numberOfTyres

  override def repairCost: Int = currentRepairCost

  override def toString: String = s"Car model: $carModel, Number of tyres: $numberOfTyres"

  override def repairVehicle: Unit = {
    if(repairCost == 0)
      println(s"the $model doesn't need to be repaired")
    else {
      println(s"the $model was repaired for $repairCost")
      currentRepairCost = 0
    }
  }
}
