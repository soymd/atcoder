fun main() {
    a()
}

fun a() {
    val n = readLine()!!.trim().toInt()
    val count = when {
        n <= 125 -> 4
        n <= 211 -> 6
        else -> 8
    }
    println(count)
}