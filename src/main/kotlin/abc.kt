import java.util.*

fun main() {
    abc242a()
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

private fun <T> List<T>.combinationWithoutRepetition(k: Int): Sequence<List<T>> {
    require(k in 0..size) { "引数 k は 0 以上かつ $size 以下でなければなりません。k: $k" }

    return pcSequenceFactory<T> { options, i ->
        options.drop(i + 1)
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