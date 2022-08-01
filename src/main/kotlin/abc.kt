import java.util.*

fun main() {
    arc133a()
}

fun arc133a() {
    val n = readLine()!!.trim().toLong()
    val a = readLine()!!.trim().split(" ").map { it.toInt() }

    val set = a.toSet()

    var ans = listOf(Int.MAX_VALUE)
    set.forEach { i ->
        val list = a.toMutableList()
        val count = list.count { it == i }
        val remove = mutableListOf<Int>()
        repeat(count) {
            remove.add(i)
        }
        list.removeAll(remove)

        if (list.isEmpty()) {
            println()
            return
        }
        val temp1 = ans.joinToString("") { it.toString() }.toInt()
        val temp2 = list.joinToString("") { it.toString() }.toInt()
        if (temp2 < temp1) {
            ans = list
        }
    }
    println(ans.joinToString(" "))
}

fun abc195c() {
    val n = readLine()!!.trim().toLong()
    val length = n.toString().length
    val ans: Long = when {
        length < 4 -> {
            0L
        }
        length < 7 -> {
            n - 999L
        }
        length < 10 -> {
            val temp = (n - 999_999) * 2
            999_000 + temp
        }
        length < 13 -> {
            val temp = (n - 999_999_999) * 3
            1_998_999_000L + temp
        }
        length < 16 -> {
            val l = n - 999_999_999_999
            val temp = l * 4
            2998998999000L + temp
        }
        else -> {
            val l = n - 999_999_999_999_999
            val temp = l * 5
            3998998998999000L + temp
        }
    }

    println(ans)
}

fun abc166c() {
    val (n, m) = readLine()!!.trim().split(" ").map { it.toInt() }
    var count = 0
    val set = mutableSetOf<Int>()
    val heights = readLine()!!.trim().split(" ").map {
        set.add(count)
        count++
        it.toInt()
    }
    val roads = List(m) {
        val temp = readLine()!!.trim().split(" ").map { it.toInt() }
        Pair(temp.first(), temp.last())
    }

    roads.forEach { pair ->
        val peakA = pair.first - 1
        val peakB = pair.second - 1
        val heightA = heights[peakA]
        val heightB = heights[peakB]
        if (heightA > heightB) {
            set.remove(peakB)
        } else if (heightA < heightB) {
            set.remove(peakA)
        } else if (heightA == heightB) {
            set.remove(peakB)
            set.remove(peakA)
        }
    }

    println(set.count())
}

fun agc037a() {
    val s = readLine()!!.trim().split("").filter { it != "" }.toMutableList()

    var index = 0
    val ans = mutableListOf<String>(s.first())

    s.forEachIndexed loop@{ i, char ->
        if (i == s.size || i < index) {
            return@loop
        }

        val subList = s.subList(i + 1, s.size).toMutableList()
        val prevStr = ans.last()
        var candidate = ""
        var tempCount = 1
        for (substr in subList) {
            candidate += substr
            if (prevStr != candidate) {
                ans.add(candidate)
                index += tempCount
                break
            }
            tempCount++
        }
    }

    println(ans.count())
}

fun abc049a() {
    val s = readLine()!!.trim().split("").filter { it != "" }.toMutableList()
    val positions = readLine()!!.trim().split(" ").map { it.toInt() }

    positions.reversed().forEach {
        s.add(it, "\"")
    }
    println(s.joinToString(""))
}

fun abc10b() {
    val n = readLine()!!.trim().toInt()
    val flowers = readLine()!!.trim().split(" ").map { it.toInt() }

    var ans = 0
    flowers.forEach { i ->
        val pattern1 = i % 2
        val pattern2 = i % 3
        val pattern1succeeded = pattern1 == 1
        val pattern2succeeded = pattern2 != 2
        if (!pattern1succeeded || !pattern2succeeded) {
            for (j in i downTo 1) {
                if (j % 2 == 1 && j % 3 != 2) {
                    ans += i - j
                    break
                }
            }
        }
    }
    println(ans)
}

fun cf2014b() {
    val s = readLine()!!.trim().split("").filter { it != "" }.map { it.toInt() }

    var ans = 0
    s.forEachIndexed { index, i ->
        if (index % 2 == 0) {
            ans += i
        } else {
            ans -= i
        }
    }
    println(ans)
}

fun abc260b() {
    val (n, x, y, z) = readLine()!!.trim().split(" ").map { it.toInt() }
    val math = readLine()!!.trim().split(" ").map { it.toInt() }
    val eng = readLine()!!.trim().split(" ").map { it.toInt() }

    val candidates = mutableMapOf<Int, Pair<Int, Int>>()
    repeat(n) {
        candidates[it] = Pair(math[it], eng[it])
    }

    val ans = mutableListOf<Int>()
    repeat(x) {
        val max = candidates.maxBy { it.value.first }!!
        ans.add(max.key)
        candidates.remove(max.key)
    }

    repeat(y) {
        val max = candidates.maxBy { it.value.second }!!
        ans.add(max.key)
        candidates.remove(max.key)
    }

    repeat(z) {
        val max = candidates.maxBy { it.value.first + it.value.second }!!
        ans.add(max.key)
        candidates.remove(max.key)
    }

    ans.sorted().forEach {
        println(it + 1)
    }
}

fun abc260a() {
    val (s1, s2, s3) = readLine()!!.trim().split("").filter { it != "" }

    if (!listOf(s2, s3).contains(s1)) {
        println(s1)
    } else if (!listOf(s1, s3).contains(s2)) {
        println(s2)
    } else if (!listOf(s2, s1).contains(s3)) {
        println(s3)
    } else {
        println(-1)
    }
}

fun abc261b() {
    val n = readLine()!!.toInt()
    val table = List(n) {
        readLine()!!.trim().split("").filter { it != "" }
    }

    for (y in 0 until n) {
        for (x in 0 until n) {
            if (x == y) continue
            val p1 = table[x][y]
            val p2 = table[y][x]
            if (p1 == "W" && p2 == "L") continue
            if (p1 == "L" && p2 == "W") continue
            if (p1 == "D" && p2 == "D") continue
            println("incorrect")
            return
        }
    }
    println("correct")
}

fun abc261a() {
    val (l1, r1, l2, r2) = readLine()!!.trim().split(" ").map { it.toInt() }
    val min = minOf(r1, r2)
    val max = maxOf(l1, l2)
    val temp = min - max
    val ans = maxOf(0, temp)
    println(ans)
}

fun abc261c() {
    val n = readLine()!!.toInt()
    val s = List(n) {
        readLine()!!.trim()
    }

    val map = mutableMapOf<String, Int>()
    s.forEach { str ->
        if (map.containsKey(str)) {
            val count = map[str]!! + 1
            map[str] = count
            println("$str($count)")
        } else {
            map[str] = 0
            println(str)
        }
    }
}

fun abc251c() {
    val n = readLine()!!.toInt()
    val submits = List(n) {
        val (poem, score) = readLine()!!.trim().split(" ")
        Pair(poem, score.toInt())
    }

    val set = mutableSetOf<String>()
    var max = 0
    var ans = 0
    submits.forEachIndexed { index, pair ->
        val poem = pair.first
        if (!set.contains(poem)) {
            set.add(poem)
            val score = pair.second
            if (score > max) {
                max = score
                ans = index
            }
        }
    }
    println(ans + 1)
}

fun abc240b() {
    val n = readLine()!!.toInt()
    val a = readLine()!!.trim().split(" ").map { it.toInt() }

    println(a.toSet().count())
}

fun abc240a() {
    val (a, b) = readLine()!!.trim().split(" ").map { it.toInt() }

    if (a - b == 1 || b - a == 1 || (a == 1 && b == 10) || (a == 10 && b == 1)) {
        println("Yes")
    } else {
        println("No")
    }
}

fun abc241b() {
    val (n, m) = readLine()!!.trim().split(" ").map { it.toInt() }
    val pastas = readLine()!!.trim().split(" ").map { it.toInt() }.toMutableList()
    val plans = readLine()!!.trim().split(" ").map { it.toInt() }

    plans.forEach { plan ->
        if (pastas.contains(plan)) {
            pastas.remove(plan)
        } else {
            println("No")
            return
        }
    }
    println("Yes")
}

fun abc241a() {
    val a = readLine()!!.trim().split(" ").map { it.toInt() }

    var ans = 0
    repeat(3) {
        ans = a[ans]
    }
    println(ans)
}

fun abc242b() {
    val s = readLine()!!
    println(s.toCharArray().sorted().joinToString(""))
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

fun abc242a() {
    val (a, b, c, x) = readLine()!!.trim().split(" ").map { it.toDouble() }

    if (x <= a) {
        println(1)
        return
    }
    if (x > b) {
        println(0)
        return
    }

    println(c / (b - a))
}

fun abc243b() {
    val n = readLine()!!.toInt()
    val a = readLine()!!.trim().split(" ").map { it.toInt() }
    val b = readLine()!!.trim().split(" ").map { it.toInt() }

    var ans1 = 0
    var ans2 = 0
    a.forEachIndexed { index, i ->
        if (b[index] == i) {
            ans1++
        }
        if (b.contains(i)) {
            ans2++
        }
    }
    println(ans1)
    println(ans2 - ans1)
}

fun abc243a() {
    val (v, f, m, t) = readLine()!!.trim().split(" ").map { it.toInt() }

    val list = listOf(f, m, t)

    var rest = v
    do {
        list.forEachIndexed { index, i ->
            rest -= i
            if (rest < 0) {
                println(
                    when (index) {
                        0 -> "F"
                        1 -> "M"
                        else -> "T"
                    }
                )
                return
            }
        }
    } while (rest >= 0)
}

fun abc245b() {
    val n = readLine()!!.toInt()
    val a = readLine()!!.trim().split(" ").map { it.toInt() }.toSet()

    val list = (0..n).toList()

    list.forEach { i ->
        if (!a.contains(i)) {
            println(i)
            return
        }
    }
}

fun abc245a() {
    val (a, b, c, d) = readLine()!!.trim().split(" ").map { it.toInt() }

    val takahashi = Date(2022, 7, 17, a, b, 0)
    val aoki = Date(2022, 7, 17, c, d, 1)

    if (takahashi.before(aoki)) {
        println("Takahashi")
    } else {
        println("Aoki")
    }
}

fun abc246a() {
    val list = List(3) {
        readLine()!!.trim().split(" ").map { it.toInt() }
    }

    val maxX = list.maxBy { it.first() }!!.first()
    val minX = list.minBy { it.first() }!!.first()
    val maxY = list.maxBy { it.last() }!!.last()
    val minY = list.minBy { it.last() }!!.last()

    val mutableList = mutableListOf<List<Int>>()
    mutableList.add(listOf(maxX, maxY))
    mutableList.add(listOf(minX, maxY))
    mutableList.add(listOf(minX, minY))
    mutableList.add(listOf(maxX, minY))

    val ans = mutableList.filter { !list.contains(it) }

    println(ans.first().joinToString(" "))
}

fun abc247b() {
    val n = readLine()!!.toInt()
    val list = List(n) {
        readLine()!!.trim().split(" ").map { it }
    }

    list.forEachIndexed { index, name ->
        val mutableList = list.toMutableList()
        mutableList.removeAt(index)
        val names = mutableList.flatten()
        val isUnique = !names.contains(name.first()) || !names.contains(name.last())
        if (!isUnique) {
            println("No")
            return
        }
    }
    println("Yes")
}

fun abc247a() {
    val s = readLine()!!.trim().split("").map { it }.filter { it != "" }
    println("0" + s.dropLast(1).joinToString(""))
}

fun abc248b() {
    val (a, b, k) = readLine()!!.trim().split(" ").map { it.toLong() }

    if (a >= b) {
        println(0)
        return
    }
    var i = a
    var count = 0
    do {
        i *= k
        count++
    } while (i < b)
    println(count)
}

fun abc248a() {
    val s = readLine()!!
    println(('0'..'9').find { it !in s })
}

fun abc249b() {
    val s = readLine()!!.trim().split("").map { it }.filter { it != "" }

    val includesUppercase = s.any { it.toUpperCase() == it }
    val includesLowercase = s.any { it.toUpperCase() == it }
    val isUnique = s.toSet().count() == s.count()

    println(
        if (includesUppercase && includesLowercase && isUnique) {
            "Yes"
        } else {
            "No"
        }
    )
}

fun abc249a() {
    val list = readLine()!!.trim().split(" ").map { it.toInt() }

    val (a, b, c) = list.take(3)
    val (d, e, f) = list.drop(3)
    val x = list[6]

    val takahashiTime = calcDistance2(a, b, c, x)
    val aokiTime = calcDistance2(d, e, f, x)
    println(
        if (takahashiTime > aokiTime) {
            "Takahashi"
        } else if (aokiTime > takahashiTime) {
            "Aoki"
        } else {
            "Draw"
        }
    )
}

fun calcDistance(walkTime: Int, perSecond: Int, restTime: Int, totalTime: Int): Int {
    val cycleTime = walkTime + restTime
    val progressPerCycle = walkTime * perSecond
    val cycleCount = totalTime / cycleTime
    val reminderTime = totalTime % cycleTime
    val fractionProgress = if (reminderTime >= walkTime) {
        progressPerCycle
    } else {
        reminderTime * perSecond
    }

    return (cycleCount * progressPerCycle) + fractionProgress
}

fun calcDistance2(walkTime: Int, perSecond: Int, restTime: Int, totalTime: Int): Int {
    var total = 0
    for (i in 0 until totalTime) {
        // for (i in 1..totalTime) {
        if (i % (walkTime + restTime) < walkTime) {
            total += perSecond
        }
    }
    return total
}

fun abc250b() {
    val (n, a, b) = readLine()!!.trim().split(" ").map { it.toInt() }

    var row1 = ""
    var row2 = ""
    var count = 1
    for (i in 1..(n * b)) {
        if (count <= b) {
            row1 += "."
            row2 += "#"
        } else {
            row1 += "#"
            row2 += "."
        }
        if (b * 2 <= count) {
            count = 1
        } else {
            count++
        }
    }
    val ans = mutableListOf<String>()
    var count1 = 1
    for (i in 1..n * a) {
        if (count1 <= a) {
            ans.add(row1)
        } else {
            ans.add(row2)
        }
        if (a * 2 <= count1) {
            count1 = 1
        } else {
            count1++
        }
    }
    ans.forEach { println(it) }
}

fun abc250a() {
    val (h, w) = readLine()!!.trim().split(" ").map { it.toInt() }
    val (r, c) = readLine()!!.trim().split(" ").map { it.toInt() }
    if (h == 1 && w == 1) {
        println(0)
        return
    }
    val isSingleRow = h == 1 && w != 1
    if (isSingleRow) {
        val isEnd = c == 1 || c == w
        if (isEnd) {
            println(1)
        } else {
            println(2)
        }
        return
    }
    val isSingleColumn = h != 1 && w == 1
    if (isSingleColumn) {
        val isEnd = r == 1 || r == h
        if (isEnd) {
            println(1)
        } else {
            println(2)
        }
        return
    }
    val isCorner = (r == 1 && c == 1) || (r == 1 && c == w) || (r == h && c == 1) || (r == h && c == w)
    if (isCorner) {
        println(2)
        return
    }

    val isSide = r == 1 || c == 1 || r == h || c == w
    if (isSide) {
        println(3)
        return
    }
    println(4)
}

fun abc251b() {
    val (n, w) = readLine()!!.trim().split(" ").map { it.toInt() }
    val a = readLine()!!.trim().split(" ").map { it.toInt() }

    val combination1 = a.combinationWithoutRepetition(1)
    val weights = mutableListOf<Int>()
    count(combination1, w).forEach {
        weights.add(it)
    }
    if (2 <= n) {
        val combination2 = a.combinationWithoutRepetition(2)
        count(combination2, w).forEach {
            weights.add(it)
        }
    }
    if (3 <= n) {
        val combination3 = a.combinationWithoutRepetition(3)
        count(combination3, w).forEach {
            weights.add(it)
        }
    }
    println(weights.distinct().count())
}

private fun count(combination: Sequence<List<Int>>, w: Int): List<Int> {
    val weights = mutableListOf<Int>()
    combination.forEach {
        val sum = it.sum()
        if (sum <= w) weights.add(sum)
    }
    return weights
}

fun abc251a() {
    val s = readLine()!!
    when (s.length) {
        1 -> println(s + s + s + s + s + s)
        2 -> println(s + s + s)
        3 -> println(s + s)
    }
}

fun abc252b() {
    val (n, k) = readLine()!!.trim().split(" ").map { it.toInt() }
    val a = readLine()!!.trim().split(" ").map { it.toInt() }
    val b = readLine()!!.trim().split(" ").map { it.toInt() }

    val max = a.max()
    val indexes = mutableListOf<Int>()
    a.forEachIndexed { index, i ->
        if (i == max) {
            indexes.add(index + 1)
        }
    }
    indexes.forEach {
        if (b.contains(it)) {
            println("Yes")
            return
        }
    }
    println("No")
    // https://atcoder.jp/contests/abc252/submissions/31892040
    // val (n, k) = readLine()!!.split(' ').map(String::toInt)
    // val food = readLine()!!.split(' ').map(String::toInt)
    // val hate = readLine()!!.split(' ').map(String::toInt)
    // val max = food.max()!!
    // if (food.indices.any { food[it] == max && it + 1 in hate }) {
    //     println("Yes")
    // } else {
    //     println("No")
    // }
}

fun abc252a() {
    val (n) = readLine()!!.trim().split(" ").map { it.toInt() }

    val index = n - 97
    val list = ('a'..'z').map { c -> c.toString() }

    println(list[index])
}