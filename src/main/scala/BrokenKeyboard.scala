object BrokenKeyboard {
  def main(args: Array[String]): Unit = {
    //brokenKeyboard(5, "fgt e", "ghty", "g", "yrhlo", "power")
  }

  def brokenKeyboard(number: Int, strings: String*): Unit = {
    for (i <- 0 until number if i < strings.length)
      findLongestWord(strings(i))
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
