fun main() {
    inverseOfPermutation()
}

fun inverseOfPermutation() {
    val n = readLine()!!.toInt()
    val list = readLine()!!.split(" ").map { it.toInt() }

    for (index in 1..n) {
        if (index == n) {
            println(list.indexOf(index) + 1)
        } else {
            print((list.indexOf(index) + 1).toString() + " ")
        }
    }
}

fun atCoderQuiz() {
    val s1 = readLine()!!
    val s2 = readLine()!!
    val s3 = readLine()!!
    val list = mutableListOf("ABC", "ARC", "AGC", "AHC")

    list.remove(s1)
    list.remove(s2)
    list.remove(s3)

    println(list.first())
}

fun lexicographicOrder() {
    val (s, t) = readLine()!!.split(" ")//.map { it }

    val list = listOf(s, t).sorted()

    if (list == listOf(s, t)) {
        println("Yes")
    } else {
        println("No")
    }
}