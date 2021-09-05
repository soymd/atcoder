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
    fun cuttingWoods1() {
        input.inputln("5 3")
        input.inputln("2 2")
        input.inputln("1 3")
        input.inputln("2 2")

        cuttingWoods()

        val result = output.readLines()

        assertThat(result, equalTo(listOf("5", "3")))
    }

    @Test
    fun cuttingWoods2() {
        input.inputln("5 3")
        input.inputln("1 2")
        input.inputln("1 4")
        input.inputln("2 3")

        cuttingWoods()

        val result = output.readLines()

        assertThat(result, equalTo(listOf("2")))
    }

    @Test
    fun cuttingWoods3() {
        input.inputln("100 10")
        input.inputln("1 31")
        input.inputln("2 41")
        input.inputln("1 59")
        input.inputln("2 26")
        input.inputln("1 53")
        input.inputln("2 58")
        input.inputln("1 97")
        input.inputln("2 93")
        input.inputln("1 23")
        input.inputln("2 84")

        cuttingWoods()

        val result = output.readLines()

        assertThat(result, equalTo(listOf("69", "31", "6", "38", "38")))
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