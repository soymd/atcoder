import kotlin.math.pow

fun main() {
    log2N()
}

fun log2N() {
    val n = readLine()!!.toLong()
    var ans = 0L
    var count = 0
    do {
        ans = 2.0.pow(count).toLong()
        count += 1
    } while (ans <= n)
    println(count - 2)
}

fun yourFirstJudge() {
    val s = readLine()!!

    val ans = if (s == "Hello,World!") {
        "AC"
    } else {
        "WA"
    }
    println(ans)
}