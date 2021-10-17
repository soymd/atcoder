fun main() {
    doukasen()
}

fun doukasen() {
    val n = readLine()!!.toInt()
    val fuses = List(n) {
        val (a, b) = readLine()!!.trim().split(" ").map { it.toDouble() }
        a to b
    }
    var totalTime = 0.0
    fuses.forEach { fuse ->
        totalTime += fuse.first / fuse.second
    }
    var remainingTime = totalTime / 2
    val explosionTime = totalTime / 2

    var ans = 0.0
    fuses.forEachIndexed { index, (length, perSecond) ->
        val temp = remainingTime
        val requiredTime = length / perSecond
        remainingTime -= requiredTime
        if (remainingTime <= 0) {
            val d = perSecond * temp
            ans += d
            println(ans)
            return
        }
        ans += length
    }
}

fun stringShifting() {
    val s = readLine()!!.trim().split("").filter { it != "" }.map { it }.toMutableList()
    val list = mutableListOf<String>()
    repeat(s.count()) {
        val first = s.first()
        s.removeAt(0)
        s.add(first)
        list.add(s.joinToString(""))
    }
    list.sort()
    println(list.first())
    println(list.last())
}

fun exactPrice() {
    val x = readLine()!!.toInt()
    when {
        x == 0 -> {
            println("No")
        }
        x % 100 == 0 -> {
            println("Yes")
        }
        else -> {
            println("No")
        }
    }
}
