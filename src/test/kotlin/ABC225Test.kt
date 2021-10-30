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
    fun starOrNot_1() {
        input.inputln("5")
        input.inputln("1 4")
        input.inputln("2 4")
        input.inputln("3 4")
        input.inputln("4 5")

        starOrNot()

        val result = output.readLines()
        assertThat(result, equalTo(listOf("Yes")))
    }

    @Test
    fun starOrNot_2() {
        input.inputln("4")
        input.inputln("2 4")
        input.inputln("1 4")
        input.inputln("2 3")

        starOrNot()

        val result = output.readLines()
        assertThat(result, equalTo(listOf("No")))
    }

    @Test
    fun starOrNot_3() {
        input.inputln("10")
        input.inputln("9 10")
        input.inputln("3 10")
        input.inputln("4 10")
        input.inputln("8 10")
        input.inputln("1 10")
        input.inputln("2 10")
        input.inputln("7 10")
        input.inputln("6 10")
        input.inputln("5 10")

        starOrNot()

        val result = output.readLines()
        assertThat(result, equalTo(listOf("Yes")))
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