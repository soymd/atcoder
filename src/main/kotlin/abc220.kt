fun main() {
    baseK()
}

fun baseK() {
    val k = readLine()!!.toInt()
    val (a, b) = readLine()!!.split(" ").map { it }

    val a2 = a.toInt(k)
    val b2 = b.toInt(k)
    println(a2 * b2)
}

fun findMultiple() {
    val (a, b, c) = readLine()!!.split(" ").map { it.toInt() }

    var ans = c
    var count = 1
    do {
        ans *= count
        count += 1
    } while (ans !in a..b && ans <= 1000)

    if (ans > 1000) {
        println(-1)
    } else {
        println(ans)
    }
}