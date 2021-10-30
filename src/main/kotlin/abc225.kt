fun main() {
    distinctStrings()
}

fun distinctStrings() {
    val s = readLine()!!.trim().split("").filter { it != "" }.distinct()

    when (s.count()) {
        3 -> println("6")
        2 -> println("3")
        1 -> println("1")
    }
}