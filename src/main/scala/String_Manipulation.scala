object String_Manipulation {
  def main(args: Array[String]): Unit = {

    val results = find_Longest_Sequence("Sesquipedalian", "Hippopotomonstrosesquipedaliophobic")
    //input1 = love of long words, input2 = fear of long words
    println(results)

  }


  def get_All_SubStrings(input: String): Set[String] = {
    input.inits.flatMap(_.tails).toSet
  }

  def find_Longest_Sequence(input1: String, input2: String): String = {
    val subStrings1 = get_All_SubStrings(input1)
    val subStrings2 = get_All_SubStrings(input2)

    subStrings1.intersect(subStrings2).maxBy(_.length)
  }

  def find_Common_Letters(input1: String, input2: String): String = {
    //to be made
    ""
  }

}
