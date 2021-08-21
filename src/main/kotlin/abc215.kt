fun main() {
    yourFirstJudge()
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