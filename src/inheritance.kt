package inheritance

open class Person constructor(name: String, age: Int) {
    var Name: String = ""
    var Age: Int = 0
    open var ID: Int = 0

    init {
        Name = name
        Age = age
    }

    constructor(name: String, age: Int, id: Int): this(name, age) {
        ID = id
    }

    open fun PrintPerson() {
        println("Name: ${this.Name}\n" +
                "Age: ${this.Age}\n" +
                "ID: ${this.ID}")
    }
}

class Student(name: String, age: Int, id: Int): Person(name, age) {
    override var ID: Int = 1
    init {
        ID = id
    }

    override fun PrintPerson() {
        super.PrintPerson()
        println("overridden")
    }
}

fun main(args: Array<String>) {
    var s1 = Student("Peter", 23, 23222)
    s1.PrintPerson()
}
// why is this inheriting from a different file
