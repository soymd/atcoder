fun main() {
    lastTwoDigits()
}

fun lastTwoDigits() {
    val (n) = readLine()!!.trim().split(" ").map { it.toString() }


    println(n[1].toString() + n[2].toString())
}