fun main() {
    val (n, m) = readLine()!!.split(" ").map { it.toInt() }
    val a = readLine()!!.split(" ").map { it.toLong() }
    val b = readLine()!!.split(" ").map { it.toLong() }
    println(minDifference(n, m, a, b))
}

fun minDifference(n: Int, m: Int, a: List<Long>, b: List<Long>): Long {
    val mutableList = a.toMutableList()
    mutableList.addAll(b)
    mutableList.sort()
    val list = mutableList.toSet().toList()
    var minDiff = Long.MAX_VALUE
    val count = list.count()
    if (count == 1) return 0
    list.forEachIndexed { index, l ->
        if (index != count - 1) {
            val diff = list[index + 1] - l
            if (diff < minDiff) {
                minDiff = diff
            }
        }
    }
    return minDiff
}

fun weakPassword(x: String): String {
    val x1 = x[0].toString().toInt()
    val x2 = x[1].toString().toInt()
    val x3 = x[2].toString().toInt()
    val x4 = x[3].toString().toInt()
    if (x1 == x2 && x2 == x3 && x3 == x4) {
        return "Weak"
    }
    if ((x1 + 1) % 10 == x2 &&
        (x2 + 1) % 10 == x3 &&
        (x3 + 1) % 10 == x4
    ) {
        return "Weak"
    }
    return "Strong"
}

fun alloy(a: Int, b: Int): String {
    return if (0 < a && b == 0) {
        "Gold"
    } else if (a == 0 && 0 < b) {
        "Silver"
    } else {
        "Alloy"
    }
}
