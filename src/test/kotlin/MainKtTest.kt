import org.hamcrest.CoreMatchers.equalTo
import org.junit.Assert.assertThat
import org.junit.Before
import org.junit.jupiter.api.Test


class MainKtTest {

    @Before
    fun setUp() {
    }

    @Test
    fun test_hydrate() {
        val (a, b, c, d) = listOf(5, 2, 3, 2)

        val actual = hydrate(a, b, c, d)

        assertThat(actual, equalTo(2))
    }

    @Test
    fun test_hydrate_2() {
        val (a, b, c, d) = listOf(6, 9, 2, 3)

        val actual = hydrate(a, b, c, d)

        assertThat(actual, equalTo(-1))
    }

    @Test
    fun test_hydrate_5() {
        val (a, b, c, d) = listOf(1, 1, 1, 1)

        val actual = hydrate(a, b, c, d)

        assertThat(actual, equalTo(-1))
    }

    @Test
    fun test_hydrate_6() {
        val (a, b, c, d) = listOf(1, 2, 2, 2)

        val actual = hydrate(a, b, c, d)

        assertThat(actual, equalTo(1))
    }

    @Test
    fun test_hydrate_7() {
        val (a, b, c, d) = listOf(2, 2, 2, 2)

        val actual = hydrate(a, b, c, d)

        assertThat(actual, equalTo(1))
    }

    @Test
    fun test_hydrate_4() {
        val a = 55038
        val b = 30598
        val c = 48487
        val d = 18961
        val actual = hydrate(a, b, c, d)

        assertThat(actual, equalTo(1))
    }

//    @Test
//    fun test_hydrate_3() {
//        val num = 1..100000
//        var (a, b, c, d) = listOf(0, 0, 0, 0)
//        var actual: Int
//        var n = 0
//        do {
//            a = num.random()
//            b = num.random()
//            c = num.random()
//            d = num.random()
//            actual = hydrate(a, b, c, d)
//            n += 1
//            println("foooooo")
//            println(n)
//            println(a)
//            println(b)
//            println(c)
//            println(d)
//        } while (n <= 1000000)
//
//        println(n)
//
//        assertThat(actual, equalTo(-1))
//    }
}