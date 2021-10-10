fun main() {
    strangeLunchbox()
}

fun strangeLunchbox() {
    val n = readLine()!!.toInt()
    val (x, y) = readLine()!!.split(" ").map { it.toInt() }
    val list = mutableListOf<Pair<Int, Int>>()
    repeat(n) {
        val temp = readLine()!!.split(" ").map { it.toInt() }
        list.add(temp.first() to temp.last())
    }


}

fun neoLexicographicOrdering() {
    //参考 https://atcoder.jp/contests/abc219/submissions/25930026
    val order = "abcdefghijklmnopqrstuvwxyz".split("").filter { it != "" }
    val newOrder = readLine()!!.trim().split("").filter { it != "" }
    val n = readLine()!!.trim().toInt()
    val words = List(n) { readLine()!!.trim() }
    val map = newOrder.indices.associate {
        newOrder[it] to order[it]
    }

    val mappedWords = words.map { word ->
        word.split("").filter { it != "" }.map {
            map[it]
        }.joinToString("")
    }
    val sortedIndex = mappedWords.indices.sortedBy { mappedWords[it] }
    sortedIndex.forEach { println(words[it]) }
}

fun maritozzo() {
    val s1 = readLine()!!
    val s2 = readLine()!!
    val s3 = readLine()!!
    val t = readLine()!!.split("").filter { it != "" }
    val list = listOf("", s1, s2, s3)

    t.forEach {
        print(list[it.toInt()])
    }
}

fun atCoderQuiz2() {
    val x = readLine()!!.toInt()

    when {
        x < 40 -> {
            println(40 - x)
        }
        x < 70 -> {
            println(70 - x)
        }
        x < 90 -> {
            println(90 - x)
        }
        else -> {
            println("expert")
        }
    }
}