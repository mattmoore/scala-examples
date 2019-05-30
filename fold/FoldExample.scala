object FoldExample {
  def main(args: Array[String]) {
    val people = Person("Matt", "Moore") :: Person("John", "Doe") :: Nil
    val formatted = people.foldLeft(List[String]()) { (acc, person) =>
      acc :+ (person.firstName + " " + person.lastName)
    }
    println(formatted.mkString(", "))
  }
}

class Person(val firstName: String, val lastName: String)

object Person {
  def apply(firstName: String, lastName: String) = new Person(firstName, lastName)
}
