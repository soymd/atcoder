fun main() {
    abc252b()
}

fun abc252b() {
    val (n, k) = readLine()!!.trim().split(" ").map { it.toInt() }
    val a = readLine()!!.trim().split(" ").map { it.toInt() }
    val b = readLine()!!.trim().split(" ").map { it.toInt() }

    val max = a.max()
    val indexes = mutableListOf<Int>()
    a.forEachIndexed { index, i ->
        if (i == max) {
            indexes.add(index + 1)
        }
    }
    indexes.forEach {
        if (b.contains(it)) {
            println("Yes")
            return
        }
    }
    println("No")
    // https://atcoder.jp/contests/abc252/submissions/31892040
    // val (n, k) = readLine()!!.split(' ').map(String::toInt)
    // val food = readLine()!!.split(' ').map(String::toInt)
    // val hate = readLine()!!.split(' ').map(String::toInt)
    // val max = food.max()!!
    // if (food.indices.any { food[it] == max && it + 1 in hate }) {
    //     println("Yes")
    // } else {
    //     println("No")
    // }
}

fun abc252a() {
    val (n) = readLine()!!.trim().split(" ").map { it.toInt() }

    val index = n - 97
    val list = ('a'..'z').map { c -> c.toString() }

    println(list[index])
}