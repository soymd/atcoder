import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.AfterEach
import org.junit.jupiter.api.BeforeEach
import org.junit.jupiter.api.Nested
import org.junit.jupiter.api.Test


class Typical90Test {
    @Nested
    class EncyclopediaOfParentheses {
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
        fun encyclopediaOfParentheses_1() {
            input.inputln("2")

            encyclopediaOfParentheses()

            val result = output.readLines()
            assertThat(result, equalTo(listOf("()")))
        }

        @Test
        fun encyclopediaOfParentheses_2() {
            input.inputln("3")

            encyclopediaOfParentheses()

            val result = output.readLines()
            assertThat(result, equalTo(emptyList()))
        }

        @Test
        fun encyclopediaOfParentheses_3() {
            input.inputln("4")

            encyclopediaOfParentheses()

            val result = output.readLines()
            assertThat(result, equalTo(listOf("(())", "()()")))
        }

        @Test
        fun encyclopediaOfParentheses_6() {
            input.inputln("6")

            encyclopediaOfParentheses()

            val result = output.readLines()
            assertThat(
                result, equalTo(
                    listOf(
                        "((()))",
                        "(()())",
                        "(())()",
                        "()(())",
                        "()()()"
                    )
                )
            )
        }

        @Test
        fun encyclopediaOfParentheses_4() {
            input.inputln("10")

            encyclopediaOfParentheses()

            val result = output.readLines()
            assertThat(
                result,
                equalTo(
                    listOf(
                        "((((()))))",
                        "(((()())))",
                        "(((())()))",
                        "(((()))())",
                        "(((())))()",
                        "((()(())))",
                        "((()()()))",
                        "((()())())",
                        "((()()))()",
                        "((())(()))",
                        "((())()())",
                        "((())())()",
                        "((()))(())",
                        "((()))()()",
                        "(()((())))",
                        "(()(()()))",
                        "(()(())())",
                        "(()(()))()",
                        "(()()(()))",
                        "(()()()())",
                        "(()()())()",
                        "(()())(())",
                        "(()())()()",
                        "(())((()))",
                        "(())(()())",
                        "(())(())()",
                        "(())()(())",
                        "(())()()()",
                        "()(((())))",
                        "()((()()))",
                        "()((())())",
                        "()((()))()",
                        "()(()(()))",
                        "()(()()())",
                        "()(()())()",
                        "()(())(())",
                        "()(())()()",
                        "()()((()))",
                        "()()(()())",
                        "()()(())()",
                        "()()()(())",
                        "()()()()()"
                    )
                )
            )
        }
    }

    @Nested
    class YokanParty {
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
        fun yokanParty_1() {
            input.inputln("3 34")
            input.inputln("1")
            input.inputln("8 13 26")

            yokanParty()

            val result = output.readLines()
            assertThat(result, equalTo(listOf("13")))
        }

        @Test
        fun yokanParty_2() {
            input.inputln("7 45")
            input.inputln("2")
            input.inputln("7 11 16 20 28 34 38")

            yokanParty()

            val result = output.readLines()
            assertThat(result, equalTo(listOf("12")))
        }

        @Test
        fun yokanParty_3() {
            input.inputln("3 100")
            input.inputln("1")
            input.inputln("28 54 81")

            yokanParty()

            val result = output.readLines()
            assertThat(result, equalTo(listOf("46")))
        }

        @Test
        fun yokanParty_4() {
            input.inputln("3 100")
            input.inputln("2")
            input.inputln("28 54 81")

            yokanParty()

            val result = output.readLines()
            assertThat(result, equalTo(listOf("26")))
        }

        @Test
        fun yokanParty_5() {
            input.inputln("20 1000")
            input.inputln("4")
            input.inputln("51 69 102 127 233 295 350 388 417 466 469 523 553 587 720 739 801 855 926 954")

            yokanParty()

            val result = output.readLines()
            assertThat(result, equalTo(listOf("170")))
        }
    }
}