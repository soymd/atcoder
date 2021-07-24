fun main() {
    val (a, b) = readLine()!!.split(" ").map { it.toInt() }
//    val list = readLine()!!.split(" ").map { it.toLong() }
    println(bloodPressure(a, b))
}

fun bloodPressure(high: Int, low: Int): Float {
    return (high.toFloat() - low.toFloat()) / 3 + low.toFloat()
}