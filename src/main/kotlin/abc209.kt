fun main(args: Array<String>) {
    val (n, k) = readLine()!!.split(" ").map { it.toInt() }
    val list = readLine()!!.split(" ").map { it.toInt() }
    val answer = canYouBuyThemAll(n, k, list)

    println(answer)
//    println(answer.joinToString(separator = System.lineSeparator()))
}

fun canYouBuyThemAll(count: Int, money: Int, product: List<Int>): String {
    var temp = 0
    product.forEachIndexed { index, i ->
        if ((index + 1) % 2 == 0) {
            temp += i - 1
        } else {
            temp += i
        }
    }
    return if ((money - temp) >= 0) {
        "Yes"
    } else {
        "No"
    }
}

fun counting(a: Int, b: Int): Int {
    if (a == b) return 0
    if (a > b) return 0
    return b - a + 1
}