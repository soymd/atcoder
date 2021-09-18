fun main() {
    maritozzo()
}

fun maritozzo() {
    val s1 = readLine()!!
    val s2 = readLine()!!
    val s3 = readLine()!!
    val t = readLine()!!.split("").filter { it != "" }
    val list = listOf("", s1, s2, s3)

    t.forEach {
        print(list[it.toInt()])
    }
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