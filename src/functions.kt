fun main(args: Array<String>) {
    kwargs("peter")
    kwargs("peter", 26)
    kwargs("peter", age=3)
    kwargs(name="peter", age=5)
    kwargs(age=6, name="peter")

    variableArgs("a", "b", "c")
}

fun kwargs(name: String, age: Int = 10) {
    println("name: ${name}. age: ${age}")
}

fun variableArgs(vararg names: String): Unit {
    for (name in names) {
        println("The name is ${name}")
    }

}
