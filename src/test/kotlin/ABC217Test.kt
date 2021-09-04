import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.AfterEach
import org.junit.jupiter.api.BeforeEach
import org.junit.jupiter.api.Test


class ABC217Test {

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
    fun lexicographicOrder1() {
        input.inputln("abc atcoder")

        lexicographicOrder()

        val result = output.readLines().first()

        assertThat(result, equalTo("Yes"))
    }

    @Test
    fun lexicographicOrder2() {
        input.inputln("arc agc")

        lexicographicOrder()

        val result = output.readLines().first()

        assertThat(result, equalTo("No"))
    }

    @Test
    fun lexicographicOrder3() {
        input.inputln("a aa")

        lexicographicOrder()

        val result = output.readLines().first()

        assertThat(result, equalTo("Yes"))
    }

    @Test
    fun lexicographicOrder4() {
        input.inputln("atcoder abc")

        lexicographicOrder()

        val result = output.readLines().first()

        assertThat(result, equalTo("No"))
    }
}