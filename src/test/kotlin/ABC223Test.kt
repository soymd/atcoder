import org.hamcrest.CoreMatchers.equalTo
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
    fun doukasen_1() {
        input.inputln("3")
        input.inputln("1 1")
        input.inputln("2 1")
        input.inputln("3 1")

        doukasen()

        val result = output.readLines()
        assertThat(result, equalTo(listOf("3.000000000000000")))
    }

    @Test
    fun doukasen_2() {
        input.inputln("3")
        input.inputln("1 3")
        input.inputln("2 2")
        input.inputln("3 1")

        doukasen()

        val result = output.readLines()
        assertThat(result, equalTo(listOf("3.833333333333333")))
    }

    @Test
    fun doukasen_3() {
        input.inputln("5")
        input.inputln("3 9")
        input.inputln("1 2")
        input.inputln("4 6")
        input.inputln("1 5")
        input.inputln("5 3")

        doukasen()

        val result = output.readLines()
        assertThat(result, equalTo(listOf("8.916666666666668")))
    }

    @Test
    fun stringShifting_1() {
        input.inputln("aaba")

        stringShifting()

        val result = output.readLines()
        assertThat(result, equalTo(listOf("aaab", "baaa")))
    }

    @Test
    fun stringShifting_2() {
        input.inputln("z")

        stringShifting()

        val result = output.readLines()
        assertThat(result, equalTo(listOf("z", "z")))
    }

    @Test
    fun stringShifting_3() {
        input.inputln("abracadabra")

        stringShifting()

        val result = output.readLines()
        assertThat(result, equalTo(listOf("aabracadabr", "racadabraab")))
    }
}