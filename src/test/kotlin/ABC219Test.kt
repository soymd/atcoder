import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.AfterEach
import org.junit.jupiter.api.BeforeEach
import org.junit.jupiter.api.Test


class ABC219Test {

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
    fun neoLexicographicOrdering_1() {
        input.inputln("bacdefghijklmnopqrstuvwxzy")
        input.inputln("4")
        input.inputln("abx")
        input.inputln("bzz")
        input.inputln("bzy")
        input.inputln("caa")

        neoLexicographicOrdering()

        val result = output.readLines()
        assertThat(
            result, equalTo(
                listOf(
                    "bzz",
                    "bzy",
                    "abx",
                    "caa"
                )
            )
        )
    }

    @Test
    fun neoLexicographicOrdering_3() {
        input.inputln("bacdefghijklmnopqrstuvwxzy")
        input.inputln("4")
        input.inputln("a")
        input.inputln("b")
        input.inputln("ba")
        input.inputln("bb")

        neoLexicographicOrdering()

        val result = output.readLines()
        assertThat(
            result, equalTo(
                listOf(
                    "b",
                    "bb",
                    "ba",
                    "a"
                )
            )
        )
    }

    @Test
    fun neoLexicographicOrdering_2() {
        input.inputln("zyxwvutsrqponmlkjihgfedcba")
        input.inputln("5")
        input.inputln("a")
        input.inputln("ab")
        input.inputln("abc")
        input.inputln("ac")
        input.inputln("b")

        neoLexicographicOrdering()

        val result = output.readLines()
        assertThat(
            result, equalTo(
                listOf(
                    "b",
                    "a",
                    "ac",
                    "ab",
                    "abc"
                )
            )
        )
    }

    @Test
    fun maritozzo_1() {
        input.inputln("mari")
        input.inputln("to")
        input.inputln("zzo")
        input.inputln("1321")

        maritozzo()

        val result = output.readLines()
        assertThat(result, equalTo(listOf("marizzotomari")))
    }

    @Test
    fun maritozzo_2() {
        input.inputln("abra")
        input.inputln("cad")
        input.inputln("abra")
        input.inputln("123")

        maritozzo()

        val result = output.readLines()
        assertThat(result, equalTo(listOf("abracadabra")))
    }

    @Test
    fun maritozzo_3() {
        input.inputln("a")
        input.inputln("b")
        input.inputln("c")
        input.inputln("1")

        maritozzo()

        val result = output.readLines()
        assertThat(result, equalTo(listOf("a")))
    }

}