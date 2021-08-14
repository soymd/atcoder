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