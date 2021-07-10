import kotlin.math.floor

fun main(args: Array<String>) {
    val n = readLine()!!.split(" ").map { it.toInt() }
    val list = readLine()!!.split(" ").map { it.toLong() }
    val answer = swappable(n.first(), list)

    println(answer)
}

fun swappable(n: Int, list: List<Long>): Int {
    var count = list.count() * (list.count() - 1) / 2
    val distinct = list.distinct()
    val foo = mutableMapOf(0 to 0)
    distinct.forEach { hoge ->
        val foo = list.count { it == hoge }
        val bar = foo * (foo - 1) / 2
        count -= bar
    }

    return count
}

fun savings(goal: Long): Int {
    var n = 0
    var day = 1
    do {
        n += day
        day += 1
    } while (n < goal)
    return day - 1
}

fun maxiBuying(yen: Int): String {
    val n = floor(yen.toFloat() * 1.08).toInt()
    return when {
        n > 206 -> {
            ":("
        }
        n == 206 -> {
            "so-so"
        }
        else -> {
            "Yay!"
        }
    }
}

enum class Repetition {
    WITHOUT_REPETITION,
    WITH_REPETITION
}

fun <T> List<T>.permutation(k: Int, repetition: Repetition) = when (repetition) {
    Repetition.WITH_REPETITION ->
        permutationWithRepetition(k)
    Repetition.WITHOUT_REPETITION ->
        permutationWithoutRepetition(k)
}

fun <T> List<T>.combination(k: Int, repetition: Repetition) = when (repetition) {
    Repetition.WITH_REPETITION ->
        combinationWithRepetition(k)
    Repetition.WITHOUT_REPETITION ->
        combinationWithoutRepetition(k)
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

/** 重複なしの順列 */
fun <T> List<T>.permutationWithoutRepetition(k: Int): Sequence<List<T>> {
    require(k in 0..size) { "引数 k は 0 以上かつ $size 以下でなければなりません。k: $k" }

    return pcSequenceFactory<T> { options, i ->
        options.take(i) + options.drop(i + 1)
    }(this, k)
}

/** 重複なしの組み合わせ */
fun <T> List<T>.combinationWithoutRepetition(k: Int): Sequence<List<T>> {
    require(k in 0..size) { "引数 k は 0 以上かつ $size 以下でなければなりません。k: $k" }

    return pcSequenceFactory<T> { options, i ->
        options.drop(i + 1)
    }(this, k)
}

/** 重複ありの順列 */
fun <T> List<T>.permutationWithRepetition(k: Int): Sequence<List<T>> {
    require(k >= 0) { "引数 k は 0 以上でなければなりません。k: $k" }

    return pcSequenceFactory<T> { options, i ->
        options
    }(this, k)
}

/** 重複ありの組み合わせ */
fun <T> List<T>.combinationWithRepetition(k: Int): Sequence<List<T>> {
    require(k >= 0) { "引数 k は 0 以上でなければなりません。k: $k" }

    return pcSequenceFactory<T> { options, i ->
        options.drop(i)
    }(this, k)
}