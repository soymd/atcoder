fun main() {
    weirdFunction()
}

fun weirdFunction() {
    val t = readLine()!!.trim().toInt()

    println(f(f(f(t) + t) + f(f(t))))
}

private fun f(x: Int): Int {
    return (x * x) + (2 * x) + 3
}