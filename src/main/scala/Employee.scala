class Employee(firstName: String, lastName: String, var age: Int) extends Person {

  override def fName: String = firstName

  override def lName: String = lastName

  override def currentAge: Int = age

  override def workClearance: Boolean = true

  override def toString: String = s"First name: $firstName, Last name: $lastName, Age: $age"
}
