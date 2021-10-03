import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.AfterEach
import org.junit.jupiter.api.BeforeEach
import org.junit.jupiter.api.Test


class ABC221Test {

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
    fun seismicMagnitudeScales_1() {
        input.inputln("6 4")

        seismicMagnitudeScales()

        val result = output.readLines()
        assertThat(result, equalTo(listOf("1024")))
    }

    @Test
    fun seismicMagnitudeScales_2() {
        input.inputln("5 5")

        seismicMagnitudeScales()

        val result = output.readLines()
        assertThat(result, equalTo(listOf("1")))
    }
}