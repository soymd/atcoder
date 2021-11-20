fun main() {
    onAndOff()
}

fun onAndOff() {
    var (s, t, x) = readLine()!!.trim().split(" ").map { it.toInt() }

    if (s < t) {
        if (s <= x && x < t) {
            println("Yes")
        } else {
            println("No")
        }
    } else {
        if (t == 0) {
            t = 24
            if (s <= x && x < t) {
                println("Yes")
            } else {
                println("No")
            }
        } else {
            if (t <= x && s < t) {
                println("Yes")
            } else {
                println("No")
            }
        }

    }
}