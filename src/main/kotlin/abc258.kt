fun main() {
    whenQuestion()
}

fun whenQuestion() {
    val (k) = readLine()!!.trim().split(" ").map { it.toInt() }

    val minutes = k % 60
    val minutesString = if (minutes >= 10) minutes.toString() else "0$minutes"
    val hour = if (k >= 60) 22 else 21
    println("$hour:$minutesString")
}