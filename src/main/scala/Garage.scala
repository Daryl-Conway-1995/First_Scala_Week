object Garage {

  def main(args: Array[String]): Unit = {
    val car1 = new Car("Mini", 4, 300)
    val bike1 = new Bike("Honda", 2)
    val bike2 = new Bike("Yamaha", 2, 150)
    val car2 = new Car("Daewoo", 4)
    val tempList = List(car1)

    val customer1 = new Customer("jo", "smith", 45)
    val customer2 = new Customer("sam", "baker", 38, tempList)
    val employee = new Employee("tim", "hardy", 25)

    customer1.addVehicle(bike1)
    customer1.addVehicle(car2)
    customer1.addVehicle(bike2)

    println(employee.toString)
    println(customer1.toString)
    println(customer2.toString)
    //    println(customer1.getVehicleNames())
    //    println(customer2.getVehicleNames())
    //    customer1.removeVehicle(1)
    //    println(customer1.getVehicleNames())
    //    customer1.removeVehicle("Yamaha")
    println(customer1.getVehicleNames())
    customer1.showAllRepairCosts()
    customer1.repairvehicle("Daewoo")
    customer1.showAllRepairCosts()
  }
}
