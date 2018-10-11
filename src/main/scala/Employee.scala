class Employee(first_Name: String, last_Name: String, var age: Int) extends Person {

  override def f_Name: String = first_Name

  override def l_Name: String = last_Name

  override def current_age: Int = age

  override def work_Clearance: Boolean = true

  override def toString: String = s"First name: $first_Name, Last name: $last_Name, Age: $age"
}
