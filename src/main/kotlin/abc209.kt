fun main(args: Array<String>) {
    val (n, k) = readLine()!!.split(" ").map { it.toInt() }
    val answer = counting(n, k)

    println(answer)
//    println(answer.joinToString(separator = System.lineSeparator()))
}

fun counting(a: Int, b: Int): Int {
    if (a == b) return 0
    if (a > b) return 0
    return b - a + 1
}