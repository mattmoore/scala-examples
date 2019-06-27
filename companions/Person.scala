class Person(val name: String, private val superheroName: String)

object Person {
  def showMeInnerSecret(x: Person) = x.superheroName
}

val clark = new Person("Clark Kent", "Superman")
val peter = new Person("Peter Parker", "Spider-Man")

println(Person.showMeInnerSecret(clark))
println(Person.showMeInnerSecret(peter))
