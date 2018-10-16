package Fibinacci

object TestFibonacci {

  def main(args: Array[String]): Unit = {
    for (i <- 0 to 15) println(fibonacci(i))
  }

  def fibonacci(inputNumber: Int): Int = {
    @annotation.tailrec
    def fibonacciTail(position: Int, firstNumber: Int, secondNumber: Int): Int = position match {
      case 0 => firstNumber
      case _ => fibonacciTail(position - 1, secondNumber, firstNumber + secondNumber)
    }

    fibonacciTail(inputNumber, 0, 1)
  }

}