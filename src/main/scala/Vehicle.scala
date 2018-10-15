abstract class Vehicle {

  def model: String

  def tyres: Int

  def repairCost: Int ={9}

  def repairVehicle()

  def showModel(): Unit = {
    println(s"Model: $model")
  }

  def showTyres(): Unit = {
    println(s"Number of tyres: $tyres")
  }

}
