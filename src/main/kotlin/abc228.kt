fun main() {
    onAndOff()
}

fun onAndOff() {
    val (s, t, x) = readLine()!!.trim().split(" ").map { it.toInt() }
    if (s < t) {
        if (s <= x && x < t) {
            println("Yes")
        } else {
            println("No")
        }
    } else {
        if (t <= x && x < s) {
            println("No")
        } else {
            println("Yes")
        }
    }
}

fun takahashisSecret() {
    val (n, x) = readLine()!!.trim().split(" ").map { it.toInt() }
    val a = readLine()!!.trim().split(" ").map { it.toInt() - 1 }

    val map = mutableMapOf<Int, Boolean>()
    repeat(n) {
        map[it] = false
    }

    var next = x - 1
    do {
        map[next] = true
        next = a[next]
    } while (map[next] != true)

    println(map.filter { it.value }.count())
}