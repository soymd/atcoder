fun main() {
    youShouldOutputARCThoughThisIsABC()
}

fun youShouldOutputARCThoughThisIsABC() {
    val (r, c) = readLine()!!.trim().split(" ").map { it.toInt() }
    val a1 = readLine()!!.trim().split(" ").map { it.toInt() }
    val a2 = readLine()!!.trim().split(" ").map { it.toInt() }
    val a = listOf(a1, a2)

    println(a[r - 1][c - 1])
}