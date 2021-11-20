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
        if (t == 0) {
            if (x == 0) {
                if (s == 1) {
                    println("Yes")
                } else {
                    println("No")
                }
                return
            }
            if (s <= x && x < 24) {
                println("Yes")
            } else {
                println("No")
            }
        } else {
            val x1 = x + 24
            val t1 = t + 24
            if (s <= x1 && x1 < t1) {
                println("Yes")
            } else {
                println("No")
            }
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