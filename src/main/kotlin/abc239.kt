import kotlin.math.sqrt

fun main() {
    digitnum()
}

fun digitnum() {
    val n = readLine()!!.trim().toLong()

    // ( x 以下の正整数で、 x と桁数が同じものの数) とします。

    val temp = ((n / 10)) * 45

    val quotient = n % 10

    val foo = (quotient + 1) * (quotient + 2) / 2

    val ans = temp + foo
    println(ans % 998244353)
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