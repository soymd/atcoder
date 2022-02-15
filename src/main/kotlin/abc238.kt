import kotlin.math.max
import kotlin.math.pow

fun main() {
    pizza()
}

fun pizza() {
    val n = readLine()!!.trim().toInt()
    val a = readLine()!!.trim().split(" ").map { it.toInt() }

    val cuts = mutableListOf<Int>()
    cuts.add(0)
    var index = 0

    a.forEach { i ->
        index += i
        if (index >= 360) {
            index -= 360
        }
        cuts.add(index)
    }
    cuts.add(360)
    cuts.sort()

    var ans = 0
    cuts.forEachIndexed { index, i ->
        if (index >= cuts.size - 1) {
            return@forEachIndexed
        }
        val diff = cuts[index + 1] - i
        ans = max(ans, diff)
    }
    println(ans)
}

fun exponentialOrQuadratic() {
    val n = readLine()!!.trim().toInt()

    val n1 = 2.0.pow(n)
    val n2 = n.toDouble().pow(2)
    if (n1 > n2) {
        println("Yes")
    } else {
        println("No")
    }
}