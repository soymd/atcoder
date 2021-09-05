import java.util.*

fun main() {
    cuttingWoods()
}

fun cuttingWoods() {
    //https://atcoder.jp/contests/abc217/submissions/25567188より拝借
    val (l, q) = readLine()!!.trim().split(' ').map(String::toInt)
    val queries = List(q) {
        val (c, x) = readLine()!!.trim().split(' ').map(String::toInt)
        c to x
    }
    //TreeSet参考 https://qiita.com/p_shiki37/items/3902f4e3adc3aeb382f1#treeset
    val cut = TreeSet<Int>().also {
        it.add(0)
        it.add(l)
    }
    for ((c, x) in queries) {
        if (c == 1) {
            cut.add(x)
        } else {
            val from = cut.lower(x)!!
            val until = cut.higher(x)!!
            println(until - from)
        }
    }
}

fun inverseOfPermutation() {
    val n = readLine()!!.toInt()
    val list = readLine()!!.split(" ").map { it.toInt() }

    val map = mutableMapOf<Int, Int>()

    list.forEachIndexed { index, i ->
        map[i] = index
    }
    for (i in 1..n) {
        print(map[i]!! + 1)
        if (i != n) {
            print(" ")
        }
    }
}

fun atCoderQuiz() {
    val s1 = readLine()!!
    val s2 = readLine()!!
    val s3 = readLine()!!
    val list = mutableListOf("ABC", "ARC", "AGC", "AHC")

    list.remove(s1)
    list.remove(s2)
    list.remove(s3)

    println(list.first())
}

fun lexicographicOrder() {
    val (s, t) = readLine()!!.split(" ")//.map { it }

    val list = listOf(s, t).sorted()

    if (list == listOf(s, t)) {
        println("Yes")
    } else {
        println("No")
    }
}