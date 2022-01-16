fun main() {
    rotate()
}

fun rotate() {
    val (a, b, c) = readLine()!!.trim().split("").filter { it != "" }

    println((a + b + c).toInt() + (b + c + a).toInt() + (c + a + b).toInt())
}