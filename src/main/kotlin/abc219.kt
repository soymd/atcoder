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
    val x = readLine()!!
    val n = readLine()!!.toInt()
    val s = mutableListOf<String>()
    repeat(n) {
        s.add(readLine()!!)
    }

    val order = x.split("").filter { it != "" }

    for (i in 0 until s.size - 1) {
        for (j in s.size - 1 downTo i + 1) {
            if (needSort(s[j - 1], s[j], order)) {
                // 入れ替え
                val tmp = s[j - 1]
                s[j - 1] = s[j]
                s[j] = tmp
            }
        }
    }

    s.forEach {
        println(it)
    }
}

private fun needSort(s1: String, s2: String, order: List<String>): Boolean {
    val length = if (s1.length > s2.length) s1.length else s2.length

    val list1 = s1.split("").filter { it != "" }
    val list2 = s2.split("").filter { it != "" }

    list1.forEachIndexed { index, c ->
        val foo = list2.getOrNull(index)
        if (foo == null) {
            //list1がlist2よりも大きい
            if (s1.substring(0 until length) == s2.substring(0 until length)) {
                return s1.length <= s2.length
            }
        } else {
            val i1 = order.indexOf(c)
            val i2 = order.indexOf(foo)
            if (i1 > i2) {
                return true
            } else if (i1 < i2) {
                return false
            }
        }
    }
    return false
}

private fun sort(array: MutableList<String>) {
    for (i in 0 until array.size - 1) {
        for (j in array.size - 1 downTo i + 1) {
            if (array[j - 1] > array[j]) {
                // 入れ替え
                val tmp = array[j - 1]
                array[j - 1] = array[j]
                array[j] = tmp
            }
        }
    }
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