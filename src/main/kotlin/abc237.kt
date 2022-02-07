fun main() {
    matrixTransposition()
}

fun matrixTransposition() {
    val (h, w) = readLine()!!.trim().split(" ").map { it.toInt() }
    val a = (List(h) {
        readLine()!!.trim().split(" ").map { it.toInt() }
    })

    repeat(w) { w1 ->
        val ans = mutableListOf<Int>()
        repeat(h) { h1 ->
            ans.add(a[h1][w1])
        }
        println(ans.joinToString(" "))
    }
}

fun notOverFlow() {
    val n = readLine()!!.trim().toLong()

    if (-2147483648 <= n && n < 2147483648) {
        println("Yes")
    } else {
        println("No")
    }
}