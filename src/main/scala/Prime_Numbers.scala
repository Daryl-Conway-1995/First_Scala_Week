import java.util.Calendar

object Prime_Numbers {

  def main(args: Array[String]): Unit = {

    var max_Number = 100000000

    //(1 to max_Number).foreach(i => if (is_Prime(i)) println(s"$i is a prime number"))
    number_Of_Primes(max_Number)
  }


  def is_Prime(value: Int): Boolean = {
    if (value < 2) false
    else !(2 to math.sqrt(value).toInt).exists(counter => value % counter == 0)
    //   for number between 2 and SQRT, if a mod returns 0 then is not prime
  }

  def number_Of_Primes(max: Int): Unit = {
    val time1 = Calendar.getInstance()
    var counter = 0
    (1 to max).foreach(i => if (is_Prime(i)) counter += 1)
    println(s"number of primes under $max is $counter")
    val time2 = Calendar.getInstance()
    val minutes = time2.get(Calendar.MINUTE) - time1.get(Calendar.MINUTE)
    val seconds = time2.get(Calendar.SECOND) - time1.get(Calendar.SECOND)
    println(s"This took $minutes minutes and $seconds seconds")
  }
}
