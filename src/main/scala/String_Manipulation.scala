object String_Manipulation {
  def main(args: Array[String]): Unit = {

    val results = find_Longest_Sequence("Sesquipedalian", "Hippopotomonstrosesquipedaliophobic")
    //input1 = love of long words, input2 = fear of long words
    println(results)

    //find_Common_Sequences("this is an input", "this is an output")
    "this is a simple test".grouped(1).foreach(println)

  }


  def get_All_SubStrings(input: String): Set[String] = {
    input.inits.flatMap(_.tails).toSet.filter(v => v != "")
  }

  def find_Longest_Sequence(input1: String, input2: String): String = {
    val subStrings1 = get_All_SubStrings(input1)
    val subStrings2 = get_All_SubStrings(input2)

    subStrings1.intersect(subStrings2).maxBy(_.length)
  }

  def find_Common_Sequences(input1: String, input2: String): Unit = {
    val length_Diff = math.abs(input1.length-input2.length)

    val subStrings1 = get_All_SubStrings(input1)
    val subStrings2 = get_All_SubStrings(input2)

    val common_Letters = subStrings1.intersect(subStrings2)
    val missing_Letters1 = input1.diff(common_Letters.mkString)
    val missing_Letters2 = input2.diff(common_Letters.mkString)
    println("The set of matching characters between \"" + input1 + "\" and \"" + input2 + "\" are \"" + common_Letters + "\". The characters that are " +
      "not shared are: \"" + missing_Letters1 + "\" for \"" + input1 + "\" and \"" + missing_Letters2 + "\" for \"" + input2 + "\"")
    println("resulting in a letter swap of " + (missing_Letters1.length + missing_Letters2.length) + " and adding " +
     length_Diff + " letters.")
  }

}
