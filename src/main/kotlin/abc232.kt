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

    sIndex.forEachIndexed { index, i ->
        if (index == sIndex.count() - 1) {
            var diff1 = sIndex.last() - sIndex.first()
            var diff2 = tIndex.last() - tIndex.first()
            if (diff1 < 0) {
                diff1 += 26
            }
            if (diff2 < 0) {
                diff2 += 26
            }
            if (diff1 != diff2) {
                println("No")
                return
            }
            return@forEachIndexed
        }
        var diff1 = sIndex[index + 1] - i
        var diff2 = tIndex[index + 1] - tIndex[index]
        if (diff1 < 0) {
            diff1 += 26
        }
        if (diff2 < 0) {
            diff2 += 26
        }

        if (diff1 != diff2) {
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