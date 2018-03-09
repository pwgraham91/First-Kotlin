package level

class Down(id: Int) {
    var ID = id

    fun PrintDown() {
        println(this.ID)
    }
}

fun main(args: Array<String>) {
    val d = Down(10)
    d.PrintDown()
}