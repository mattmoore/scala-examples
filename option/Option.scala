object Option {
  def main(args: Array[String]) {
    val ages = Map("Matt" -> 32)
    val result = ages.get("Matt")
    println(result)
    val result2 = ages.get("Bob")
    println(result2)
  }
}
