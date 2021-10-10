fun main() {
    swissSystemTournament()
}

fun swissSystemTournament() {
    //参考 https://atcoder.jp/contests/abc222/submissions/26446912
    val (n, m) = readLine()!!.trim().split(' ').map(String::toInt)
    val predicate = List(2 * n) {
        readLine()!!.trim().map {
            when (it) {
                'G' -> 0
                'C' -> 1
                'P' -> 2
                else -> TODO()
            }
        }
    }
    val winCount = IntArray(2 * n)
    val order = predicate.indices.toMutableList()

    repeat(m) { round ->
        for (i in 0 until 2 * n step 2) {
            val left = order[i]
            val right = order[i + 1]
            when (((predicate[left][round] - predicate[right][round]) + 3) % 3) {
                1 -> winCount[right] += 1
                2 -> winCount[left] += 1
            }
        }
        order.sortWith(compareBy(winCount::get).reversed().thenBy { it })
    }
    order.forEach { println(it + 1) }
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
