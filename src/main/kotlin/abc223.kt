fun main() {
    exactPrice()
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
