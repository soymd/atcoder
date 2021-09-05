fun main() {
    cuttingWoods()
}

fun cuttingWoods() {
    val (l, q) = readLine()!!.split(" ").map { it.toInt() }
    val queries = mutableListOf<List<Int>>()
    repeat(q) {
        queries.add(readLine()!!.split(" ").map { it.toInt() })
    }
    val cuts = mutableListOf<Int>()
    queries.forEach { query ->
        val length = query.last()
        if (query.first() == 1) {
            cuts.add(length)
        } else {
            cuts.add(length)
            val sort = cuts.sorted()
            val index = sort.indexOf(length)
            if (index == 0 && cuts.count() == 1) {
                println(l)
            } else {
                val start = sort.getOrNull(index - 1) ?: 0
                val end = sort.getOrNull(index + 1) ?: l
                println(end - start)
            }
            cuts.removeAt(cuts.count() - 1)
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