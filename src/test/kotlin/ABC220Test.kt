import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.AfterEach
import org.junit.jupiter.api.BeforeEach
import org.junit.jupiter.api.Test


class ABC220Test {

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
    fun findMultiple_1() {
        input.inputln("123 456 100")

        findMultiple()

        val result = output.readLines()
        assertThat(result, equalTo(listOf("200")))
    }

    @Test
    fun findMultiple_2() {
        input.inputln("630 940 314")

        findMultiple()

        val result = output.readLines()
        assertThat(result, equalTo(listOf("-1")))
    }
}