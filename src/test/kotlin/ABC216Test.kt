import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.AfterEach
import org.junit.jupiter.api.BeforeEach
import org.junit.jupiter.api.Test


class ABC216Test {

    private val input = StandardInputStream()
    private val output = StandardOutputStream()


    @BeforeEach
    fun setUp() {
        System.setIn(input)
        System.setOut(output)
    }

    @AfterEach
    fun tearDown() {
        System.setIn(null)
        System.setOut(null)
    }

    @Test
    fun manyBalls1() {
        val n = 1L
        input.inputln(n.toString())

        manyBalls()

        val result = output.readLines()
        assertThat(foo(result.first()), equalTo(n))
        assertThat(result.first().length <= 120, equalTo(true))
    }

    @Test
    fun manyBalls2() {
        val n = 2L
        input.inputln(n.toString())

        manyBalls()

        val result = output.readLines()
        assertThat(foo(result.first()), equalTo(n))
        assertThat(result.first().length <= 120, equalTo(true))
    }

    @Test
    fun manyBalls3() {
        val n = 3L
        input.inputln(n.toString())

        manyBalls()

        val result = output.readLines()
        assertThat(foo(result.first()), equalTo(n))
        assertThat(result.first().length <= 120, equalTo(true))
    }

    @Test
    fun manyBalls4() {
        val n = 4L
        input.inputln(n.toString())

        manyBalls()

        val result = output.readLines()
        assertThat(foo(result.first()), equalTo(n))
        assertThat(result.first().length <= 120, equalTo(true))
    }

    @Test
    fun manyBalls5() {
        val n = 5L
        input.inputln(n.toString())

        manyBalls()

        val result = output.readLines()
        assertThat(foo(result.first()), equalTo(n))
        assertThat(result.first().length <= 120, equalTo(true))
    }

    @Test
    fun manyBalls6() {
        val n = 6L
        input.inputln(n.toString())

        manyBalls()

        val result = output.readLines()
        assertThat(foo(result.first()), equalTo(n))
        assertThat(result.first().length <= 120, equalTo(true))
    }

    @Test
    fun manyBalls7() {
        val n = 7L
        input.inputln(n.toString())

        manyBalls()

        val result = output.readLines()
        assertThat(foo(result.first()), equalTo(n))
        assertThat(result.first().length <= 120, equalTo(true))
    }

    @Test
    fun manyBalls8() {
        val n = 8L
        input.inputln(n.toString())

        manyBalls()

        val result = output.readLines()
        assertThat(foo(result.first()), equalTo(n))
        assertThat(result.first().length <= 120, equalTo(true))
    }

    @Test
    fun manyBalls9() {
        val n = 9L
        input.inputln(n.toString())

        manyBalls()

        val result = output.readLines()
        assertThat(foo(result.first()), equalTo(n))
        assertThat(result.first().length <= 120, equalTo(true))
    }

    @Test
    fun manyBalls10() {
        val n = 10L
        input.inputln(n.toString())

        manyBalls()

        val result = output.readLines()
        assertThat(foo(result.first()), equalTo(n))
        assertThat(result.first().length <= 120, equalTo(true))
    }

    @Test
    fun manyBalls11() {
        val n = 11L
        input.inputln(n.toString())

        manyBalls()

        val result = output.readLines()
        assertThat(foo(result.first()), equalTo(n))
        assertThat(result.first().length <= 120, equalTo(true))
    }

    @Test
    fun manyBalls12() {
        val n = 12L
        input.inputln(n.toString())

        manyBalls()

        val result = output.readLines()
        assertThat(foo(result.first()), equalTo(n))
        assertThat(result.first().length <= 120, equalTo(true))
    }

    @Test
    fun manyBalls13() {
        val n = 13L
        input.inputln(n.toString())

        manyBalls()

        val result = output.readLines()
        assertThat(foo(result.first()), equalTo(n))
        assertThat(result.first().length <= 120, equalTo(true))
    }

    @Test
    fun manyBalls14() {
        val n = 14L
        input.inputln(n.toString())

        manyBalls()

        val result = output.readLines()
        assertThat(foo(result.first()), equalTo(n))
        assertThat(result.first().length <= 120, equalTo(true))
    }

    @Test
    fun manyBalls15() {
        val n = 15L
        input.inputln(n.toString())

        manyBalls()

        val result = output.readLines()
        assertThat(foo(result.first()), equalTo(n))
        assertThat(result.first().length <= 120, equalTo(true))
    }

    @Test
    fun manyBalls99() {
        val n = 99L
        input.inputln(n.toString())

        manyBalls()

        val result = output.readLines()
        assertThat(foo(result.first()), equalTo(n))
        assertThat(result.first().length <= 120, equalTo(true))
    }

    @Test
    fun manyBalls100() {
        val n = 100L
        input.inputln(n.toString())

        manyBalls()

        val result = output.readLines()
        assertThat(foo(result.first()), equalTo(n))
        assertThat(result.first().length <= 120, equalTo(true))
    }

    @Test
    fun manyBalls1000000() {
        val n = 1000000L
        input.inputln(n.toString())

        manyBalls()

        val result = output.readLines()
        assertThat(foo(result.first()), equalTo(n))
        assertThat(result.first().length <= 120, equalTo(true))
    }

    private fun foo(str: String): Long {
        val foo = str.split("").filter { it != "" }
        var ans = 0L
        foo.forEach {
            if (it == "A") {
                ans += 1
            } else if (it == "B") {
                ans *= 2
            }
        }
        return ans
    }

    @Test
    fun sameName_1() {
        input.inputln("3")
        input.inputln("tanaka taro")
        input.inputln("sato hanako")
        input.inputln("tanaka taro")

        sameName()

        val result = output.readLines()
        assertThat(result, equalTo(listOf("Yes")))
    }

    @Test
    fun sameName_2() {
        input.inputln("3")
        input.inputln("saito ichiro")
        input.inputln("saito jiro")
        input.inputln("saito saburo")

        sameName()

        val result = output.readLines()
        assertThat(result, equalTo(listOf("No")))
    }

    @Test
    fun sameName_3() {
        input.inputln("4")
        input.inputln("sypdgidop bkseq")
        input.inputln("bajsqz hh")
        input.inputln("ozjekw mcybmtt")
        input.inputln("qfeysvw dbo")

        sameName()

        val result = output.readLines()
        assertThat(result, equalTo(listOf("No")))
    }
}