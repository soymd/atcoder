import kotlin.math.pow

fun main() {
    seismicMagnitudeScales()
}

fun seismicMagnitudeScales() {
    val (a, b) = readLine()!!.split(" ").map { it.toDouble() }

    println(32.0.pow(a - b).toInt())
}
