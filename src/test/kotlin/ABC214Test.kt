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
    fun output_test() {
        input.inputln("foo")
        input.inputln("bar")

        output()

        val result = output.readLines()
        assertThat(result[0], equalTo("foo"))
        assertThat(result[1], equalTo("bar"))
        assertThat(result[2], equalTo("foobar"))
    }

}