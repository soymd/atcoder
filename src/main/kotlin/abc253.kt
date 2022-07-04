import kotlin.math.absoluteValue

fun main() {
    distanceBetweenToken()
}

fun distanceBetweenToken() {
    val (h, w) = readLine()!!.trim().split(" ").map { it.toInt() }

    val s = List(h) {
        readLine()!!.trim().split("").map { it }
    }

    val coordinates = mutableListOf<Pair<Int, Int>>()
    s.forEachIndexed { h, list ->
        list.forEachIndexed { w, s ->
            if (s == "o") {
                coordinates.add(Pair(h + 1, w))
            }
        }
    }

    val hDiff = coordinates[0].first - coordinates[1].first
    val wDiff = coordinates[0].second - coordinates[1].second
    println(hDiff.absoluteValue + wDiff.absoluteValue)
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