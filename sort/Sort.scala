object Sort {
  def main(args: Array[String]) {
    val people = List(Person("Matt", 32), Person("John", 33))
    for (p <- people.sortWith(_.age > _.age)) {
      println(p.name)
    }

    val peopleMaps = List(Map("name" -> "Matt", "age" -> 32), Map("name" -> "John", "age" -> 33))
    for (p <- peopleMaps.sortWith(_("age").asInstanceOf[Int] > _("age").asInstanceOf[Int])) {
      println(p("name"))
    }
  }
}

class Person(val name: String, val age: Int)

object Person {
  def apply(name: String, age: Int) = new Person(name, age)
}
