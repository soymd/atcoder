fun main() {
    firstGrid()
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

fun hoge() {
    val (n, x) = readLine()!!.trim().split(" ").map { it.toInt() }
    val a = readLine()!!.trim().split(" ").map { it.toInt() - 1 }
}
