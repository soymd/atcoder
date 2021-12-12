fun main() {
    election()
}

fun election() {
    val (n) = readLine()!!.trim().split(" ").map { it.toInt() }
    val s = List(n) {
        readLine()!!.trim()
    }

    val foo = s.toSet().map { str ->
        str to s.count { it == str }
    }
    println(foo.maxBy { it.second }?.first)
}

fun waterPressure() {
    val (d) = readLine()!!.trim().split(" ").map { it.toDouble() }

    println(d / 100)
}