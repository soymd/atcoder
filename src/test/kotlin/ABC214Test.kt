import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.AfterEach
import org.junit.jupiter.api.BeforeEach
import org.junit.jupiter.api.Test


class ABC214Test {

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
    fun distribution_1() {
        input.inputln("3")
        input.inputln("4 1 5")
        input.inputln("3 10 100")

        distribution()

        val result = output.readLines()
        assertThat(result, equalTo(listOf("3", "7", "8")))
    }

    @Test
    fun distribution_2() {
        input.inputln("4")
        input.inputln("100 100 100 100")
        input.inputln("1 1 1 1")

        distribution()

        val result = output.readLines()
        assertThat(result, equalTo(listOf("1", "1", "1", "1")))
    }

    @Test
    fun distribution_3() {
        input.inputln("4")
        input.inputln("1 2 3 4")
        input.inputln("1 2 4 7")

        distribution()

        val result = output.readLines()
        assertThat(result, equalTo(listOf("1", "2", "4", "7")))
    }

    @Test
    fun distribution_4() {
        input.inputln("8")
        input.inputln("84 87 78 16 94 36 87 93")
        input.inputln("50 22 63 28 91 60 64 27")

        distribution()

        val result = output.readLines()
        val expected = listOf("50", "22", "63", "28", "44", "60", "64", "27")
        assertThat(result, equalTo(expected))
    }

    @Test
    fun howMany_1() {
        input.inputln("1 0")

        howMany()

        val result = output.readLines()
        assertThat(result, equalTo(listOf("4")))
    }

    @Test
    fun howMany_2() {
        input.inputln("2 5")

        howMany()

        val result = output.readLines()
        assertThat(result, equalTo(listOf("10")))
    }

    @Test
    fun howMany_3() {
        input.inputln("10 10")

        howMany()

        val result = output.readLines()
        assertThat(result, equalTo(listOf("213")))
    }

    @Test
    fun howMany_4() {
        input.inputln("30 100")

        howMany()

        val result = output.readLines()
        assertThat(result, equalTo(listOf("2471")))
    }

}