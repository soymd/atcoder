fun main() {
    aToZString2()
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