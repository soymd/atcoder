import kotlin.math.sqrt

fun main() {
    integerDivision()
}

fun integerDivision() {
    val x = readLine()!!.trim().toLong()

    val i = if (x % 10 == 0L) {
        0
    } else {
        1
    }

    if (x < -9) {
        println((x / 10) - i)
    } else if (x < 0) {
        println((x / 10) - i)
    } else if (x == 0L) {
        println("0")
    } else {
        println((x / 10))
    }
}

fun horizon() {
    val x = readLine()!!.trim().toDouble()
    println(sqrt((12800000 + x) * x))
}