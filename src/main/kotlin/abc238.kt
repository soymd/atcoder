import kotlin.math.pow

fun main() {
    exponentialOrQuadratic()
}

fun exponentialOrQuadratic() {
    val n = readLine()!!.trim().toInt()

    val n1 = 2.0.pow(n)
    val n2 = n.toDouble().pow(2)
    if (n1 > n2) {
        println("Yes")
    } else {
        println("No")
    }
}