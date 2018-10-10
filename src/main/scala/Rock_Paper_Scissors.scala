import scala.collection.mutable.ListBuffer
import scala.util.Random

object Rock_Paper_Scissors {

  var win = 0
  var lose = 0
  var draw = 0
  var best_move = "paper"
  var userOptions = ListBuffer(0, 0, 0)

  def main(args: Array[String]): Unit = {
    rock_Paper_Scissors("rock")
    rock_Paper_Scissors("rock")
    rock_Paper_Scissors("rock")
    rock_Paper_Scissors("rock")
    rock_Paper_Scissors("paper")
    rock_Paper_Scissors("rock")
    rock_Paper_Scissors("random words")
    rock_Paper_Scissors("scissors")
    rock_Paper_Scissors("paper")
    rock_Paper_Scissors("paper")
    rock_Paper_Scissors("paper")
    rock_Paper_Scissors("scissors")
    rock_Paper_Scissors("stop")

  }

  def rock_Paper_Scissors(user_Choice: String): Unit = {
    println(user_Choice)
    find_Results(user_Choice) match {
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

      case _ =>
        println("wrong input\n")

    }
  }

  def find_Results(user_Choice: String): String = user_Choice.toLowerCase match {
    case "rock" =>
      userOptions(0) = userOptions.head + 1
      val computer_Choice = computer_Choose()
      computer_Choice match {
        case "rock" =>
          println("you both picked rock it's a draw")
          best_move = "rock"
          "draw"

        case "paper" =>
          println("computer picked paper you lose")
          best_move = "rock"
          "lose"

        case "scissors" =>
          println("computer picked scissors you win")
          best_move = "rock"
          "win"

      }

    case "paper" =>
      userOptions(1) = userOptions(1) + 1
      val computer_Choice = computer_Choose()
      computer_Choice match {
        case "rock" =>
          println("computer picked rock you win")
          best_move = "paper"
          "win"

        case "paper" =>
          println("you both picked paper it's a draw")
          best_move = "paper"
          "draw"

        case "scissors" =>
          println("computer picked scissors you lose")
          best_move = "paper"
          "lose"

      }

    case "scissors" =>
      userOptions(2) = userOptions(2) + 1
      val computer_Choice = computer_Choose()
      computer_Choice match {
        case "rock" =>
          println("computer picked rock you lose")
          best_move = "scissors"
          "lose"

        case "paper" =>
          println("computer picked paper you win")
          best_move = "scissors"
          "win"

        case "scissors" =>
          println("you both picked scissors it's a draw")
          best_move = "scissors"
          "draw"

      }

    case "stop" =>
      println("Thank you for playing")
      "stop"

    case _ =>
      "ignore"

  }

  def find_Best_Move(): Unit = {
    userOptions.indexOf(userOptions.max) match {
      case 0 => best_move = "paper"
      case 1 => best_move = "scissors"
      case 2 => best_move = "rock"
    }
  }

  def computer_Choose(): String = {
    find_Best_Move()
    val options = List("rock", "paper", "scissors", best_move, best_move, best_move)
    options(Random.nextInt(6))
  }

}