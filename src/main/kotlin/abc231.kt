fun main() {
    waterPressure()
}

fun waterPressure() {
    val (d) = readLine()!!.trim().split(" ").map { it.toDouble() }

    println(d / 100)
}