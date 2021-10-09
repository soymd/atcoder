fun main() {
    swissSystemTournament()
}

fun swissSystemTournament() {
    val (n, m) = readLine()!!.split(" ").map { it.toInt() }
    val hands = mutableListOf<List<String>>()
    repeat(n * 2) {
        hands.add(readLine()!!.split("").filter { it != "" })
    }
    val map = mutableMapOf<Int, Int>()
    for (i in 0 until 2 * n) {
        map[i] = 0
    }
    var rank = map.toList().sortedBy { it.second }.toMutableList()

    for (round in 0 until m) {
        rank.forEachIndexed { index, pair ->
            if (index % 2 == 1) {
                return@forEachIndexed
            }
            val a = rank[index].first
            val b = rank[index + 1].first
            val aHand = hands.getOrNull(a)?.getOrNull(round)
            val bHand = hands.getOrNull(b)?.getOrNull(round)
            if (aHand == null) {
                return@forEachIndexed
            }
            if (bHand == null) {
                return@forEachIndexed
            }
            val result = gcp(aHand, bHand)
            if (result == 1) {
                val now = map[a]!!
                map[a] = now + 1
            } else if (result == -1) {
                val now = map[b]!!
                map[b] = now + 1
            }
        }
        rank = map.toList().sortedByDescending { it.second }.toMutableList()
    }

    rank.forEach {
        println(it.first + 1)
    }
}

private fun gcp(a: String, b: String): Int {
    if (a == b) {
        return 0
    }
    if (a == "G") {
        return if (b == "C") {
            1
        } else {
            -1
        }
    }
    if (a == "C") {
        return if (b == "P") {
            1
        } else {
            -1
        }
    }
    if (a == "P") {
        return if (b == "G") {
            1
        } else {
            -1
        }
    }
    return 0
}

fun failingGrade() {
    val (n, p) = readLine()!!.split(" ").map { it.toInt() }
    val a = readLine()!!.split(" ").map { it.toInt() }

    val count = a.filter { it < p }.count()
    println(count)
}

fun fourDigits() {
    val n = readLine()!!.toInt()
    when {
        n > 1000 -> {
            println(n)
        }
        n > 100 -> {
            print(0)
            println(n)
        }
        n > 10 -> {
            print(0)
            print(0)
            println(n)
        }
        else -> {
            print(0)
            print(0)
            print(0)
            println(n)
        }
    }
}
