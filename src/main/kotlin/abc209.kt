@file:Suppress("LocalVariableName", "UnnecessaryVariable")

fun main(args: Array<String>) {
    val (n) = readLine()!!.split(" ").map { it.toInt() }
    val list = readLine()!!.split(" ").map { it.toLong() }
    val answer = notEqual(n, list)

    println(answer)
//    println(answer.joinToString(separator = System.lineSeparator()))
}

//10720中5267
fun notEqual(n: Int, c: List<Long>): Long {
    if (n != c.count()) throw Exception("invalid test condition!")
    /*
    1 ≤ Ai ≤ Ci (1 ≤ i ≤ N)
    Ai ≠ Aj     (1 ≤ i < j ≤ N)
    cの中の最大値 = n c.count = r
    総数 = nPr
    */
    var answer = 1L
    c.sorted().forEachIndexed { index, l ->
        val max = l - index//max(0, l - index)
        answer = answer * max % 1000000007
    }
    return answer
//    val max = c.maxBy { it }!!
//    val totalPermutation = permutation(max, n)
//
//    var diffPattern = 0L
//    c.forEachIndexed { index, i ->
//        val maxMinusI = max - i
//        val minusPerDiff = factorial(maxMinusI)
//        val diff = maxMinusI * minusPerDiff
//        diffPattern += diff
//    }
//    val answer = totalPermutation - diffPattern
//    return answer
}

fun permutation(n: Long, r: Int): Long {
    var answer = 1L
    val l = n - r + 1
    for (i in l..n) {
        answer *= i
    }
    return answer
}

fun factorial(n: Long): Long {
    var answer = 1L
    for (i in 1..n) {
        answer *= i
    }
    return answer
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