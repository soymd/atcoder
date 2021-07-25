fun main() {
    val (s) = readLine()!!.split(" ").map { it.toString() }
//    val list = readLine()!!.split(" ").map { it.toLong() }
    println(chokudai(s))
}

fun chokudai(s: String): Int {
    if (
        !s.contains("c")
        || !s.contains("h")
        || !s.contains("o")
        || !s.contains("k")
        || !s.contains("u")
        || !s.contains("d")
        || !s.contains("a")
        || !s.contains("i")
    ) {
        return 0
    }
    var lastIndexContainsChokudai: Int
    var cPosition = s.indexOf("c")
    do {
        var bool: Boolean
        if (cPosition == -1) {
            bool = false
        } else {
            val subStr = s.substring(cPosition)
            bool = subStr.contains("h")
                && subStr.contains("o")
                && subStr.contains("k")
                && subStr.contains("u")
                && subStr.contains("d")
                && subStr.contains("a")
                && subStr.contains("i")
            if (bool) {
                lastIndexContainsChokudai = cPosition
                cPosition = s.indexOf("c", startIndex = lastIndexContainsChokudai + 1)
            }
        }
    } while (bool)

    var answer = 0

    return answer / 1000000007
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