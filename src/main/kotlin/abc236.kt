fun main() {
    chokudai()
}

fun chokudai() {
    val s = readLine()!!.trim().split("").filter { it != "" }.toMutableList()
    val (a, b) = readLine()!!.trim().split(" ").map { it.toInt() - 1 }

    val a1 = s[a]
    val b1 = s[b]

    s.removeAt(b)
    s.add(b, a1)
    s.removeAt(a)
    s.add(a, b1)

    s.forEach {
        print(it)
    }
}