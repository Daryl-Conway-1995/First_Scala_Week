abstract class Vehicle {

  def model: String

  def tyres: Int

  def repairCost: Int ={_}

  def repairVehicle()

  def showModel(): Unit = {
    println(s"Model: $model")
  }

  def showTyres(): Unit = {
    println(s"Number of tyres: $tyres")
  }

}
