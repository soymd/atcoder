import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.AfterEach
import org.junit.jupiter.api.BeforeEach
import org.junit.jupiter.api.Test


class ABC225Test {
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
    fun distinctStrings_1() {
        input.inputln("aba")

        distinctStrings()

        val result = output.readLines()
        assertThat(result, equalTo(listOf("3")))
    }

    @Test
    fun distinctStrings_2() {
        input.inputln("ccc")

        distinctStrings()

        val result = output.readLines()
        assertThat(result, equalTo(listOf("1")))
    }

    @Test
    fun distinctStrings_3() {
        input.inputln("xyz")

        distinctStrings()

        val result = output.readLines()
        assertThat(result, equalTo(listOf("6")))
    }
}