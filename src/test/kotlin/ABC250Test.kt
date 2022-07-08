import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.AfterEach
import org.junit.jupiter.api.BeforeEach
import org.junit.jupiter.api.Nested
import org.junit.jupiter.api.Test

class ABC250Test {
    @Nested
    inner class A {
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
        fun a_1() {
            input.inputln("3 4")
            input.inputln("2 2")

            abc250a()

            val result = output.readLines()
            assertThat(result, equalTo(listOf("4")))
        }

        @Test
        fun a_2() {
            input.inputln("3 4")
            input.inputln("1 3")

            abc250a()

            val result = output.readLines()
            assertThat(result, equalTo(listOf("3")))
        }

        @Test
        fun a_3() {
            input.inputln("3 4")
            input.inputln("3 4")

            abc250a()

            val result = output.readLines()
            assertThat(result, equalTo(listOf("2")))
        }

        @Test
        fun a_4() {
            input.inputln("1 10")
            input.inputln("1 5")

            abc250a()

            val result = output.readLines()
            assertThat(result, equalTo(listOf("2")))
        }

        @Test
        fun a_5() {
            input.inputln("8 1")
            input.inputln("8 1")

            abc250a()

            val result = output.readLines()
            assertThat(result, equalTo(listOf("1")))
        }

        @Test
        fun a_6() {
            input.inputln("1 1")
            input.inputln("1 1")

            abc250a()

            val result = output.readLines()
            assertThat(result, equalTo(listOf("0")))
        }

    }

    @Nested
    inner class B {
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
        fun a_1() {
            input.inputln("4 3 2")

            abc250b()

            val result = output.readLines()
            assertThat(
                result, equalTo(
                    listOf(
                        "..##..##",
                        "..##..##",
                        "..##..##",
                        "##..##..",
                        "##..##..",
                        "##..##..",
                        "..##..##",
                        "..##..##",
                        "..##..##",
                        "##..##..",
                        "##..##..",
                        "##..##.."
                    )
                )
            )
        }

        @Test
        fun a_2() {
            input.inputln("5 1 5")

            abc250b()

            val result = output.readLines()
            assertThat(
                result, equalTo(
                    listOf(
                        ".....#####.....#####.....",
                        "#####.....#####.....#####",
                        ".....#####.....#####.....",
                        "#####.....#####.....#####",
                        ".....#####.....#####....."
                    )
                )
            )
        }

        @Test
        fun a_3() {
            input.inputln("4 4 1")

            abc250b()

            val result = output.readLines()
            assertThat(
                result, equalTo(
                    listOf(
                        ".#.#",
                        ".#.#",
                        ".#.#",
                        ".#.#",
                        "#.#.",
                        "#.#.",
                        "#.#.",
                        "#.#.",
                        ".#.#",
                        ".#.#",
                        ".#.#",
                        ".#.#",
                        "#.#.",
                        "#.#.",
                        "#.#.",
                        "#.#."
                    )
                )
            )
        }

        @Test
        fun a_4() {
            input.inputln("1 4 4")

            abc250b()

            val result = output.readLines()
            assertThat(
                result, equalTo(
                    listOf(
                        "....",
                        "....",
                        "....",
                        "...."
                    )
                )
            )
        }
//
//        @Test
//        fun a_5() {
//            input.inputln("")
//
//            //()
//
//            val result = output.readLines()
//            assertThat(result, equalTo(listOf("")))
//        }
    }

    @Nested
    inner class C {
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
        fun a_1() {
            input.inputln("")

            //()

            val result = output.readLines()
            assertThat(result, equalTo(listOf("")))
        }

        @Test
        fun a_2() {
            input.inputln("")

            //()

            val result = output.readLines()
            assertThat(result, equalTo(listOf("")))
        }

        @Test
        fun a_3() {
            input.inputln("")

            //()

            val result = output.readLines()
            assertThat(result, equalTo(listOf("")))
        }

//        @Test
//        fun a_4() {
//            input.inputln("")
//
//            //()
//
//            val result = output.readLines()
//            assertThat(result, equalTo(listOf("")))
//        }
//
//        @Test
//        fun a_5() {
//            input.inputln("")
//
//            //()
//
//            val result = output.readLines()
//            assertThat(result, equalTo(listOf("")))
//        }
    }
}