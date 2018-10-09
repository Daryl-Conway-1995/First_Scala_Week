import javax.naming.spi.DirStateFactory.Result

object First_Scala_Object {

  def main(args: Array[String]): Unit = {
    /*
    println("hello from the object\n")
    println(return_Input("Hello"))
    println(return_Input(234))
    println(chop_String("Hello",3))
    println(join_And_Change("Ha", "llo", 'a', 'e'))
    println(merge_Numbers(5,6,true))
    println(merge_Numbers(5,6,false))
    println(merge_Numbers(0,6,false))
    iterate_String("Hi",3)
    iterate_Square_String("Hi",3)
    fizzBuzz("Fizz","Buzz",15)
    recursion_Large_To_Small(5)
    recursion_Small_To_Large(5)
    string_Recursion("Hi", 3)
    recursion_FizzBuzz("Fizz","Buzz",20)
    */
    var myList = List(5, 7, 8, "String",5.7)
    println(myList)
    println(reverse_List(myList))

  }

  def return_Input(input_Value: Any): String = {
    input_Value.getClass.toString
  }

  def chop_String(input_String: String, number_Of_Letters: Int): String = {
    input_String.substring(number_Of_Letters - 1, input_String.length)
  }

  def join_And_Change(first_String: String, second_String: String, first_Char: Char, second_Char: Char): String = {
    (first_String.concat(second_String)).replaceAll(first_Char.toString, second_Char.toString)
  }

  def merge_Numbers(first_Number: Int, second_Number: Int, is_Addition: Boolean): Int = {
    if (first_Number == 0)
      second_Number
    else if (second_Number == 0)
      first_Number
    else if (is_Addition)
      (first_Number + second_Number)
    else
      (first_Number * second_Number)
  }

  def iterate_String(input_String: String, iterations: Int): Unit = {
    for (a <- 1 to iterations)
      println(input_String)
  }

  def iterate_Square_String(input_String: String, iterations: Int): Unit = {
    for (a <- 1 to iterations; b <- 1 to iterations)
      if (b == iterations)
        println(input_String)
      else
        print(input_String)
  }

  def fizzBuzz(first_String: String, second_String: String, range: Int): Unit = {
    for (a <- 1 to range)
      if (a % 3 == 0 && a % 5 == 0)
        print(first_String + second_String + ", ")
      else if (a % 3 == 0)
        print(first_String + ", ")
      else if (a % 5 == 0)
        print(second_String + ", ")
      else
        print(a + ", ")
  }

  def recursion_Large_To_Small(input_number: Int): Unit = {
    if (input_number > 0)
      {
        println(input_number)
        recursion_Large_To_Small(input_number - 1)
      }
  }

  def recursion_Small_To_Large(input_number: Int): Unit = {
    if (input_number > 0)
    {
      recursion_Small_To_Large(input_number - 1)
      println(input_number)
    }
  }

  def string_Recursion(input_String: String, iterations: Int): Unit = {
    if (iterations == 1)
      println()
    else
      string_Recursion(input_String, iterations - 1)
    println(input_String)
  }

  def recursion_FizzBuzz(first_String:String,second_String:String,input_number: Int): Unit = {
    if (input_number > 0)
    {
      recursion_FizzBuzz(first_String,second_String,input_number - 1)
      if (input_number % 3 == 0 && input_number % 5 == 0)
        print(first_String + second_String + ", ")
      else if (input_number % 3 == 0)
        print(first_String + ", ")
      else if (input_number % 5 == 0)
        print(second_String + ", ")
      else
        print(input_number + ", ")
    }
  }


  def reverse_List[A](input_List:List[A]):List[A]={
    def remake_List[A](result: List[A],input_List:List[A]):List[A]={
      input_List match {
        case Nil => result
        case (element::list) => remake_List(element::result,list)
      }
    }
    remake_List(Nil,input_List)
  }
}
