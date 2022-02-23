import kotlin.math.absoluteValue

fun main() {
    edgeChecker()
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