import java.util.Calendar

object Prime_Numbers {

  def main(args: Array[String]): Unit = {

    val maxNumber = 10000000

    //(1 to maxNumber).foreach(i => if (isPrime(i)) println(s"$i is a prime number"))
    numberOfPrimes(maxNumber)
  }


  def isPrime(value: Int): Boolean = {
    if (value < 2) false
    else !(2 to math.sqrt(value).toInt).exists(counter => value % counter == 0)
    //   for number between 2 and SQRT, if a mod returns 0 then is not prime
  }

  def numberOfPrimes(max: Int): Unit = {
    val time1 = Calendar.getInstance()
    var counter = 0
    (1 to max).foreach(i => if (isPrime(i)) counter += 1)
    println(s"number of primes under $max is $counter")
    val time2 = Calendar.getInstance()
    val minutes = time2.get(Calendar.MINUTE) - time1.get(Calendar.MINUTE)
    val seconds = time2.get(Calendar.SECOND) - time1.get(Calendar.SECOND)
    println(s"This took $minutes minutes and $seconds seconds")
  }
}
