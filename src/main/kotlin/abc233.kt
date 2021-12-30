fun main() {
    aReverse()
}

fun aReverse() {
    val (l, r) = readLine()!!.trim().split(" ").map { it.toInt() - 1 }
    val s = readLine()!!.trim().split("").filter { it != "" }.toMutableList()

    val sublist1 = s.subList(0, l)
    val sublist2 = s.subList(l, r + 1).reversed()
    val sublist3 = s.subList(r + 1, s.size)

    val ans = listOf(sublist1, sublist2, sublist3).flatten()
    ans.forEach { print(it) }
}

fun tenYenStamp() {
    val (x, y) = readLine()!!.trim().split(" ").map { it.toInt() }

    if (x >= y) {
        println(0)
    } else {
        val diff = y - x
        val i = if (diff % 10 > 0) 1 else 0
        println(((diff) / 10) + i)
    }
}