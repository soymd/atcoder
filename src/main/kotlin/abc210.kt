fun main() {
    val (n, k) = readLine()!!.split(" ").map { it.toInt() }
    val list = readLine()!!.split(" ").map { it.toLong() }
    println(colorfulCandies(n, k, list))
}

fun colorfulCandies(colorCount: Int, candies: Int, colorVar: List<Long>): Int {
//    if (candies > colorCount || colorVar.count() != colorCount) throw Exception("invalid condition!")
    val max = colorVar.distinct().count()
    if (colorCount == candies) {
        return max
    }
    if (candies == 1) {
        return 1
    }

    val map = mutableMapOf<Long, Int>()
    val sublist = colorVar.subList(0, candies).toMutableList()
    sublist.map {
        map[it] = (map[it] ?: 0) + 1
    }

    var answer = map.count()
    for (i in 0 until colorCount - candies) {
        val first = colorVar[i]
        val last = colorVar[i + candies]

        map[first] = (map[first] ?: 0) - 1
        map[last] = (map[last] ?: 0) + 1

        if (map[first] ?: 0 <= 0) {
            map.remove(first)
        }

        val count = map.count()
        if (count > answer) {
            answer = count
        }

        if (answer == max) {
            return answer
        }
    }

    return answer
}

fun bouzuMekuri(quantity: Int, yamahuda: String): String {
    val position = yamahuda.indexOf("1")
    return if (position % 2 == 0) {
        "Takahashi"
    } else {
        "Aoki"
    }
}

fun cabbages(cabbages: Long, discountFrom: Long, originValue: Long, discountValue: Long): Long {
    val l = cabbages - discountFrom
    if (l < 0) {
        return cabbages * originValue
    }
    return l * discountValue + discountFrom * originValue
}
