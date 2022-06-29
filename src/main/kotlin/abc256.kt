import kotlin.math.pow

fun main() {
    batters()
}

fun batters() {
    val (n) = readLine()!!.trim().split(" ").map { it.toInt() }
    val a = readLine()!!.trim().split(" ").map { HitFactory.create(it.toInt()) }

    var score = 0
    var runners = listOf(0, 0, 0)
    a.forEach { batter ->
        val result = batter.hit(runners)
        runners = result.first
        score += result.second
    }

    println(score)
}

interface Hit {
    fun hit(runners: List<Int>): Pair<List<Int>, Int>
}

class Single : Hit {
    override fun hit(runners: List<Int>): Pair<List<Int>, Int> {
        val score = runners[2]
        val third = runners[1]
        val second = runners[0]
        return Pair(listOf(1, second, third), score)
    }
}

class TwoBase : Hit {
    override fun hit(runners: List<Int>): Pair<List<Int>, Int> {
        val score = runners[1] + runners[2]
        val third = runners[0]
        return Pair(listOf(0, 1, third), score)
    }
}

class ThreeBase : Hit {
    override fun hit(runners: List<Int>): Pair<List<Int>, Int> {
        return Pair(listOf(0, 0, 1), runners.sum())
    }
}

class HomeRun : Hit {
    override fun hit(runners: List<Int>): Pair<List<Int>, Int> {
        return Pair(listOf(0, 0, 0), runners.sum() + 1)
    }
}

class HitFactory {
    companion object {
        fun create(n: Int): Hit {
            return when (n) {
                1 -> Single()
                2 -> TwoBase()
                3 -> ThreeBase()
                else -> HomeRun()
            }
        }
    }
}

fun twoN() {
    val (n) = readLine()!!.trim().split(" ").map { it.toInt() }

    println(2.0.pow(n.toDouble()).toInt())
}