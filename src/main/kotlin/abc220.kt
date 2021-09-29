fun main() {
    findMultiple()
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