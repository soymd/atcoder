fun main() {
    abc252a()
}

fun abc252a() {
    val (n) = readLine()!!.trim().split(" ").map { it.toInt() }

    val index = n - 97
    val list = ('a'..'z').map { c -> c.toString() }

    println(list[index])
}