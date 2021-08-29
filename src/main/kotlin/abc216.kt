import kotlin.math.pow

fun main() {
    manyBalls()
}

fun manyBalls() {
    val n = readLine()!!.toLong()
    when (n.toInt()) {
        1 -> {
            println("A")
            return
        }
        2 -> {
            println("AB")
            return
        }
        3 -> {
            println("ABA")
            return
        }
        4 -> {
            println("ABB")
            return
        }
        5 -> {
            println("ABBA")
            return
        }
        6 -> {
            println("ABBAA")
            return
        }
        7 -> {
            println("ABBAAA")
            return
        }
        8 -> {
            println("ABBB")
            return
        }
        9 -> {
            println("ABBBA")
            return
        }
    }

    val n2 = n / 2

    var ans = 0L
    var count = 0
    do {
        ans = 2.0.pow(count).toLong()
        count += 1
    } while (ans <= n2)

    var str = "A"
    repeat(count - 2) {
        str += "B"
    }
    var rest = n2 - ans / 2
    do {
        rest -= 1
        str += "A"
    } while (rest > 0)
    if (n % 2 == 1L) {
        println(str + "BA")
    } else {
        println(str + "B")
    }
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