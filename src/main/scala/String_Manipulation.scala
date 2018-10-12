object String_Manipulation {
  def main(args: Array[String]): Unit = {

    val results = findLongestSequence("Sesquipedalian", "Hippopotomonstrosesquipedaliophobic")
    //input1 = love of long words, input2 = fear of long words
    println(results)

    //findCommonSequences("this is an input", "this is an output")
    "this is a simple test".grouped(1).foreach(println)

  }


  def getAllSubStrings(input: String): Set[String] = {
    input.inits.flatMap(_.tails).toSet.filter(v => v != "")
  }

  def findLongestSequence(input1: String, input2: String): String = {
    val subStrings1 = getAllSubStrings(input1)
    val subStrings2 = getAllSubStrings(input2)

    subStrings1.intersect(subStrings2).maxBy(_.length)
  }

  def findCommonSequences(input1: String, input2: String): Unit = {
    val lengthDiff = math.abs(input1.length-input2.length)

    val subStrings1 = getAllSubStrings(input1)
    val subStrings2 = getAllSubStrings(input2)

    val commonLetters = subStrings1.intersect(subStrings2)
    val missingLetters1 = input1.diff(commonLetters.mkString)
    val missingLetters2 = input2.diff(commonLetters.mkString)
    println("The set of matching characters between \"" + input1 + "\" and \"" + input2 + "\" are \"" + commonLetters + "\". The characters that are " +
      "not shared are: \"" + missingLetters1 + "\" for \"" + input1 + "\" and \"" + missingLetters2 + "\" for \"" + input2 + "\"")
    println("resulting in a letter swap of " + (missingLetters1.length + missingLetters2.length) + " and adding " +
     lengthDiff + " letters.")
  }

}
