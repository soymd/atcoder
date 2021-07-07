fun main(args: Array<String>) {
    val (n, k) = readLine()!!.split(" ").map { it.toLong() }
    val list = readLine()!!.split(" ").map { it.toInt() }
    val answer = fairCandyDistribution(n, k, list)

    println(answer.joinToString(separator = System.lineSeparator()))
}

fun fairCandyDistribution(popularity: Long, candyTotal: Long, numbers: List<Int>): List<Long> {
    val baseCandy = candyTotal / popularity
    val people = mutableMapOf<Int, Long>()
    numbers.forEach {
        people[it] = baseCandy
    }
    val restCandy = candyTotal % popularity
    val whoCanGetAdditionalCandy = numbers.sortedBy { it }.take(restCandy.toInt())
    whoCanGetAdditionalCandy.forEach {
        val candy = people[it]
        if (candy != null) {
            people[it] = candy + 1L
        }
    }
    return people.map { it.value }
}

fun factorialYenCoin(total: Int): Int {
    var p = total
    var answer = 0

    for (i in 1..10) {
        val divisor = factorialLoop(i + 1)
        val residue = p % divisor

        answer += residue / factorialLoop(i)
        p -= residue
    }

    return answer
//    val one = 1// 1
//    val two = 2// 1 * 2
//    val three = 6// 1 * 2 * 3
//    val four = 24// 1 * 2 * 3 * 4
//    val five = 120// 1 * 2 * 3 * 4 * 5
//    val six = 720// 1 * 2 * 3 * 4 * 5 * 6
//    val seven = 5040// 1 * 2 * 3 * 4 * 5 * 6 * 7
//    val eight = 40320// 1 * 2 * 3 * 4 * 5 * 6 * 7 * 8
//    val nine = 362880// 1 * 2 * 3 * 4 * 5 * 6 * 7 * 8 * 9
//    val ten = 3628800// 1 * 2 * 3 * 4 * 5 * 6 * 7 * 8 * 9 * 10
//
//    var remain = total
//
//    val tenCount = remain / ten
//    remain -= ten * tenCount
//    val nineCount = remain / nine
//    remain -= nine * nineCount
//    val eightCount = remain / eight
//    remain -= eight * eightCount
//    val sevenCount = remain / seven
//    remain -= seven * sevenCount
//    val sixCount = remain / six
//    remain -= six * sixCount
//    val fiveCount = remain / five
//    remain -= five * fiveCount
//    val fourCount = remain / four
//    remain -= four * fourCount
//    val threeCount = remain / three
//    remain -= three * threeCount
//    val twoCount = remain / two
//    remain -= two * twoCount
//    val oneCount = remain / one
//    remain -= one * oneCount
//
//    val l =
//        tenCount + nineCount + eightCount + sevenCount + sixCount + fiveCount + fourCount + threeCount + twoCount + oneCount
//    return l.toInt()
}

private fun factorialLoop(n: Int): Int {
    var acc = 1
    for (number in 1..n) {
        acc *= number
    }
    return acc
}

fun rollingDice(times: Int, answer: Int): String {
    if (answer.toFloat() / 6.0 > times) return "No"
    if (answer < times) return "No"
    return "Yes"
}
