fun main() {
    val (n, k) = readLine()!!.split(" ").map { it.toInt() }
    val list = readLine()!!.split(" ").map { it.toLong() }
    val answer = colorfulCandies(n, k, list)

    println(answer)
}

fun colorfulCandies(colorCount: Int, candies: Int, colorVar: List<Long>): Int {
    if (candies > colorCount || colorVar.count() != colorCount) throw Exception("invalid condition!")

    var answer = 0
    val max = colorVar.distinct().count()
    for (i in 0..colorCount - candies) {
        //ここが重い
        val list = colorVar.subList(i, (i + candies)).toMutableList().distinct()
        val count = list.count()
        if (count > answer) {
            answer = count
        }
        if (count == max) {
            break
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
