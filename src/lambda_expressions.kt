fun main(args: Array<String>) {
    lamb()
}

fun lamb() {
    val firstLambda: (Int, Int) -> Int = { a: Int, b: Int -> a + b }
    println(firstLambda(1, 2))
}