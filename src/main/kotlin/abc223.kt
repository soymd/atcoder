fun main() {
    restrictedPermutation()
}

fun restrictedPermutation() {
    val (n, m) = readLine()!!.trim().split(" ").map { it.toInt() }
    val restricts = List(m) {
        val (a, b) = readLine()!!.trim().split(" ").map { it.toInt() }
        a to b
    }

    val init = IntArray(n) { it + 1 }.toList()
    val permutations = init.permutationWithoutRepetition(init.count()).toList()
    var ans = permutations.filter { list ->
        var bool = true
        restricts.forEach { restrict ->
            list.forEachIndexed { index, num ->
                if (num == restrict.first) {
                    val before = list.subList(0, index + 1)
                    val after = list.subList(index, list.count() - 1)
                    val containsBefore = before.contains(restrict.second)
                    val containsAfter = after.contains(restrict.second)
                    if (containsBefore && !containsAfter) {
                        bool = false
                        return@forEachIndexed
                    }
                }
            }
        }
        bool
    }
    val hoge = ans.sortedBy { list ->
        list.map { it.toString() }.joinToString("").toInt()
    }
    if (hoge.isEmpty()) {
        println(-1)
    } else {
        println(hoge.first().joinToString(" "))
    }
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

fun doukasen() {
    val n = readLine()!!.toInt()
    val fuses = List(n) {
        val (a, b) = readLine()!!.trim().split(" ").map { it.toDouble() }
        a to b
    }
    var totalTime = 0.0
    fuses.forEach { fuse ->
        totalTime += fuse.first / fuse.second
    }
    var remainingTime = totalTime / 2
    val explosionTime = totalTime / 2

    var ans = 0.0
    fuses.forEachIndexed { index, (length, perSecond) ->
        val temp = remainingTime
        val requiredTime = length / perSecond
        remainingTime -= requiredTime
        if (remainingTime <= 0) {
            val d = perSecond * temp
            ans += d
            println(ans)
            return
        }
        ans += length
    }
}

fun stringShifting() {
    val s = readLine()!!.trim().split("").filter { it != "" }.map { it }.toMutableList()
    val list = mutableListOf<String>()
    repeat(s.count()) {
        val first = s.first()
        s.removeAt(0)
        s.add(first)
        list.add(s.joinToString(""))
    }
    list.sort()
    println(list.first())
    println(list.last())
}

fun exactPrice() {
    val x = readLine()!!.toInt()
    when {
        x == 0 -> {
            println("No")
        }
        x % 100 == 0 -> {
            println("Yes")
        }
        else -> {
            println("No")
        }
    }
}
