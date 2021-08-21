import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.AfterEach
import org.junit.jupiter.api.BeforeEach
import org.junit.jupiter.api.Test


class ABC215Test {

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
    fun log2N_1() {
        input.inputln("6")

        log2N()

        val result = output.readLines()
        assertThat(result, equalTo(listOf("2")))
    }

    @Test
    fun log2N_2() {
        input.inputln("1")

        log2N()

        val result = output.readLines()
        assertThat(result, equalTo(listOf("0")))
    }


    @Test
    fun log2N_3() {
        input.inputln("1000000000000000000")

        log2N()

        val result = output.readLines()
        assertThat(result, equalTo(listOf("59")))
    }

    @Test
    fun log2N_4() {
        input.inputln("17")

        log2N()

        val result = output.readLines()
        assertThat(result, equalTo(listOf("4")))
    }
}