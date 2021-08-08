fun main() {
    val (a, b) = readLine()!!.split(" ").map { it.toInt() }
    println(bitwiseExclusiveOr(a, b))
}

fun bitwiseExclusiveOr(a: Int, b: Int): Int {
    val bitA = a.toString(2)
    val bitB = b.toString(2)
    val listA = mutableListOf<Int>()
    val listB = mutableListOf<Int>()

    for (i in 0 until 8 - bitA.length) {
        listA.add(0)
    }
    for (i in 0 until bitA.length) {
        listA.add(bitA[i].toString().toInt())
    }
    for (i in 0 until 8 - bitB.length) {
        listB.add(0)
    }
    for (i in 0 until bitB.length) {
        listB.add(bitB[i].toString().toInt())
    }

    val answerList = mutableListOf<Int>()
    for (i in 0 until 8) {
        if (listA[i] == listB[i]) {
            answerList.add(0)
        } else {
            answerList.add(1)
        }
    }

    var str = ""
    answerList.map {
        str += it.toString()
    }

    return str.toInt(2)
}

