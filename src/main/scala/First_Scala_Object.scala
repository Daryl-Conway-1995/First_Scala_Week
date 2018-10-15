object First_Scala_Object {

  def main(args: Array[String]): Unit = {
    /*

    //simple methods
    println("hello from the object\n")
    println(returnInput("Hello"))
    println(returnInput(234))
    println(chopString("Hello",3))
    println(joinAndChange("Ha", "llo", 'a', 'e'))

    //conditionals
    println(mergeNumbers(5,6,true))
    println(mergeNumbers(5,6,false))
    println(mergeNumbers(0,6,false))

    //for loops
    iterateString("Hi",3)
    iterateSquareString("Hi",3)
    fizzBuzz("Fizz","Buzz",15)

    //recursion
    recursionLargeToSmall(5)
    recursionSmallToLarge(5)
    stringRecursion("Hi", 3)
    recursionFizzBuzz("Fizz","Buzz",20)

    //reversing a list
    var myList = List(5, 7, 8, "String",5.7)
    println(reverseList(myList))
    reverseCollection(Array(2,67))

    //case statements
    whatMonthIs(4)
    whatMonthIs(12)
    whatMonthIs(13)
    println(whatTypeIs(List(4,4)))
    println(whatTypeIs(4f))
    println(whatTypeIs((4,4)))

    //intermediate conditionals
    println(blackJack(21, 19))
    println(blackJack(22, 15))
    println(blackJack(24, 22))
    println(uniqueSum(1, 2, 3))
    println(uniqueSum(3, 3, 3))
    println(uniqueSum(1, 1, 2))
    println(tooHot(60,true))
    println(tooHot(91,false))
    println(tooHot(91,true))
    */

    getTimezoneIds()

  }

  //region simple methods

  def returnInput(inputValue: Any): String = {
    inputValue.getClass.toString
  }

  def chopString(inputString: String, numberOfLetters: Int): String = {
    inputString.substring(numberOfLetters - 1, inputString.length)
  }

  def joinAndChange(firstString: String, secondString: String, firstChar: Char, secondChar: Char): String = {
    firstString.concat(secondString).replaceAll(firstChar.toString, secondChar.toString)
  }

  //endregion simple methods

  //region conditionals

  def mergeNumbers(firstNumber: Int, secondNumber: Int, isAddition: Boolean): Int = {
    if (firstNumber == 0)
      secondNumber
    else if (secondNumber == 0)
      firstNumber
    else if (isAddition)
      firstNumber + secondNumber
    else
      firstNumber * secondNumber
  }

  //endregion conditionals

  //region for loops

  def iterateString(inputString: String, iterations: Int): Unit = {
    for (a <- 1 to iterations)
      println(inputString)
  }

  def iterateSquareString(inputString: String, iterations: Int): Unit = {
    for (a <- 1 to iterations; b <- 1 to iterations)
      if (b == iterations)
        println(inputString)
      else
        print(inputString)
  }

  def fizzBuzz(firstString: String, secondString: String, range: Int): Unit = {
    for (a <- 1 to range)
      if (a % 3 == 0 && a % 5 == 0)
        print(firstString + secondString + ", ")
      else if (a % 3 == 0)
        print(firstString + ", ")
      else if (a % 5 == 0)
        print(secondString + ", ")
      else
        print(a + ", ")
  }

  //endregion for loops

  //region recursion

  def recursionLargeToSmall(inputnumber: Int): Unit = {
    if (inputnumber > 0) {
      println(inputnumber)
      recursionLargeToSmall(inputnumber - 1)
    }
  }

  def recursionSmallToLarge(inputnumber: Int): Unit = {
    if (inputnumber > 0) {
      recursionSmallToLarge(inputnumber - 1)
      println(inputnumber)
    }
  }

  def stringRecursion(inputString: String, iterations: Int): Unit = {
    if (iterations == 1)
      println()
    else
      stringRecursion(inputString, iterations - 1)
    println(inputString)
  }

  def recursionFizzBuzz(firstString: String, secondString: String, inputNumber: Int): Unit = {
    if (inputNumber > 0) {
      recursionFizzBuzz(firstString, secondString, inputNumber - 1)
      if (inputNumber % 3 == 0 && inputNumber % 5 == 0)
        print(firstString + secondString + ", ")
      else if (inputNumber % 3 == 0)
        print(firstString + ", ")
      else if (inputNumber % 5 == 0)
        print(secondString + ", ")
      else
        print(inputNumber + ", ")
    }
  }

  //endregion

  //region reverse lists

  def reverseCollection(inputList: Any): Unit = {
    inputList match {
      case a: Array[_] =>
        a.reverse.foreach(println)
      case l: List[_] =>
        l.foreach(println)
      case t: (_, _) =>
        println(t.swap)
      case _ => println("not a valid option sorry")
    }
  }

  def reverseList[A](inputList: List[A]): List[A] = {
    //manual version of .reverse
    def remakeList[_](result: List[A], inputList: List[A]): List[A] = {
      inputList match {
        case Nil => result
        case element :: list => remakeList(element :: result, list)
      }
    }

    remakeList(Nil, inputList)
  }

  //endregion

  //region case statements

  def conditional2(firstNumber: Int, secondNumber: Int, isAddition: Boolean): Int = isAddition match {
    case true => firstNumber + secondNumber
    case false if firstNumber == 0 => secondNumber
    case false if secondNumber == 0 => firstNumber
    case false => firstNumber * secondNumber
    case _ => 0
  }

  def tooHot2(temp: Int, isSummer: Boolean): Boolean = isSummer match {
    case true if 60 <= temp && temp <= 100 => true
    case false if 60 <= temp && temp <= 90 => true
    case _ => false
  }

  def whatMonthIs(month: Int): Unit = {
    month match {
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
      case _ => println(s"Invalid number, month $month does not exist.")
    }
  }


  def whatTypeIs(input: Any): String = input match {
    case s: String => s + " is a String"
    case i: Int => i + " is an Int"
    case f: Float => f + " is a Float"
    case l: List[_] => l + " is a List"
    case _ => f" $input is a " + input.getClass
  }

  //endregion case statements

  def getTimezoneIds(): Unit = {
    java.util.TimeZone.getAvailableIDs()
      .map(value => value.split('/'))
      .filter(_.length > 1)
      .flatMap(_.toList)
      .distinct
      .grouped(10).toList
      .head.foreach(println)
  }

  //region intermediate conditionals

  def blackJack(firstInt: Int, secondInt: Int): Int = {
    if (isValidNumber(firstInt) > isValidNumber(secondInt)) firstInt
    else secondInt
  }

  def isValidNumber(number:Int):Int={
    if (number <= 21 && number >= 0) number
    else 0
  }

  def uniqueSum(first: Int, second: Int, third: Int): Int = {
    if (first == second && first == third) 0
    else if (first == second) third
    else if (first == third) second
    else if (second == third) first
    else first + second + third
  }

  def tooHot(temp: Int, isSummer: Boolean): Boolean = {
    if (temp >= 60 && temp <= setMaxTemp(isSummer)) true
    else false
  }

  def setMaxTemp(isSummer:Boolean):Int ={
    if (isSummer) 100
    else 90
  }

  //endregion intermediate conditionals

}
