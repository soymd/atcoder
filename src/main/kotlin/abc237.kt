fun main() {
    notOverFlow()
}

fun notOverFlow() {
    val n = readLine()!!.trim().toLong()

    if (-2147483648 <= n && n < 2147483648) {
        println("Yes")
    } else {
        println("No")
    }
}