fun main() {
    caesarCipher()
}

fun caesarCipher() {
    val s = readLine()!!.trim().split("").filter { it != "" }
    val t = readLine()!!.trim().split("").filter { it != "" }

    val list = setOf(
        "a", "b", "c", "d", "e", "f", "g", "h", "i", "j", "k", "l", "m", "n", "o", "p", "q", "r", "s", "t", "u", "v", "w", "x", "y", "z"
    )

    val sIndex = s.map {
        list.indexOf(it)
    }

    val tIndex = t.map {
        list.indexOf(it)
    }

    val diff = sIndex.first() - tIndex.first()

    sIndex.forEachIndexed { index, i ->
        if (i - tIndex[index] != diff) {
            println("No")
            return
        }
    }

    println("Yes")
}

fun qqSolver() {
    val (s1, _, s3) = readLine()!!.trim().split("").filter { it != "" }

    println(s1.toInt() * s3.toInt())
}