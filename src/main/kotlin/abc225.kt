fun main() {
    calendarValidator()
}

fun calendarValidator() {
    val (n, m) = readLine()!!.trim().split(" ").map { it.toInt() }
    val b = List(n) {
        readLine()!!.trim().split(" ").map { it.toLong() }
    }

    println(calendarValidator(n, m, b))
}

fun calendarValidator(n: Int, m: Int, b: List<List<Long>>): String {
    b.forEachIndexed { index, list ->
        list.forEachIndexed inner@{ index1, i ->
            list.getOrNull(index1 + 1)?.let {
                if (i + 1 != it) {
                    return "No"
                }
            }
            list.getOrNull(index1 - 1)?.let {
                if (it % 7 == 0L) {
                    return "No"
                }
            }
            b.getOrNull(index + 1)?.let { nextList ->
                val l = nextList[index1]
                if (i + 7 != l) {
                    return "No"
                }
            }
        }
    }

    return "Yes"
}

fun ans(n: Int, m: Int, b: List<List<Long>>): String {
    //https://atcoder.jp/contests/abc225/submissions/26906979
    val base = b[0][0]
    if (m > 7 - (base - 1) % 7) {
        return "No"
    }

    for (i in 0 until n) {
        for (j in 0 until m) {
            val expected = base + 7 * i + j
            if (b[i][j] != expected) {
                return "No"
            }
        }
    }

    return "Yes"
}

fun starOrNot() {
    val n = readLine()!!.toInt()
    val graph = List(n - 1) {
        val (a, b) = readLine()!!.trim().split(" ").map { it.toInt() }
        a to b
    }.toMutableList()

    val first = graph.first().first
    val second = graph.first().second

    graph.removeAt(0)

    val bool1 = graph.all { it.first == first || it.second == first }
    val bool2 = graph.all { it.first == second || it.second == second }

    if (bool1 || bool2) {
        println("Yes")
    } else {
        println("No")
    }
}

fun distinctStrings() {
    val s = readLine()!!.trim().split("").filter { it != "" }.distinct()

    when (s.count()) {
        3 -> println("6")
        2 -> println("3")
        1 -> println("1")
    }
}