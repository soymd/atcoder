fun main() {
    tenYenStamp()
}

fun tenYenStamp() {
    val (x, y) = readLine()!!.trim().split(" ").map { it.toInt() }

    if (x >= y) {
        println(0)
    } else {
        val diff = y - x
        val i = if (diff % 10 > 0) 1 else 0
        println(((diff) / 10) + i)
    }
}