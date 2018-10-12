import scala.collection.mutable.ListBuffer
import scala.util.Random

object Rock_Paper_Scissors {

  var win = 0
  var lose = 0
  var draw = 0
  var bestMove = "paper"
  var userOptions = ListBuffer(0, 0, 0)

  def main(args: Array[String]): Unit = {
    rockPaperScissors("rock")
    rockPaperScissors("rock")
    rockPaperScissors("rock")
    rockPaperScissors("rock")
    rockPaperScissors("paper")
    rockPaperScissors("rock")
    rockPaperScissors("random words")
    rockPaperScissors("scissors")
    rockPaperScissors("paper")
    rockPaperScissors("paper")
    rockPaperScissors("paper")
    rockPaperScissors("scissors")
    rockPaperScissors("stop")

  }

  def rockPaperScissors(userChoice: String): Unit = {
    println(userChoice)
    findResults(userChoice) match {
      case "win" =>
        win = win + 1
        println(s"you now have $win win(s)\n")

      case "lose" =>
        lose = lose + 1
        println(s"you now have $lose lose(s)\n")

      case "draw" =>
        draw = draw + 1
        println(s"now you have $draw draw(s)\n")

      case "stop" =>
        println(s"Final results:\nWins: $win\nLoses: $lose\nDraws: $draw")

      case _  =>
        println("wrong input\n")

    }
  }

  def findResults(userChoice: String): String = userChoice.toLowerCase match {
    case "rock" =>
      userOptions(0) = userOptions.head + 1
      val computerChoice = computerChoose()
      computerChoice match {
        case "rock" =>
          println("you both picked rock it's a draw")
          bestMove = "rock"
          "draw "

        case "paper" =>
          println("computer picked paper you lose")
          bestMove = "rock"
          "lose"

        case "scissors" =>
          println("computer picked scissors you win")
          bestMove = "rock"
          "win"

      }

    case "paper" =>
      userOptions(1) = userOptions(1) + 1
      val computerChoice = computerChoose()
      computerChoice match {
        case "rock" =>
          println("computer picked rock you win")
          bestMove = "paper"
          "win"

        case "paper" =>
          println("you both picked paper it's a draw")
          bestMove = "paper"
          "draw"

        case "scissors" =>
          println("computer picked scissors you lose")
          bestMove = "paper"
          "lose"

      }

    case "scissors" =>
      userOptions(2) = userOptions(2) + 1
      val computerChoice = computerChoose()
      computerChoice match {
        case "rock" =>
          println("computer picked rock you lose")
          bestMove = "scissors"
          "lose"

        case "paper" =>
          println("computer picked paper you win")
          bestMove = "scissors"
          "win"

        case "scissors" =>
          println("you both picked scissors it's a draw")
          bestMove = "scissors"
          "draw"

      }

    case "stop" =>
      println("Thank you for playing")
      "stop"

    case _ =>
      "ignore"

  }

  def findBestMove(): Unit = {
    userOptions.indexOf(userOptions.max) match {
      case 0 => bestMove = "paper"
      case 1 => bestMove = "scissors"
      case 2 => bestMove = "rock"
    }
  }

  def computerChoose(): String = {
    findBestMove()
    List("rock", "paper", "scissors", bestMove, bestMove, bestMove)(Random.nextInt(6))
  }

}