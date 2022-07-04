fun main() {
    median()
}


fun median() {
    val (a, b, c) = readLine()!!.trim().split(" ").map { it.toInt() }

    val list = listOf(a, b, c)

    val sorted = list.sorted()
    val ans = if (sorted[1] == b) {
        "Yes"
    } else {
        "No"
    }
    println(ans)
}