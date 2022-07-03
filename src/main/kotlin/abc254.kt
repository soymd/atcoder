fun main() {
    practicalComputing()
}


fun practicalComputing() {
    val n = readLine()!!.trim().toInt()
    val ans = mutableListOf<MutableList<Int>>()
    repeat(n) { i ->
        val list = mutableListOf<Int>()
        repeat(i + 1) { j ->
            val isZero = j == 0
            val isLast = j == i
            if (isZero || isLast) {
                list.add(1)
            } else {
                val temp = ans[i - 1]
                val i1 = temp.getOrNull(j - 1) ?: 0
                val i2 = temp.getOrNull(j) ?: 0
                if (i1 != 0 && i2 != 0) {
                    list.add(i1 + i2)
                }
            }
        }
        ans.add(list)
    }
    ans.forEach { a ->
        println(a.joinToString(" "))
    }
}

fun lastTwoDigits() {
    val (n) = readLine()!!.trim().split(" ").map { it.toString() }


    println(n[1].toString() + n[2].toString())
}