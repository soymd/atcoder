fun main(args: Array<String>) {
    val (a, b, c, d) = readLine()!!.split(" ").map { it.toInt() }
    println(hydrate(a, b, c, d))
}

fun hydrate(initialBlue: Int, addBlue: Int, addRed: Int, ratio: Int): Int {
    var count = 0
    var blue = initialBlue
    var red = 0

    if (addBlue >= addRed * ratio) {
        return -1
    }

    do {
        count += 1
        blue += addBlue
        red += addRed
    } while (blue > red * ratio)

    return count
}
