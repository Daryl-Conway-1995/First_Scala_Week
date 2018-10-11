abstract class Vehicle {

  def model: String

  def tyres: Int

  def show_Model(): Unit = {
    println(s"Model: $model")
  }

  def show_Tyres(): Unit = {
    println(s"Number of tyres: $tyres")
  }
}
