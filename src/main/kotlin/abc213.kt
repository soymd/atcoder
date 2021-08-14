import java.util.*

fun main() {
    reorderCards()
}

fun takahashiTour() {
    val n = readLine()!!.trim().toInt()
    val graph = List(n) { mutableListOf<Int>() }
    repeat(n - 1) {
        val (a, b) = readLine()!!.trim().split(' ').map(String::toInt)
        //各都市の接続先都市を格納
        graph[a - 1].add(b - 1)
        graph[b - 1].add(a - 1)
    }
    for (edge in graph) {
        //数字が大きく訪問優先順位が低い都市が先頭に来るようソート
        edge.sortDescending()
    }
    val history = mutableListOf<Int>()
    val stack = ArrayDeque<Int>(listOf(0))
    val visit = BooleanArray(n)
    while (stack.isNotEmpty()) {
        val top = stack.removeLast()
        history.add(top + 1)
        if (visit[top]) continue
        visit[top] = true
        for (next in graph[top]) {
            if (visit[next]) continue
            stack.addLast(top)
            stack.addLast(next)
        }
    }
    println(history.joinToString(" "))
}

fun output() {
    val str = readLine()!!
    println(str)
    println(str + str)
}


fun reorderCards() {
    val (h, w, n) = readLine()!!.trim().split(' ').map(String::toInt)
    val cards = List(n) {
        val (a, b) = readLine()!!.trim().split(' ').map(String::toInt)
        a to b
    }
    val rows = cards.map { it.first }.toSet().sorted()
    val rowDest = rows.indices.associateBy { rows[it] }
    val columns = cards.map(Pair<*, Int>::second).distinct().sorted()
    val columnDest = columns.indices.associateBy(columns::get)
    for ((a, b) in cards) {
        println("${rowDest[a]!! + 1} ${columnDest[b]!! + 1}")
    }
}

fun backToStart(lastCity: Int, connections: MutableMap<Int, MutableSet<Int>>): List<Int> {
    val mutableList = mutableListOf<Int>()
    var city = lastCity
    do {
        val connection = connections[city]
        city = connection?.min()!!
        mutableList.add(city)
    } while (mutableList.last() != 1)
    return mutableList
}

fun createConnections(roads: List<List<Int>>): MutableMap<Int, MutableSet<Int>> {
    val connections = mutableMapOf<Int, MutableSet<Int>>()
    roads.forEach { road ->
        val set = connections[road.first()]
        if (set == null) {
            connections[road.first()] = mutableSetOf(road.last())
        } else {
            set.add(road.last())
        }
        val set2 = connections[road.last()]
        if (set2 == null) {
            connections[road.last()] = mutableSetOf(road.first())
        } else {
            set2.add(road.first())
        }
    }
    return connections
}

fun takahashiTour(cityCount: Int, roads: List<List<Int>>): String {
    val answer = mutableListOf(1)
    var city = 1
    val rest = mutableSetOf<Int>()
    for (i in 2..cityCount) {
        rest.add(i)
    }
    val connections = createConnections(roads)
    do {
        val connection = connections[city]
        val next = connection?.filter {
            rest.contains(it)
        }?.min()//first?
        if (next != null && rest.contains(next)) {
            rest.remove(next)
            city = next
            answer.add(next)
        } else {
            //最短で1に帰る方法
            val back = backToStart(city, connections)
            answer.addAll(back)
            city = 1
        }
    } while (!(rest.isEmpty() && city == 1))

    return answer.joinToString(separator = " ")
}

fun boobyPrize(n: Int, scores: List<Long>): Int {
    val score = scores.sortedDescending()[1]
    return scores.indexOf(score) + 1
}

fun bitwiseExclusiveOr(a: Int, b: Int): Int {
    val bitA = a.toString(2)
    val bitB = b.toString(2)
    val listA = mutableListOf<Int>()
    val listB = mutableListOf<Int>()

    for (i in 0 until 8 - bitA.length) {
        listA.add(0)
    }
    for (element in bitA) {
        listA.add(element.toString().toInt())
    }
    for (i in 0 until 8 - bitB.length) {
        listB.add(0)
    }
    for (element in bitB) {
        listB.add(element.toString().toInt())
    }

    val answerList = mutableListOf<Int>()
    for (i in 0 until 8) {
        if (listA[i] == listB[i]) {
            answerList.add(0)
        } else {
            answerList.add(1)
        }
    }

    var str = ""
    answerList.map {
        str += it.toString()
    }

    return str.toInt(2)
}

