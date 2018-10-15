object BrokenKeyboard {
  def main(args: Array[String]): Unit = {
    brokenKeyboard(10, "qwertyuiopasdfghjklzxcvbnm", "ghty", "g", "yrhlo", "power", "ths", "owiuenk")
  }

  def brokenKeyboard(number: Int, strings: String*): Unit = {
    strings.foreach(v => if (strings.indexOf(v) < number) findLongestWord(v))
  }

  def findLongestWord(inputKeys: String): Unit = {
    val LongestWordList = scala.io.Source.fromFile("C:\\Users\\Admin\\IdeaProjects\\First_Scala_Project\\src\\main\\scala\\Word List")
      .getLines()
      .toList
      .filter(v => v
        .toLowerCase
        .distinct
        .diff(inputKeys.toLowerCase.distinct) == "")
    if (LongestWordList.nonEmpty)
      println(LongestWordList.maxBy(v => v.length))
    else
      println("")
  }

}
