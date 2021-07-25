fun main(args: Array<String>) {
    val (a, b) = readLine()!!.split(" ").map { it.toInt() }
    println(rectangle(a, b))
}

fun rectangle(length: Int, width: Int): String {
    return "${length * width} ${length * 2 + width * 2}"
}

fun xCubic(n: Int): Int {
    return n * n * n
}