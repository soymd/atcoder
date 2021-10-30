fun main() {
    starOrNot()
}

fun starOrNot() {
    val n = readLine()!!.toInt()
    val graph = List(n - 1) {
        val (a, b) = readLine()!!.trim().split(" ").map { it.toInt() }
        a to b
    }.toMutableList()

    val first = graph.first().first
    val second = graph.first().second

    graph.removeAt(0)

    val bool1 = graph.all { it.first == first || it.second == first }
    val bool2 = graph.all { it.first == second || it.second == second }

    if (bool1 || bool2) {
        println("Yes")
    } else {
        println("No")
    }
}

fun distinctStrings() {
    val s = readLine()!!.trim().split("").filter { it != "" }.distinct()

    when (s.count()) {
        3 -> println("6")
        2 -> println("3")
        1 -> println("1")
    }
}