fun main() {
    manyBalls()
}

fun manyBalls() {
    val n = readLine()!!.toLong()
    if (n == 1L) {
        println("A")
        return
    }

    var temp = n
    var ans = ""

    do {
        if (temp % 2 == 0L) {
            temp /= 2
            ans = "B$ans"
        } else {
            temp -= 1
            ans = "A$ans"
        }
    } while (temp != 1L)
    println("A$ans")
}

fun sameName() {
    val n = readLine()!!.toInt()
    val list = mutableListOf<String>()
    repeat(n) {
        list.add(readLine()!!)
    }

    if (list.count() == list.distinct().count()) {
        println("No")
    } else {
        println("Yes")
    }
}

fun signedDifficulty() {
    val (x, y) = readLine()!!.split(".").map(String::toInt)
    val str = when (y) {
        in 0..2 -> "-"
        in 3..6 -> ""
        else -> "+"
    }

    print(x)
    println(str)
}