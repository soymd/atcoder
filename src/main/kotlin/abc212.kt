fun main() {
    val (a, b) = readLine()!!.split(" ").map { it.toInt() }
    println(alloy(a, b))
}

fun alloy(a: Int, b: Int): String {
    return if (0 < a && b == 0) {
        "Gold"
    } else if (a == 0 && 0 < b) {
        "Silver"
    } else {
        "Alloy"
    }
}
