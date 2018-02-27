fun main(args: Array<String>) {
    countUp()

    countDown()

    countStep()

    countUntil()
}

fun countUp() {
    val range: IntRange = 1..10

    for (item in range) {
        println(item)
    }
}

fun countDown() {
    val reverseRange: IntProgression = 1000 downTo 1

    for (item: Int in reverseRange) {
        println(item)
    }
}

fun countStep() {
    val stepProgression: IntProgression = 1..100 step 5
    for (item: Int in stepProgression) {
        println(item)
    }
}

fun countUntil() {
    for (item: Int in 1 until 30) {
        println(item)
    }
}