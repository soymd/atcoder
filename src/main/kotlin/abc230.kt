import kotlin.math.max
import kotlin.math.min

fun main() {
    xDrawing()
}

fun xDrawing() {
    val (n, a, b) = readLine()!!.trim().split(" ").map { it.toLong() }
    val (p, q, r, s) = readLine()!!.trim().split(" ").map { it.toLong() }

    val range1 = max(1 - a, 1 - b)..min(n - a, n - b)
    val range2 = max(1 - a, b - n)..min(n - a, b - 1)

    val black1 = range1.map { k ->
        a + k to b + k
    }

    val black2 = range2.map { k ->
        a + k to b - k
    }
    val ans = mutableListOf<String>()
    repeat((q - p).toInt() + 1) {

    }
    println()
}

fun tripleMetre() {
    val s = readLine()!!.trim().split("").filter { it != "" }.toMutableList()

    if (s == mutableListOf("x") || s == mutableListOf("x", "x") || s == mutableListOf("o")) {
        println("Yes")
        return
    }

    val firstIndex = s.indexOf("o")

    if (firstIndex > 2 || firstIndex == -1) {
        println("No")
        return
    }
    val sublist = s.subList(firstIndex, s.count())

    sublist.forEachIndexed { index, string ->
        if (index % 3 == 0) {
            if (string == "x") {
                println("No")
                return
            }
        } else {
            if (string == "o") {
                println("No")
                return
            }
        }
    }

    println("Yes")
}

fun atCoderQuiz3() {
    var n = readLine()!!.trim().toInt()

    if (n >= 42) {
        n += 1
    }

    if (10 > n) {
        println("AGC00$n")
    } else {
        println("AGC0$n")
    }
}