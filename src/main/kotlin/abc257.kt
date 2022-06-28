fun main() {
    oneDPawn()
}

fun oneDPawn() {
    val (n, k, q) = readLine()!!.trim().split(" ").map { it.toInt() }
    val a = readLine()!!.trim().split(" ").map { it.toInt() }.toMutableList()
    val l = readLine()!!.trim().split(" ").map { it.toInt() }


    l.forEach { i ->
        val num = a[i - 1]
        val num1 = num + 1
        if (!a.contains(num1) && num1 <= n) {
            a[i - 1] = num1
        }
    }

    println(a.joinToString(" "))
}

fun aToZString2() {
    val (n, x) = readLine()!!.trim().split(" ").map { it.toInt() }
    val list = listOf("A", "B", "C", "D", "E", "F", "G", "H", "I", "J", "K", "L", "M", "N", "O", "P", "Q", "R", "S", "T", "U", "V", "W", "X", "Y", "Z")

    val mutableList = mutableListOf<String>()
    repeat(list.count()) { i ->
        repeat(n) {
            mutableList.add(list[i])
        }
    }
    println(mutableList[x - 1])
}