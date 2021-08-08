fun main() {
    val (n) = readLine()!!.split(" ").map { it.toInt() }

    val list = readLine()!!.split(" ").map {
        val l = mutableListOf<Int>()
        it.split(" ").map { str ->
            l.add(str.toInt())
        }
        l.sort()
        l
    }
    println(takahashiTour(n, list))
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
    val rest = mutableSetOf<Int>()
    for (i in 1..cityCount) {
        rest.add(i)
    }
    val connections = mutableMapOf<Int, MutableSet<Int>>()
    roads.forEach { road ->
        val set = connections[road.first()]
        if (set == null) {
            connections[road.first()] = mutableSetOf(road.last())
        } else {
            set.add(road[1])
        }
    }
    var city = 1
    rest.remove(city)
    do {
        var connection = connections[city]
        if (connection == null) {
            city = answer.takeLast(2).first()
            answer.add(city)
            connection = connections[city]
        }
        val next = connection?.filter {
            rest.contains(it)
        }?.min()//3を取る
        if (next != null && rest.contains(next)) {
            rest.remove(next)
            city = next
            answer.add(next)
        } else {
            val index = answer.indexOf(city) - 1
            if (index >= 0) {
                city = answer[index]
                answer.add(city)
            }
        }
        if (rest.isEmpty() && city == 1) {
            return answer.joinToString(separator = " ")
        }
    } while (rest.isNotEmpty())

    return answer.joinToString(separator = " ") + " 1"
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

