fun main(args: Array<String>) {
    val (a, b) = readLine()!!.split(" ").map { it.toInt() }
    println(smallLargeEqual(a, b))
}

fun smallLargeEqual(a: Int, b: Int): String {
    return when {
        a < b -> {
            "a < b"
        }
        a > b -> {
            "a > b"
        }
        else -> {
            "a == b"
        }
    }
}

fun watch(second: Int): String {
    val h = second / 3600
    val m = (second % 3600) / 60
    val s = second % 60
    return "$h:$m:$s"
}

fun rectangle(length: Int, width: Int): String {
    return "${length * width} ${length * 2 + width * 2}"
}

fun xCubic(n: Int): Int {
    return n * n * n
}