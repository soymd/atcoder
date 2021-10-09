fun main() {
    fourDigits()
}

fun fourDigits() {
    val n = readLine()!!.toInt()
    when {
        n > 1000 -> {
            println(n)
        }
        n > 100 -> {
            print(0)
            println(n)
        }
        n > 10 -> {
            print(0)
            print(0)
            println(n)
        }
        else -> {
            print(0)
            print(0)
            print(0)
            println(n)
        }
    }
}
