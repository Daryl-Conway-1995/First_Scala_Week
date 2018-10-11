abstract class Vehicle {

  def model: String

  def tyres: Int

  def repair_cost:Int

  def repair_vehicle:Unit

  def show_Model(): Unit = {
    println(s"Model: $model")
  }

  def show_Tyres(): Unit = {
    println(s"Number of tyres: $tyres")
  }

}
