import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.AfterEach
import org.junit.jupiter.api.BeforeEach
import org.junit.jupiter.api.Nested
import org.junit.jupiter.api.Test

class ABC230Test {
    @Nested
    inner class XDrawing {
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
        fun xDrawing_1() {
            input.inputln("5 3 2")//n, a, b
            input.inputln("1 5 1 5")//p, q, r, s

            xDrawing()

            val result = output.readLines()
            assertThat(
                result, equalTo(
                    listOf(
                        "...#.",
                        "#.#..",
                        ".#...",
                        "#.#..",
                        "...#."
                    )
                )
            )
        }

        @Test
        fun xDrawing_2() {
            input.inputln("5 3 3")
            input.inputln("4 5 2 5")

            xDrawing()

            val result = output.readLines()
            assertThat(
                result, equalTo(
                    listOf(
                        "#.#.",
                        "...#"
                    )
                )
            )
        }

        @Test
        fun xDrawing_3() {
            input.inputln("1000000000000000000 999999999999999999 999999999999999999")
            input.inputln("999999999999999998 1000000000000000000 999999999999999998 1000000000000000000")

            xDrawing()

            val result = output.readLines()
            assertThat(
                result, equalTo(
                    listOf(
                        "#.#",
                        ".#.",
                        "#.#"
                    )
                )
            )
        }
    }

    @Nested
    inner class TripleMetre {
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
        fun tripleMetre_xoxxoxxo() {
            input.inputln("xoxxoxxo")

            tripleMetre()

            val result = output.readLines()
            assertThat(result, equalTo(listOf("Yes")))
        }

        @Test
        fun tripleMetre_xxoxxoxo() {
            input.inputln("xxoxxoxo")

            tripleMetre()

            val result = output.readLines()
            assertThat(result, equalTo(listOf("No")))
        }

        @Test
        fun tripleMetre_o() {
            input.inputln("o")

            tripleMetre()

            val result = output.readLines()
            assertThat(result, equalTo(listOf("Yes")))
        }

        @Test
        fun tripleMetre_ox() {
            input.inputln("ox")

            tripleMetre()

            val result = output.readLines()
            assertThat(result, equalTo(listOf("Yes")))
        }

        @Test
        fun tripleMetre_x() {
            input.inputln("x")

            tripleMetre()

            val result = output.readLines()
            assertThat(result, equalTo(listOf("Yes")))
        }

        @Test
        fun tripleMetre_oo() {
            input.inputln("oo")

            tripleMetre()

            val result = output.readLines()
            assertThat(result, equalTo(listOf("No")))
        }

        @Test
        fun tripleMetre_xxxxxxxx() {
            input.inputln("xxxxxxxx")

            tripleMetre()

            val result = output.readLines()
            assertThat(result, equalTo(listOf("No")))
        }
    }

    @Nested
    inner class AtCoderQuiz3 {
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
        fun atCoderQuiz3_0() {
            input.inputln("41")

            atCoderQuiz3()

            val result = output.readLines()
            assertThat(result, equalTo(listOf("AGC041")))
        }

        @Test
        fun atCoderQuiz3_1() {
            input.inputln("42")

            atCoderQuiz3()

            val result = output.readLines()
            assertThat(result, equalTo(listOf("AGC043")))
        }

        @Test
        fun atCoderQuiz3_2() {
            input.inputln("19")

            atCoderQuiz3()

            val result = output.readLines()
            assertThat(result, equalTo(listOf("AGC019")))
        }

        @Test
        fun atCoderQuiz3_3() {
            input.inputln("1")

            atCoderQuiz3()

            val result = output.readLines()
            assertThat(result, equalTo(listOf("AGC001")))
        }

        @Test
        fun atCoderQuiz3_4() {
            input.inputln("50")

            atCoderQuiz3()

            val result = output.readLines()
            assertThat(result, equalTo(listOf("AGC051")))
        }
    }
}