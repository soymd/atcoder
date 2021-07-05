fun main(args: Array<String>) {
    val p = readLine()!!.split(" ").map { it.toLong() }
//    val (a, b) = readLine()!!.split(" ").map { it.toInt() }
    println(factorialYenCoin(p.first()))
}

fun factorialYenCoin(total: Long): Int {
    val one = 1// 1
    val two = 2// 1 * 2
    val three = 6// 1 * 2 * 3
    val four = 24// 1 * 2 * 3 * 4
    val five = 120// 1 * 2 * 3 * 4 * 5
    val six = 720// 1 * 2 * 3 * 4 * 5 * 6
    val seven = 5040// 1 * 2 * 3 * 4 * 5 * 6 * 7
    val eight = 40320// 1 * 2 * 3 * 4 * 5 * 6 * 7 * 8
    val nine = 362880// 1 * 2 * 3 * 4 * 5 * 6 * 7 * 8 * 9
    val ten = 3628800// 1 * 2 * 3 * 4 * 5 * 6 * 7 * 8 * 9 * 10

    var remain = total

    val tenCount = remain / ten
    remain -= ten * tenCount
    val nineCount = remain / nine
    remain -= nine * nineCount
    val eightCount = remain / eight
    remain -= eight * eightCount
    val sevenCount = remain / seven
    remain -= seven * sevenCount
    val sixCount = remain / six
    remain -= six * sixCount
    val fiveCount = remain / five
    remain -= five * fiveCount
    val fourCount = remain / four
    remain -= four * fourCount
    val threeCount = remain / three
    remain -= three * threeCount
    val twoCount = remain / two
    remain -= two * twoCount
    val oneCount = remain / one
    remain -= one * oneCount

    val l =
        tenCount + nineCount + eightCount + sevenCount + sixCount + fiveCount + fourCount + threeCount + twoCount + oneCount
    return l.toInt()
}

fun rollingDice(times: Int, answer: Int): String {
    if (answer.toFloat() / 6.0 > times) return "No"
    if (answer < times) return "No"
    return "Yes"
}

fun hydrate(initialBlue: Int, addBlue: Int, addRed: Int, ratio: Int): Int {
    var count = 0
    var blue: Long = initialBlue.toLong()//Int型だと桁あふれする
    var red: Long = 0

    if (addBlue >= addRed * ratio) return -1

    do {
        count += 1
        blue += addBlue
        red += addRed
    } while (blue > red * ratio)

    return count

//    val dif = addRed * ratio - addBlue //1回あたり縮まる差
//    if (dif < 1) return -1 //difが1より小さければ永遠に差が縮まらないので-1
//    return ceil(initialBlue.toDouble() / dif.toDouble()).toInt()
}
