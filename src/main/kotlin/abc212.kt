fun main() {
    val (x) = readLine()!!.split(" ").map { it.toString() }
    println(weakPassword(x))
}

fun weakPassword(x: String): String {
    val x1 = x[0].toString().toInt()
    val x2 = x[1].toString().toInt()
    val x3 = x[2].toString().toInt()
    val x4 = x[3].toString().toInt()
    if (x1 == x2 && x2 == x3 && x3 == x4) {
        return "Weak"
    }
    if ((x1 + 1) % 10 == x2 &&
        (x2 + 1) % 10 == x3 &&
        (x3 + 1) % 10 == x4
    ) {
        return "Weak"
    }
    return "Strong"
}

fun alloy(a: Int, b: Int): String {
    return if (0 < a && b == 0) {
        "Gold"
    } else if (a == 0 && 0 < b) {
        "Silver"
    } else {
        "Alloy"
    }
}
