fun main(args: Array<String>) {
    val (a, b, c, d) = readLine()!!.split(" ").map { it.toInt() }
    println(hydrate(a, b, c, d))
}

fun hydrate(a: Int, b: Int, c: Int, d: Int): Int {
    var n = 0
    var blue = a
    var red = 0

    if (b > c * d) {
        return -1
    }

    do {
        n += 1
        blue += b
        red += c
//        println(blue)
//        println(red)
//        println(red * d)
        print(n)
//        println("red * d > blue: " + (red * d > blue))
    } while (red * d < blue)

    return n
}
