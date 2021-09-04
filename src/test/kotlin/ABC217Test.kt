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
    fun inverseOfPermutation1() {
        input.inputln("3")
        input.inputln("2 3 1")

        inverseOfPermutation()

        val result = output.readLines().first()

        assertThat(result, equalTo("3 1 2"))
    }

    @Test
    fun inverseOfPermutation2() {
        input.inputln("3")
        input.inputln("1 2 3")

        inverseOfPermutation()

        val result = output.readLines().first()

        assertThat(result, equalTo("1 2 3"))
    }

    @Test
    fun inverseOfPermutation3() {
        input.inputln("5")
        input.inputln("5 3 2 4 1")

        inverseOfPermutation()

        val result = output.readLines().first()

        assertThat(result, equalTo("5 3 2 4 1"))
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