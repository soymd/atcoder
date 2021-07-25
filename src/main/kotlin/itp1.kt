fun main(args: Array<String>) {
    val (n) = readLine()!!.split(" ").map { it.toInt() }
    println(xCubic(n))
}

fun xCubic(n: Int): Int {
    return n * n * n
}