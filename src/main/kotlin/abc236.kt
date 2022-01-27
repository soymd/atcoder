fun main() {
    whoIsMissing()
}

fun whoIsMissing() {
    val n = readLine()!!.trim().toInt()
    val a = readLine()!!.trim().split(" ").map { it.toInt() }.toMutableList()

    a.sort()
    val distinct = a.distinct().sorted()
    var count = 0
    var index = 0
    distinct.forEach {
        count = 0
        do {
            if (a[index] == it) {
                count++
            }
            index++
        } while (index < a.size && a[index] == it)
        if (count == 3) {
            println(it)
            return
        }
    }
}

fun chokudai() {
    val s = readLine()!!.trim().split("").filter { it != "" }.toMutableList()
    val (a, b) = readLine()!!.trim().split(" ").map { it.toInt() - 1 }

    val a1 = s[a]
    val b1 = s[b]

    s.removeAt(b)
    s.add(b, a1)
    s.removeAt(a)
    s.add(a, b1)

    s.forEach {
        print(it)
    }
}