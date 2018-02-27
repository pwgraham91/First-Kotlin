fun main(args: Array<String>) {
    println(simpleControl(1, 0))
    println(simpleControl(0, 1))
    println(simpleControl(1, 1))

    println(expressive(1, 0))
    println(expressive(0, 1))
    println(expressive(1, 1))

    println(switch(0))
    println(switch(1))
    println(switch(2))
    println(switch(3))
    println(switch(4))
    println(switch(5))
    println(switch(11))

    println(expressiveSwitch(0))
    println(expressiveSwitch(1))
    println(expressiveSwitch(11))
}

fun simpleControl(a: Int, b: Int): String {
    if (a > b) {
        return "a was bigger"
    } else if (a < b) {
        return "b was bigger"
    } else {
        return "same size"
    }
}

fun expressive(a: Int, b: Int): String {
    val answer = if (a > b) {
        "a was bigger"
    } else if (a < b) {
        "b was bigger"
    } else {
        "same size"
    }
    return answer
}

fun switch(a: Int): String {
    when (a) {
        0 -> return "a was 0"
        1 -> return "a was 1"
        in 2..5 -> return "a was between 2 and 5"
        else -> {
            return "something else"
        }
    }
}

fun expressiveSwitch(a: Int): String {
    return when (a) {
        0 -> "a was 0"
        1 -> "a was 1"
        else -> {
            "something else"
        }
    }
}