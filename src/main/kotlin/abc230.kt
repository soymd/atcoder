fun main() {
    atCoderQuiz3()
}

fun atCoderQuiz3() {
    var n = readLine()!!.trim().toInt()

    if (n >= 42) {
        n += 1
    }

    if (10 > n) {
        println("AGC00$n")
    } else {
        println("AGC0$n")
    }
}