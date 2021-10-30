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
//    if (n == 1) {
//        val list = b.first()
//        list.forEachIndexed inner@{ index1, i ->
//            val tmp = list.getOrElse(index1 + 1) { return@inner }
//            if (i + 1 != tmp) {
//                return "No"
//            }
//        }
//    }
//
//    if (m == 1) {
//        b.forEachIndexed { index, list ->
//            val nextList = b.getOrElse(index + 1) { return@forEachIndexed }
//            if (list.first() + 7 != nextList.first()) {
//                return "No"
//            }
//        }
//    }

    b.forEachIndexed { index, list ->
        val nextList = b.getOrElse(index + 1) {
            list.forEachIndexed inner@{ index1, i ->
                val tmp = list.getOrElse(index1 + 1) {
                    return@inner
                }
                if (i + 1 != tmp) {
                    return "No"
                }
            }
            return@forEachIndexed
        }
        list.forEachIndexed inner@{ index1, i ->
            val l = nextList[index1]
            if (i + 7 != l) {
                return "No"
            }
            val tmp = list.getOrElse(index1 + 1) {
                return@inner
            }
            if (i + 1 != tmp) {
                return "No"
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