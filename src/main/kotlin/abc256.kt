import kotlin.math.pow

fun main() {
    twoN()
}

fun twoN() {
    val (n) = readLine()!!.trim().split(" ").map { it.toInt() }

    println(2.0.pow(n.toDouble()).toInt())
}