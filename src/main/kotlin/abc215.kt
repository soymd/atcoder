import kotlin.math.pow

fun main() {
    oneMoreAabAbaBaa()
}

fun oneMoreAabAbaBaa() {
    val (s, _k) = readLine()!!.split(" ")
    val k = _k.toInt()

    val chars = s.split("").subList(1, s.length + 1)

    Foo(chars, k).foo()
}

class Foo(val chars: List<String>, val k: Int) {
    fun foo() {
        val permutationWithoutRepetition = chars.permutationWithoutRepetition(chars.count()).toList()
        val list = permutationWithoutRepetition.toSet().map { it.joinToString("") }
        println(list.sorted()[k - 1])
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
}

fun log2N() {
    val n = readLine()!!.toLong()
    var ans = 0L
    var count = 0
    do {
        ans = 2.0.pow(count).toLong()
        count += 1
    } while (ans <= n)
    println(count - 2)
}

fun yourFirstJudge() {
    val s = readLine()!!

    val ans = if (s == "Hello,World!") {
        "AC"
    } else {
        "WA"
    }
    println(ans)
}