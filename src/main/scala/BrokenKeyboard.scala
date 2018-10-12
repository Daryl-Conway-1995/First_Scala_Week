object BrokenKeyboard {
  def main(args: Array[String]): Unit = {
    brokenKeyboard(3, "fgte", "ghty", "atyrendf")
  }

  def brokenKeyboard(number:Int, strings :String*):Unit={
    for(i<-0 until number)
      findLongestWord(strings(i))
  }

  def findLongestWord(inputKeys: String): String = {
    val LongestWord = scala.io.Source.fromFile("C:\\Users\\Admin\\IdeaProjects\\First_Scala_Project\\src\\main\\scala\\Word List")
      .getLines()
      .toList
      .filter(v => v
        .toLowerCase
        .distinct
        .diff(inputKeys.toLowerCase.distinct) == "")
      .maxBy(v => v.length)
    println(LongestWord)
    ""
  }

}
