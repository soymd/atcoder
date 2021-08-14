fun main() {
    howMany()
}

fun howMany() {
    val (s, t) = readLine()!!.trim().split(' ').map(String::toInt)

    val list = mutableListOf<List<Int>>()
    for (i in 0..s) {
        for (j in 0..s) {
            for (k in 0..s) {
                list.add(listOf(i, j, k))
            }
        }
    }

    println(list.filter {
        it[0] + it[1] + it[2] <= s &&
            it[0] * it[1] * it[2] <= t
    }.count())
}

fun a() {
    val n = readLine()!!.trim().toInt()
    val count = when {
        n <= 125 -> 4
        n <= 211 -> 6
        else -> 8
    }
    println(count)
}