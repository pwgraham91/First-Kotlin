fun main(args: Array<String>) {
    // Number
    val byt: Byte = 1 // size: 8 bits 1..255
    val short: Short = 20 // size: 16 bits
    val int: Int = 100 // size: 32 bits
    val long: Long = 2000000 // size 64 bits

    val float: Float = 3.4f  // 32 bits
    val double: Double = 3.4 // 64 bits

    val character: Char = 'e' // 8 or 16 bits depending on ASCII
    val name: String = "peter"

    val true_val: Boolean = true
    val items: Array<Int> = arrayOf(1, 2, 3, 4)

    val otherItems: Array<Int> = Array(10, {i -> i*2})

    val item: Int = items.get(2)
    items.set(1, 40)  // replaces items in place
    items[0] = 50
}