fun main() {
    failingGrade()
}

fun failingGrade() {
    val (n, p) = readLine()!!.split(" ").map { it.toInt() }
    val a = readLine()!!.split(" ").map { it.toInt() }

    val count = a.filter { it < p }.count()
    println(count)
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
