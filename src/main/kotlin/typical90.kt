import kotlin.math.*

fun main() {
    notTooBright033()
}

fun notTooBright033() {
    val (h, w) = readLine()!!.trim().split(" ").map { it.toInt() }
    val x = if (w % 2 == 0) {
        w / 2
    } else {
        w / 2 + 1
    }
    val y = if (h % 2 == 0) {
        h / 2
    } else {
        (h / 2) + 1
    }
    println(x * y)
}

fun atCoderEkiden032() {
    val n = readLine()!!.trim().toInt()
    val a = List(n) {
        readLine()!!.trim().split(" ").map { it.toInt() }
    }
    val m = readLine()!!.trim().toInt()
    val rumor = List(m) {
        readLine()!!.trim().split(" ").map { it.toInt() } - 1
    }

    if (rumor.count() >= n - 1) {
        println(-1)
        return
    }

    //todo: wip
    println()
}

fun signUpRequest() {
    val (n) = readLine()!!.trim().split(" ").map { it.toInt() }
    val s = mutableListOf<String>()
    repeat(n) {
        s.add(readLine()!!.trim())
    }

    val map = mutableMapOf<String, Int>()
    s.forEachIndexed { index, string ->
        if (map.contains(string)) {
            return@forEachIndexed
        }
        map[string] = index
    }

    map.forEach {
        println(it.value + 1)
    }
}

fun selectOne() {
    val (n, k) = readLine()!!.trim().split(" ").map { it.toInt() }
    val a = readLine()!!.trim().split(" ").map { it.toInt() }
    val b = readLine()!!.trim().split(" ").map { it.toInt() }

    var diff = 0
    a.forEachIndexed { index, i ->
        diff += (i - b[index]).absoluteValue
    }

    if (diff > k) {
        println("No")
        return
    } else if (diff == k) {
        println("Yes")
        return
    }

    if (diff % 2 == (k % 2)) {
        println("Yes")
    } else {
        println("No")
    }
}

fun cubicCake() {
    val (x, y, z) = readLine()!!.trim().split(" ").map { it.toLong() }
    val list = mutableListOf(mutableListOf(x, y, z))
    var count = 0

    do {
        var removeIndex = 0
        val cuts = mutableListOf<MutableList<Long>>()
        list.forEachIndexed { i, cube ->
            if (cube.isSquare()) {
                return@forEachIndexed
            }
            val index = cube.indexOf(cube.longest())
            val cut1 = cube.toMutableList()
            cut1[index] = cube.shortest()
            val cut2 = cube.toMutableList()
            cut2[index] = cube.longest() - cube.shortest()
            cuts.add(cut1)
            cuts.add(cut2)
            count++
            removeIndex = i
            return@forEachIndexed
        }
        list.removeAt(removeIndex)
        cuts.forEach {
            list.add(it)
        }
    } while (!list.all { it.isSquare() })


    println(count)
}

private fun List<Long>.isSquare(): Boolean {
    return all { it == first() }
}

private fun List<Long>.longest(): Long {
    return max() ?: first()
}

private fun List<Long>.shortest(): Long {
    return min() ?: first()
}

fun logInequality() {
    val (a, b, c) = readLine()!!.trim().split(" ").map { it.toLong() }

    val r = pow(b, c)
    if (a < r) {
        println("Yes")
    } else {
        println("No")
    }
}

private fun pow(b: Long, c: Long): Long {
    val base = b.toInt()
    val exponent = c
    var result: Long = 1

    repeat(base) {
        result *= exponent
    }
    return result
}

fun statueOfChokudai() {
    val t = readLine()!!.toInt()
    val (l, x, y) = readLine()!!.trim().split(" ").map { it.toInt() }
    val q = readLine()!!.toInt()
    val e = List(q) {
        readLine()!!.toInt()
    }

    e.forEach { question ->
        val xlPos = xlPos(l, t, question)
        val bottomAndHeight = bottomAndHeight(Pair(x, y), xlPos)
        val angle = angle(bottomAndHeight.first, bottomAndHeight.second)
        println(angle)
    }
}

private fun xlPos(l: Int, t: Int, e: Int): Pair<Double, Double> {
    val angle = (e.toDouble() / t.toDouble()) * 360.0
    val radius = l.toDouble() / 2.0
    return when {
        angle == 0.0 -> Pair(0.0, 0.0)
        angle < 90.0 -> sinAndCos(angle, radius)
        angle == 90.0 -> Pair(-radius, radius)
        angle < 180.0 -> sinAndCos(angle, radius)
        angle == 180.0 -> Pair(0.0, l.toDouble())
        angle < 270.0 -> sinAndCos(angle, radius)
        angle == 270.0 -> Pair(radius, radius)
        angle < 360.0 -> sinAndCos(angle, radius)
        else -> Pair(0.0, 0.0)
    }

}

private fun sinAndCos(angle: Double, radius: Double): Pair<Double, Double> {
    val validAngle = when {
        angle < 90.0 -> angle
        angle < 180.0 -> angle - 90
        angle < 270.0 -> 270 - angle
        else -> 360 - angle
    }
    val radian = Math.toRadians(validAngle)
    val cos = cos(radian) * radius
    val sin = sin(radian) * radius
    val pair = when {
        angle < 90.0 -> Pair(-sin, radius - cos)
        angle < 180.0 -> Pair(-cos, radius + sin)//
        angle < 270.0 -> Pair(cos, radius + sin)
        else -> Pair(sin, radius - cos)
    }
    return pair
}

private fun bottomAndHeight(
    chokudai: Pair<Int, Int>,
    xlPos: Pair<Double, Double>
): Pair<Double, Double> {
    val bottom = chokudai.first.toDouble() - xlPos.first
    val height = chokudai.second.toDouble().absoluteValue
    val foo = bottom * bottom + height * height
    return Pair(sqrt(foo), xlPos.second)
}

private fun angle(bottom: Double, height: Double): Double {
    if (height == 0.0) {
        return 0.0
    }
    val atan = atan(bottom / height)
    val degree = Math.toDegrees(atan)
    return 90.0 - degree
}

//全探索において無駄になっているところを見つける
fun minimumCoins() {
    val n = readLine()!!.toInt()
    val coins = readLine()!!.trim().split(" ").map { it.toInt() }.sortedDescending()

    val counts = IntArray(coins.size) {
        val i = n / coins[it]
        if (i > 9999) {
            9999
        } else {
            i
        }
    }
    var ans = Int.MAX_VALUE
    for (i in 0..counts[0]) {
        for (j in 0..counts[1]) {
            val coin0sum = coins[0] * i
            val coin1sum = coins[1] * j
            val rest = n - coin0sum - coin1sum
            if (rest >= 0 && rest % coins[2] == 0) {
                ans = minOf(ans, i + j + rest / coins[2])
            }
        }
    }
    println(ans)
}

// 貪欲法 適当な基準を用いて、局所的に最適なケースを連続して選択する
fun weUsedToSingASongTogether() {
    val n = readLine()!!.toInt()
    val a = readLine()!!.trim().split(" ").map { it.toLong() }.toMutableList()
    val b = readLine()!!.trim().split(" ").map { it.toLong() }.toMutableList()

    a.sort()
    b.sort()
    var ans = 0L

    a.forEachIndexed { index, i ->
        ans += (i - b[index]).absoluteValue
    }

    println(ans)
}

// 累積和
fun scoreSumQueries() {
    val n = readLine()!!.toInt()
    val class1 = IntArray(n + 1) { 0 }
    val class2 = IntArray(n + 1) { 0 }
    repeat(n) {
        val (c, p) = readLine()!!.trim().split(" ").map { it.toInt() }
        if (c == 1) {
            class1[it + 1] = class1[it] + p
            class2[it + 1] = class2[it]
        } else {
            class2[it + 1] = class2[it] + p
            class1[it + 1] = class1[it]
        }
    }
    val q = readLine()!!.toInt()
    val questions = List(q) {
        val (l, r) = readLine()!!.trim().split(" ").map { it.toInt() }
        l to r
    }

    questions.forEach { (l, r) ->
        val one = class1[r] - class1[l - 1]
        val two = class2[r] - class2[l - 1]
        println("$one $two")
    }
}

fun cpClasses() {
    val n = readLine()!!.toInt()
    val a = readLine()!!.trim().split(" ").map { it.toInt() }.toMutableList()
    val q = readLine()!!.toInt()
    val b = List(q) {
        readLine()!!.toInt()
    }
    a.sort()
    val ans = mutableListOf<Int>()
    b.forEach { student ->
        //二分木探索で近い値を求める https://note.com/kirimin_chan/n/n3b5c9a0d4290き
        val index = a.binarySearch(student)
        if (index >= 0) {
            ans.add(0)
        } else {
            val largeIndex = -index - 1
            val smallIndex = -index - 2
            val large = (a.getOrElse(largeIndex) { a[smallIndex] } - student).absoluteValue
            val small = (a.getOrElse(smallIndex) { a[largeIndex] } - student).absoluteValue
            if (large > small) {
                ans.add(small)
            } else {
                ans.add(large)
            }
        }
    }
    ans.forEach { println(it) }
}

fun crossSum() {
    val (h, w) = readLine()!!.trim().split(" ").map { it.toInt() }
    val a = List(h) {
        readLine()!!.trim().split(" ").map { it.toInt() }
    }

    val columnSum = MutableList(w) { 0 }
    val rowSum = mutableListOf<Int>()
    a.forEachIndexed { i, row ->
        var temp = 0
        row.forEachIndexed { j, num ->
            columnSum[j] += num
            temp += num
        }
        rowSum.add(temp)
    }

    a.forEachIndexed { i, row ->
        val answer = mutableListOf<Int>()
        row.forEachIndexed { j, column ->
            answer.add(rowSum[i] + columnSum[j] - column)
        }
        println(answer.joinToString(" "))
    }
}

fun encyclopediaOfParentheses() {
    // https://atcoder.jp/contests/typical90/tasks/typical90_b
    val n = readLine()!!.toInt()

    if (n % 2 == 1) return

    val init = mutableListOf<String>()
    repeat(n / 2) {
        init.add("(")
        init.add(")")
    }
    val cases = GFG().distinctPermutation(init)
    val ans = cases.filter { case ->
        isValid(case.toMutableList())
    }.map {
        it.joinToString("")
    }.sorted()
    ans.forEach {
        println(it)
    }
}

private fun isValid(list: MutableList<String>): Boolean {
    var openCount = 0
    var closeCount = 0
    list.forEach {
        if (it == "(") {
            ++openCount
        } else if (it == ")") {
            ++closeCount
        }
        if (openCount < closeCount) {
            return false
        }
    }
    return openCount == closeCount
}

fun yokanParty() {
    // https://atcoder.jp/contests/typical90/tasks/typical90_a
    val (n, l) = readLine()!!.trim().split(" ").map { it.toInt() }
    val k = readLine()!!.trim().toInt()
    val a = readLine()!!.trim().split(" ").map { it.toInt() }

    val ans = mutableListOf<Int>()
    val permutation = a.permutationWithoutRepetition(k)
    permutation.forEach { list ->
        var score = Int.MAX_VALUE
        val temp = list.toMutableList()
        temp.add(l)
        temp.forEachIndexed { index, i ->
            if (index == 0) {
                if (i < score) {
                    score = i
                }
            } else {
                val diff = i - temp[index - 1]
                if (diff < score) {
                    score = diff
                }
            }

        }
        ans.add(score)
    }
    println(ans.max())
}

/** 重複なしの順列 */
private fun <T> List<T>.permutationWithoutRepetition(k: Int): Sequence<List<T>> {
    require(k in 0..size) { "引数 k は 0 以上かつ $size 以下でなければなりません。k: $k" }

    return pcSequenceFactory<T> { options, i ->
        options.take(i) + options.drop(i + 1)
    }(this, k)
}

/** 重複なしの組み合わせ */
private fun <T> List<T>.combinationWithoutRepetition(k: Int): Sequence<List<T>> {
    require(k in 0..size) { "引数 k は 0 以上かつ $size 以下でなければなりません。k: $k" }

    return pcSequenceFactory<T> { options, i ->
        options.drop(i + 1)
    }(this, k)
}

/** 重複ありの順列 */
private fun <T> List<T>.permutationWithRepetition(k: Int): Sequence<List<T>> {
    require(k >= 0) { "引数 k は 0 以上でなければなりません。k: $k" }

    return pcSequenceFactory<T> { options, i ->
        options
    }(this, k)
}

/** 重複ありの組み合わせ */
private fun <T> List<T>.combinationWithRepetition(k: Int): Sequence<List<T>> {
    require(k >= 0) { "引数 k は 0 以上でなければなりません。k: $k" }

    return pcSequenceFactory<T> { options, i ->
        options.drop(i)
    }(this, k)
}

private fun <T> pcSequenceFactory(
    selecteds: List<T> = emptyList(),
    filter: (options: List<T>, i: Int) -> List<T>
): (options: List<T>, k: Int) -> Sequence<List<T>> =
    { options, k ->
        sequence {
            if (k == 0) {
                yield(selecteds)
                return@sequence
            }

            options.forEachIndexed { i, option ->
                pcSequenceFactory(selecteds + option, filter).let {
                    it(filter(options, i), k - 1)
                }.forEach {
                    yield(it)
                }
            }
        }
    }

private fun factorial(num: Int): Int {
    var factorial: Long = 1
    for (i in 1..num) {
        factorial *= i.toLong()
    }
    return factorial.toInt()
}

private class GFG {
    // https://www.geeksforgeeks.org/distinct-permutations-string-set-2/
    // Returns true if str[curr] does not matches with any of the
    // characters after str[start]
    private fun shouldSwap(str: MutableList<String>, start: Int, curr: Int): Boolean {
        for (i in start until curr) {
            if (str[i] == str[curr]) {
                return false
            }
        }
        return true
    }

    // Prints all distinct permutations in str[0..n-1]
    private val mutableList = mutableListOf<List<String>>()
    private fun findPermutations(str: MutableList<String>, index: Int, n: Int) {
        if (index >= n) {
            mutableList.add(str.toList())
            return
        }
        for (i in index until n) {

            // Proceed further for str[i] only if it
            // doesn't match with any of the characters
            // after str[index]
            val check = shouldSwap(str, index, i)
            if (check) {
                swap(str, index, i)
                findPermutations(str, index + 1, n)
                swap(str, index, i)
            }
        }
    }

    private fun swap(str: MutableList<String>, i: Int, j: Int) {
        val c = str[i]
        str[i] = str[j]
        str[j] = c
    }

    fun distinctPermutation(list: MutableList<String>): List<List<String>> {
        val n = list.size
        findPermutations(list, 0, n)
        return mutableList
    }
}