fun main() {
    qqSolver()
}

fun qqSolver() {
    val (s1, _, s3) = readLine()!!.trim().split("").filter { it != "" }

    println(s1.toInt() * s3.toInt())
}