fun main() {
    abc251b()
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