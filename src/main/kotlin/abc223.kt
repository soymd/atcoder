fun main() {
    stringShifting()
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
