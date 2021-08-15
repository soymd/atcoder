import kotlin.math.min

fun main() {
    distribution()
}

fun distribution() {
    //https://atcoder.jp/contests/abc214/submissions/25033083より
    val n = readLine()!!.toInt()
    val s = readLine()!!.split(" ").map(String::toInt)
    val t = readLine()!!.split(" ").map(String::toInt)
    val ans = IntArray(n)
    //最速で高橋から渡されるぬすけのindexを取得
    val start = (0 until n).minBy { t[it] }!!
    ans[start] = t[start]
    var i = start
    do {
        //i+1=nのときindexが0になるようにする
        val nxt = (i + 1) % n
        //高橋から直接渡される=t[ntx]と前のすぬけから渡されるのとどちらが早いか比較
        ans[nxt] = min(ans[i] + s[i], t[nxt])
        i = nxt
        //startに戻ってくるまでループ
    } while (i != start)
    ans.forEach(::println)
}

fun howMany() {
    val (s, t) = readLine()!!.trim().split(' ').map(String::toInt)

    var ans = 0
    for (i in 0..s) {
        for (j in 0..s) {
            for (k in 0..s) {
                if (i + j + k <= s && i * j * k <= t) {
                    ans++
                }
            }
        }
    }

    println(ans)
}

fun a() {
    val n = readLine()!!.trim().toInt()
    val count = when {
        n <= 125 -> 4
        n <= 211 -> 6
        else -> 8
    }
    println(count)
}