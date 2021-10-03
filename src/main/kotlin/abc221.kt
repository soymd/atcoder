import kotlin.math.pow

fun main() {
    typo()
}

fun typo() {
    val s = readLine()!!.split("").filter { it != "" }
    val t = readLine()!!.split("").filter { it != "" }

    if (s == t) {
        println("Yes")
        return
    }

    s.forEachIndexed { index, str ->
        if (index == s.size - 1) {
            println("No")
            return
        }
        val temp = s.toMutableList()
        temp.removeAt(index)
        temp.add(index + 1, str)
        if (temp == t) {
            println("Yes")
            return
        }
    }
}

fun seismicMagnitudeScales() {
    val (a, b) = readLine()!!.split(" ").map { it.toDouble() }

    println(32.0.pow(a - b).toInt())
}
