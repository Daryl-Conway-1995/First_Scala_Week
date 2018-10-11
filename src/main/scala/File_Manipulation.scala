object File_Manipulation {
  def main(args: Array[String]): Unit = {

    val file_Input = read_In_File("C:\\Users\\Admin\\IdeaProjects\\First_Scala_Project\\src\\main\\scala\\test file")
    val longest_Most_Common_Word = find_Max_Occurrence(count_Occurrence(alphabetise(file_Input)))
    longest_Most_Common_Word.foreach(println)
  }


  def read_In_File(file_Name: String): List[String] = {
    scala.io.Source.fromFile(file_Name).getLines().toList
  }

  def alphabetise(list_Of_Words: List[String]): List[String] = {
    val list_Ordered = scala.collection.mutable.ListBuffer[String]()
    for (i <- list_Of_Words.indices) {
      list_Ordered.append(list_Of_Words(i).filter(_ != ' ').sorted)
    }
    list_Ordered.toList
  }

  def count_Occurrence(list_of_Strings: List[String]): Map[String, Int] = {
    list_of_Strings.groupBy(identity).mapValues(_.size)
  }

  def find_Max_Occurrence(map_Of_Words: Map[String, Int]): Map[String, Int] = {
    val max_Occurrence = map_Of_Words.maxBy(_._2)._2
    val length_Of_Word = map_Of_Words.filter(y => y._2 == max_Occurrence).maxBy(_._1.length)._1.length
    val output_Map = map_Of_Words.filter(y => y._2 == max_Occurrence && y._1.length == length_Of_Word)
    output_Map
  }
}
