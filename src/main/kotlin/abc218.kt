fun main() {
    qwerty()
}

fun qwerty() {
    val p = readLine()!!.trim().split(' ').map(String::toInt)

    val list = listOf(
        "a",
        "b",
        "c",
        "d",
        "e",
        "f",
        "g",
        "h",
        "i",
        "j",
        "k",
        "l",
        "m",
        "n",
        "o",
        "p",
        "q",
        "r",
        "s",
        "t",
        "u",
        "v",
        "w",
        "x",
        "y",
        "z"
    )
    p.forEach {
        print(list[it - 1])
    }
}