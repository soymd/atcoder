fun main() {
    val (s1) = readLine()!!.split(" ").map { it.toString() }
    val (s2) = readLine()!!.split(" ").map { it.toString() }
    val (s3) = readLine()!!.split(" ").map { it.toString() }
    val (s4) = readLine()!!.split(" ").map { it.toString() }
//    val list = readLine()!!.split(" ").map { it.toLong() }
    println(cycleHit(s1, s2, s3, s4))
}

fun cycleHit(s1: String, s2: String, s3: String, s4: String): String {
    val list = listOf(s1, s2, s3, s4)
    return if (list.contains("H") && list.contains("2B") && list.contains("3B") && list.contains("HR")) {
        "Yes"
    } else {
        "No"
    }
}

fun bloodPressure(high: Int, low: Int): Float {
    return (high.toFloat() - low.toFloat()) / 3 + low.toFloat()
}