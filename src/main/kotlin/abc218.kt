fun main() {
    shapes()
}

fun shapes() {
    val n = readLine()!!.toInt()
    val list = mutableListOf<List<String>>()
    val s = mutableListOf<Pair<Int, Int>>()
    repeat(n) { i ->
        val str = readLine()!!
        val row = str.trim().split("").filter { it != "" }
        list.add(row)
        row.forEachIndexed { index, it ->
            if (it == "#") {
                s.add(index + 1 to i + 1)
            }
        }
    }
    val t = mutableListOf<Pair<Int, Int>>()
    repeat(n) { i ->
        val row = readLine()!!.trim().split("").filter { it != "" }
        row.forEachIndexed { index, it ->
            if (it == "#") {
                t.add(index + 1 to i + 1)
            }
        }
    }

    val compressedT = compress(t)
    if (compress(s) == compressedT) {
        println("Yes")
        return
    }

    val rotate90: MutableList<MutableList<String>> = rotateCW(list)
    s.clear()
    rotate90.forEachIndexed { i, mutableList ->
        mutableList.forEachIndexed { index, it ->
            if (it == "#") {
                s.add(index + 1 to i + 1)
            }
        }
    }
    if (compress(s) == compressedT) {
        println("Yes")
        return
    }

    val rotate180: MutableList<MutableList<String>> = rotateCW(rotate90)
    s.clear()
    rotate180.forEachIndexed { i, mutableList ->
        mutableList.forEachIndexed { index, it ->
            if (it == "#") {
                s.add(index + 1 to i + 1)
            }
        }
    }
    if (compress(s) == compressedT) {
        println("Yes")
        return
    }

    val rotate270: MutableList<MutableList<String>> = rotateCW(rotate180)
    s.clear()
    rotate270.forEachIndexed { i, mutableList ->
        mutableList.forEachIndexed { index, it ->
            if (it == "#") {
                s.add(index + 1 to i + 1)
            }
        }
    }
    if (compress(s) == compressedT) println("Yes") else println("No")
}

fun rotateCW(mat: List<List<String>>): MutableList<MutableList<String>> {
    val m = mat.count()
    val n: Int = mat[0].count()
    val ret = MutableList(n) { MutableList(m) { "" } }
    for (r in 0 until m) {
        for (c in 0 until n) {
            ret[c][m - 1 - r] = mat[r][c]
        }
    }
    return ret
}

private fun compress(cards: MutableList<Pair<Int, Int>>): List<Pair<Int, Int>> {
    val rows = cards.map { it.first }.toSet().sorted()
    val rowDest = rows.indices.associateBy { rows[it] }
    val columns = cards.map(Pair<*, Int>::second).distinct().sorted()
    val columnDest = columns.indices.associateBy(columns::get)
    val mutableList = mutableListOf<Pair<Int, Int>>()
    for ((a, b) in cards) {
        mutableList.add(rowDest[a]!! + 1 to columnDest[b]!! + 1)
    }
    return mutableList
}

fun qwerty() {
    val p = readLine()!!.trim().split(' ').map(String::toInt)

    val list = listOf(
        "a",
        "b",
        "c",
        "d",
        "e",
        "f",
        "g",
        "h",
        "i",
        "j",
        "k",
        "l",
        "m",
        "n",
        "o",
        "p",
        "q",
        "r",
        "s",
        "t",
        "u",
        "v",
        "w",
        "x",
        "y",
        "z"
    )
    p.forEach {
        print(list[it - 1])
    }
}