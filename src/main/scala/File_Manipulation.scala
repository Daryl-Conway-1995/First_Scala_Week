object File_Manipulation {
  def main(args: Array[String]): Unit = {

    val fileInput = readInFile("C:\\Users\\Admin\\IdeaProjects\\FirstScalaProject\\src\\main\\scala\\test file")
    val longestMostCommonWord = findMaxOccurrence(countOccurrence(alphabetise(fileInput)))
    longestMostCommonWord.foreach(println)
  }


  def readInFile(fileName: String): List[String] = {
    scala.io.Source.fromFile(fileName).getLines().toList
  }

  def alphabetise(listOfWords: List[String]): List[String] = {
    val listOrdered = scala.collection.mutable.ListBuffer[String]()
    for (i <- listOfWords.indices) {
      listOrdered.append(listOfWords(i).filter(_ != ' ').sorted)
    }
    listOrdered.toList
  }

  def countOccurrence(listOfStrings: List[String]): Map[String, Int] = {
    listOfStrings.groupBy(identity).mapValues(_.size)
  }

  def findMaxOccurrence(mapOfWords: Map[String, Int]): Map[String, Int] = {
    val maxOccurrence = mapOfWords.maxBy(_._2)._2
    val lengthOfWord = mapOfWords.filter(y => y._2 == maxOccurrence).maxBy(_._1.length)._1.length
    val outputMap = mapOfWords.filter(y => y._2 == maxOccurrence && y._1.length == lengthOfWord)
    outputMap
  }
}
