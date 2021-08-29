fun main() {
    signedDifficulty()
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