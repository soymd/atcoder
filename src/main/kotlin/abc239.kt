import kotlin.math.sqrt

fun main() {
    horizon()
}

fun horizon() {
    val x = readLine()!!.trim().toDouble()
    println(sqrt((12800000 + x) * x))
}