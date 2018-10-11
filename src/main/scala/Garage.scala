object Garage {

  def main(args: Array[String]): Unit = {
    val car1 = new Car("Mini", 4, 300)
    val bike1 = new Bike("Honda", 2)
    val bike2 = new Bike("Yamaha", 2, 150)
    val car2 = new Car("Deawoo", 4)
    val tempList = List(car1)

    val customer1 = new Customer("jo", "smith", 45)
    val customer2 = new Customer("sam", "baker", 38, tempList)
    val employee = new Employee("tim", "hardy", 25)

    customer1.add_Vehicle(bike1)
    customer1.add_Vehicle(car2)
    customer1.add_Vehicle(bike2)

    println(employee.toString)
    println(customer1.toString)
    println(customer2.toString)
    //    println(customer1.get_Vehicle_Names())
    //    println(customer2.get_Vehicle_Names())
    //    customer1.remove_Vehicle(1)
    //    println(customer1.get_Vehicle_Names())
    //    customer1.remove_Vehicle("Yamaha")
    println(customer1.get_Vehicle_Names())
    customer1.show_All_Repair_Costs()
    customer1.repair_vehicle("Deawoo")
    customer1.show_All_Repair_Costs()
  }
}
