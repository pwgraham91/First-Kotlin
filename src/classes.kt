data class Person(val name: String) {
    var age: Int = 0
}

fun main(args: Array<String>) {
    val person1 = Person("John")
    val person2 = Person("John")

    person1.age = 10
    person2.age = 20
}
