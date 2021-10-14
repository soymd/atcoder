fun main() {
}

fun yokanParty() {
    // https://atcoder.jp/contests/typical90/tasks/typical90_a
    val (n, l) = readLine()!!.trim().split(" ").map { it.toInt() }
    val k = readLine()!!.trim().toInt()
    val a = readLine()!!.trim().split(" ").map { it.toInt() }

    var score = Int.MAX_VALUE
    val permutation = Hoge(a).list.permutationWithoutRepetition(k)
    permutation.forEach { list ->
        list.forEachIndexed { index, i ->
            if (index == 0) {
                if (i < score) {
                    score = i
                }
            } else if (index == list.size - 1) {
                if (l - i < score) {
                    score = i
                }
            } else {
                if (i - list[index - 1] < score) {
                    score = i
                }
            }
        }
    }
    println(score)

}

class Hoge<T>(val list: List<T>) {
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
}

