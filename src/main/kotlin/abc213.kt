fun main() {
    val (h, w, n) = readLine()!!.split(" ").map { it.toLong() }

    val list = mutableListOf<List<Long>>()
    for (i in 1..n) {
        list.add(readLine()!!.split(" ").map { it.toLong() })
    }
    println(reorderCards(h, w, n, list))
}

fun reorderCards(h: Long, w: Long, n: Long, list: List<List<Long>>): List<String> {
    val hPosition = mutableSetOf<Long>()
    for (i in 1..h) {
        hPosition.add(i)
    }
    val wPosition = mutableSetOf<Long>()
    for (i in 1..w) {
        wPosition.add(i)
    }

    list.forEach {
        hPosition.remove(it.first())
        wPosition.remove(it.last())
    }

    val ans = mutableListOf<String>()
    list.forEach { position ->
        val h = position.first()
        val w = position.last()

        val foo = hPosition.count { it < h }
        val bar = wPosition.count { it < w }
        ans.add("${h - foo} ${w - bar}")
    }

    return ans
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

