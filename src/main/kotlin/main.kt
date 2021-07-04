import kotlin.math.ceil

fun main(args: Array<String>) {
    val (a, b, c, d) = readLine()!!.split(" ").map { it.toInt() }
    println(hydrate(a, b, c, d))
}

fun hydrate(initialBlue: Int, addBlue: Int, addRed: Int, ratio: Int): Int {
    val dif = addRed * ratio - addBlue //1回あたり縮まる差
    if (dif < 1) return -1 //difが1より小さければ永遠に差が縮まらないので-1
    return ceil(initialBlue.toDouble() / dif.toDouble()).toInt()
}
