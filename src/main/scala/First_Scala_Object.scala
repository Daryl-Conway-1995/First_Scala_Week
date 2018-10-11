import javax.naming.spi.DirStateFactory.Result

object First_Scala_Object {

  def main(args: Array[String]): Unit = {
    /*

    //simple methods
    println("hello from the object\n")
    println(return_Input("Hello"))
    println(return_Input(234))
    println(chop_String("Hello",3))
    println(join_And_Change("Ha", "llo", 'a', 'e'))

    //conditionals
    println(merge_Numbers(5,6,true))
    println(merge_Numbers(5,6,false))
    println(merge_Numbers(0,6,false))

    //for loops
    iterate_String("Hi",3)
    iterate_Square_String("Hi",3)
    fizzBuzz("Fizz","Buzz",15)

    //recursion
    recursion_Large_To_Small(5)
    recursion_Small_To_Large(5)
    string_Recursion("Hi", 3)
    recursion_FizzBuzz("Fizz","Buzz",20)

    //reversing a list
    var myList = List(5, 7, 8, "String",5.7)
    println(reverse_List(myList))
    reverse_Collection(Array(2,67))

    //case statements
    what_Month_Is(4)
    what_Month_Is(12)
    what_Month_Is(13)
    println(what_Type_Is(List(4,4)))
    println(what_Type_Is(4f))
    println(what_Type_Is((4,4)))

    //intermediate conditionals
    println(blackJack(21, 19))
    println(blackJack(22, 15))
    println(blackJack(24, 22))
    println(unique_Sum(1, 2, 3))
    println(unique_Sum(3, 3, 3))
    println(unique_Sum(1, 1, 2))
    println(too_Hot(60,true))
    println(too_Hot(91,false))
    println(too_Hot(91,true))
    */

    get_Timezone_Ids()

  }

  //region simple methods

  def return_Input(input_Value: Any): String = {
    input_Value.getClass.toString
  }

  def chop_String(input_String: String, number_Of_Letters: Int): String = {
    input_String.substring(number_Of_Letters - 1, input_String.length)
  }

  def join_And_Change(first_String: String, second_String: String, first_Char: Char, second_Char: Char): String = {
    first_String.concat(second_String).replaceAll(first_Char.toString, second_Char.toString)
  }

  //endregion simple methods

  //region conditionals

  def merge_Numbers(first_Number: Int, second_Number: Int, is_Addition: Boolean): Int = {
    if (first_Number == 0)
      second_Number
    else if (second_Number == 0)
      first_Number
    else if (is_Addition)
      first_Number + second_Number
    else
      first_Number * second_Number
  }

  //endregion conditionals

  //region for loops

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

  //endregion for loops

  //region recursion

  def recursion_Large_To_Small(input_number: Int): Unit = {
    if (input_number > 0) {
      println(input_number)
      recursion_Large_To_Small(input_number - 1)
    }
  }

  def recursion_Small_To_Large(input_number: Int): Unit = {
    if (input_number > 0) {
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

  def recursion_FizzBuzz(first_String: String, second_String: String, input_number: Int): Unit = {
    if (input_number > 0) {
      recursion_FizzBuzz(first_String, second_String, input_number - 1)
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

  //endregion

  //region reverse lists

  def reverse_Collection(x: Any): Unit = {
    x match {
      case a: Array[_] =>
        val a2 = a.reverse
        a2.foreach(println)
      case l: List[_] =>
        val l2 = l.reverse
        l2.foreach(println)
      case t: (_, _) =>
        val t2 = t.swap
        println(t2)
      case _ => println("not a valid option sorry")
    }
  }

  def reverse_List[A](input_List: List[A]): List[A] = {
    //manual version of .reverse
    def remake_List[_](result: List[A], input_List: List[A]): List[A] = {
      input_List match {
        case Nil => result
        case element :: list => remake_List(element :: result, list)
      }
    }

    remake_List(Nil, input_List)
  }

  //endregion

  //region case statements

  def conditional2(first_Number: Int, second_Number: Int, is_Addition: Boolean): Int = is_Addition match {
    case true => first_Number + second_Number
    case false if first_Number == 0 => second_Number
    case false if second_Number == 0 => first_Number
    case false => first_Number * second_Number
    case _ => 0
  }

  def too_Hot2(temp: Int, is_Summer: Boolean): Boolean = is_Summer match {
    case true if 60 <= temp && temp <= 100 => true
    case false if 60 <= temp && temp <= 90 => true
    case _ => false
  }

  def what_Month_Is(x: Int): Unit = {
    x match {
      case 1 => println("january")
      case 2 => println("february")
      case 3 => println("march")
      case 4 => println("april")
      case 5 => println("may")
      case 6 => println("june")
      case 7 => println("july")
      case 8 => println("august")
      case 9 => println("september")
      case 10 => println("october")
      case 11 => println("november")
      case 12 => println("december")
      case _ => println(s"Invalid number, month $x does not exist.")
    }
  }


  def what_Type_Is(x: Any): String = x match {
    case s: String => s + " is a String"
    case i: Int => i + " is an Int"
    case f: Float => f + " is a Float"
    case l: List[_] => l + " is a List"
    case _ => f" $x is a " + x.getClass
  }

  //endregion case statements

  def get_Timezone_Ids(): Unit = {
    java.util.TimeZone.getAvailableIDs()
      .map(value => value.split('/'))
      .filter(_.length > 1)
      .flatMap(_.toList)
      .distinct
      .grouped(10).toList
      .head.foreach(println)
  }

  //region intermediate conditionals

  def blackJack(first_Int: Int, second_Int: Int): Int = {
    var hold_First = 0
    var hold_Second = 0
    if (first_Int <= 21 && first_Int >= 0) hold_First = first_Int
    if (second_Int <= 21 && second_Int >= 0) hold_Second = second_Int
    if (hold_First > hold_Second) hold_First
    else hold_Second
  }

  def unique_Sum(first: Int, second: Int, third: Int): Int = {
    if (first == second && first == third) 0
    else if (first == second) third
    else if (first == third) second
    else if (second == third) first
    else first + second + third
  }

  def too_Hot(temp: Int, is_Summer: Boolean): Boolean = {
    var upper_Temp = 90
    if (is_Summer) upper_Temp = 100
    if (temp >= 60 && temp <= upper_Temp) true
    else false
  }

  //endregion intermediate conditionals

}
