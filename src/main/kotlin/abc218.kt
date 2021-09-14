fun main() {
    val n = readLine()!!.toInt()
    val s = readLine()!!

    if (s.substring(n - 1).startsWith("x")) {
        println("No")
    } else {
        println("Yes")
    }
}
