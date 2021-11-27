fun main() {
    cheese()
}

fun cheese() {
    val (n, w) = readLine()!!.trim().split(" ").map { it.toInt() }
    val cheeses = List(n) {
        readLine()!!.trim().split(" ").map { it.toInt() }
    }.toMutableList()

    cheeses.sortByDescending { it.first() }

    var limit = w.toLong()
    var sum = 0L
    cheeses.forEachIndexed { index, cheese ->
        val taste = cheese.first().toLong()
        val total = cheese.last().toLong()
        if (total <= limit) {
            sum += taste * total
            limit -= total
        } else {
            sum += taste * limit
            println(sum)
            return
        }
    }

    println(sum)
}

fun hardCalculation() {
    val (a, b) = readLine()!!.trim().split(" ")

    val a1 = a.reversed().split("").filter { it != "" }.map { it.toInt() }
    val b1 = b.reversed().split("").filter { it != "" }.map { it.toInt() }

    a1.forEachIndexed { index, i ->
        b1.getOrNull(index)?.let {
            if (i + it > 9) {
                println("Hard")
                return
            }
        }
    }

    println("Easy")
}


fun firstGrid() {
    val s1 = readLine()!!.trim().split("").filter { it != "" }
    val s2 = readLine()!!.trim().split("").filter { it != "" }

    if (s1.all { it == "#" } || s2.all { it == "#" }) {
        println("Yes")
        return
    }
    if (s1.first() == "#" && s2.first() == "#") {
        println("Yes")
        return
    }
    if (s1.last() == "#" && s2.last() == "#") {
        println("Yes")
        return
    }

    println("No")
}