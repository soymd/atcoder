fun main() {
    atCoderQuiz2()
}

fun atCoderQuiz2() {
    val x = readLine()!!.toInt()

    when {
        x < 40 -> {
            println(40 - x)
        }
        x < 70 -> {
            println(70 - x)
        }
        x < 90 -> {
            println(90 - x)
        }
        else -> {
            println("expert")
        }
    }
}