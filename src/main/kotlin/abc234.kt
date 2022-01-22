import kotlin.math.sqrt

fun main() {
    longestSegment()
}

fun longestSegment() {
    val n = readLine()!!.trim().toInt()
    val x = List(n) {
        readLine()!!.trim().split(" ").map { it.toDouble() }
    }

    val combinations = x.combinationWithoutRepetition(2).toList()
    var max = 0.0
    combinations.forEachIndexed { index, combination ->

        val x1 = combination[0][0]
        val x2 = combination[1][0]
        val y1 = combination[0][1]
        val y2 = combination[1][1]

        val ans = sqrt((x1 - x2) * (x1 - x2) + (y1 - y2) * (y1 - y2))
        if (max < ans) {
            max = ans
        }
    }
    println(max)
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


fun weirdFunction() {
    val t = readLine()!!.trim().toInt()

    println(f(f(f(t) + t) + f(f(t))))
}

private fun f(x: Int): Int {
    return (x * x) + (2 * x) + 3
}