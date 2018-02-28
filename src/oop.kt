fun main(args: Array<String>) {
    oop()
}

class Student constructor(firstName: String, lastName: String, age: Byte, var EnrollNo: Long = 0) {
    var FirstName: String = firstName
    var LastName: String = lastName
    var Age: Byte = 0
    var Address: String = ""

    init {
        println("init called")
        // otherAge will not be set on the model
        val otherAge = age
        Age = otherAge
    }
}


fun oop() {
    var student1 = Student("Peter", "Graham", 46, 5465)
    println(student1.FirstName)
    println(student1.LastName)
    println(student1.Age)

    student1.Address = "34 this address"
    println(student1.Address)
    println(student1.EnrollNo)
}