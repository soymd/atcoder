import org.hamcrest.CoreMatchers
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.AfterEach
import org.junit.jupiter.api.BeforeEach
import org.junit.jupiter.api.Test


class ABC223Test {

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
    fun stringShifting_1() {
        input.inputln("aaba")

        stringShifting()

        val result = output.readLines()
        assertThat(result, CoreMatchers.equalTo(listOf("aaab", "baaa")))
    }

    @Test
    fun stringShifting_2() {
        input.inputln("z")

        stringShifting()

        val result = output.readLines()
        assertThat(result, CoreMatchers.equalTo(listOf("z", "z")))
    }

    @Test
    fun stringShifting_3() {
        input.inputln("abracadabra")

        stringShifting()

        val result = output.readLines()
        assertThat(result, CoreMatchers.equalTo(listOf("aabracadabr", "racadabraab")))
    }
}