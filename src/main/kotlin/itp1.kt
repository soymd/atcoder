fun main(args: Array<String>) {
    for (i in 1..1000) {
        println("Hello World")
    }
}

fun circleInRectangle(w: Int, h: Int, x: Int, y: Int, r: Int): String {
    val horizontal = x - r >= 0 && x + r <= w
    val vertical = y - r >= 0 && y + r <= h
    return if (horizontal && vertical) {
        "Yes"
    } else {
        "No"
    }
}

fun sortingThreeNumbers(a: Int, b: Int, c: Int): String {
    val list = mutableListOf(a, b, c)

    var swap = true
    while (swap) {
        swap = false
        for (i in 0 until list.count() - 1) {
            if (list[i] > list[i + 1]) {
                val temp = list[i]
                list[i] = list[i + 1]
                list[i + 1] = temp
                swap = true
            }
        }
    }

    return list.joinToString(" ")
}

fun range(a: Int, b: Int, c: Int): String {
    return if (a < b && b < c) {
        "Yes"
    } else {
        "No"
    }
}

fun smallLargeEqual(a: Int, b: Int): String {
    return when {
        a < b -> {
            "a < b"
        }
        a > b -> {
            "a > b"
        }
        else -> {
            "a == b"
        }
    }
}

fun watch(second: Int): String {
    val h = second / 3600
    val m = (second % 3600) / 60
    val s = second % 60
    return "$h:$m:$s"
}

fun rectangle(length: Int, width: Int): String {
    return "${length * width} ${length * 2 + width * 2}"
}

fun xCubic(n: Int): Int {
    return n * n * n
}