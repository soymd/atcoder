fun main() {
    distribution()
}

fun distribution() {
    val n = readLine()!!.trim().toInt()
    val s = readLine()!!.trim().split(' ').map(String::toInt)
    val t = readLine()!!.trim().split(' ').map(String::toInt)

    val ans = mutableMapOf<Int, Int>()
    t.forEachIndexed { i, start ->
        var index = i
        var time = start
        repeat(n) {
            val i1 = ans[index]
            if (i1 == null) {
                ans[index] = time
            } else if (i1 > time) {
                ans[index] = time
            }
            val next = s[index]

            index++
            if (index >= n) {
                index = 0
            }
            time += next
        }
    }

    ans.keys.sorted().forEach {
        println(ans[it])
    }
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