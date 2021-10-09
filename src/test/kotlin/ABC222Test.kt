import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.AfterEach
import org.junit.jupiter.api.BeforeEach
import org.junit.jupiter.api.Test


class ABC222Test {

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
    fun fourDigits_1() {
        input.inputln("321")

        fourDigits()

        val result = output.readLines()
        assertThat(result, equalTo(listOf("0321")))
    }

    @Test
    fun fourDigits_2() {
        input.inputln("7777")

        fourDigits()

        val result = output.readLines()
        assertThat(result, equalTo(listOf("7777")))
    }
}