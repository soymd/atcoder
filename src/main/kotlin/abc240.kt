import kotlin.math.absoluteValue

fun main() {
    jumpingTakahashi()
}

fun toRoman(n: Int): String {
    return ""
}

fun jumpingTakahashi() {
    val (n, x) = readLine()!!.trim().split(" ").map { it.toInt() }
//    val list = List(n) {
//        readLine()!!.trim().split(" ").map { it.toInt() }
//    }

//    println()

    val list = n.toString().split("").filter { it != "" }
    val reversed = list.reversed()
    println(reversed.joinToString("").toInt())
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