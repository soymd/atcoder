fun main() {
    climbingTakahashi()
}

fun climbingTakahashi() {
    val n = readLine()!!.trim().toInt()
    val h = readLine()!!.trim().split(" ").map { it.toInt() }

    var index = 0

    do {
        val a = h[index]
        val b = h[index + 1]
        if (a >= b) {
            println(a)
            return
        }

        index++
    } while (index < h.size - 1)

    println(h[index])
}

fun rotate() {
    val (a, b, c) = readLine()!!.trim().split("").filter { it != "" }

    println((a + b + c).toInt() + (b + c + a).toInt() + (c + a + b).toInt())
}