fun main(args: Array<String>) {
    loop1()

    whileLoop()

    doWhile()

    repeatLoop()
}

fun loop1() {
    val people: Array<String> = arrayOf("A", "B", "C")
    for (person: String in people) {
        println(person)
    }
}

fun whileLoop() {
    var cond = 0
    while (cond < 5) {
        println(cond)
        cond++
    }
}

fun doWhile() {
    // will do the do block at least once, then check the condition to see if it should keep doing it
    var cond = 0
    do {
        println(cond)
        cond++
    } while (false)
}

fun repeatLoop() {
    val cond = 0
    repeat(10) {
        println(cond)
    }
}