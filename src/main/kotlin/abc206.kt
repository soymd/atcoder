import kotlin.math.floor

fun main(args: Array<String>) {
    val n = readLine()!!.split(" ").map { it.toInt() }
    val list = readLine()!!.split(" ").map { it.toLong() }
    val answer = swappable(n.first(), list)

    println(answer)
}

fun swappable(n: Int, list: List<Long>): Int {
    var count = list.count() * (list.count() - 1) / 2
    val distinct = list.distinct()
    val foo = mutableMapOf(0 to 0)
    distinct.forEach { hoge ->
        val foo = list.count { it == hoge }
        val bar = foo * (foo - 1) / 2
        count -= bar
    }

    return count
}

fun savings(goal: Long): Int {
    var n = 0
    var day = 1
    do {
        n += day
        day += 1
    } while (n < goal)
    return day - 1
}

fun maxiBuying(yen: Int): String {
    val n = floor(yen.toFloat() * 1.08).toInt()
    return when {
        n > 206 -> {
            ":("
        }
        n == 206 -> {
            "so-so"
        }
        else -> {
            "Yay!"
        }
    }
}
