import kotlin.math.absoluteValue

fun main() {
    countDistinctIntegers()
}

fun countDistinctIntegers() {
    val n = readLine()!!.toInt()
    val a = readLine()!!.trim().split(" ").map { it.toInt() }

    println(a.distinct().count())
}

fun edgeChecker() {
    val (a, b) = readLine()!!.trim().split(" ").map { it.toInt() }

    val absoluteValue = (a - b).absoluteValue
    if (absoluteValue == 1 || absoluteValue == 9) {
        println("Yes")
    } else {
        println("No")
    }
}