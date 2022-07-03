import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.AfterEach
import org.junit.jupiter.api.BeforeEach
import org.junit.jupiter.api.Nested
import org.junit.jupiter.api.Test

class ABC254Test {
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
            input.inputln("254")

            lastTwoDigits()

            val result = output.readLines()
            assertThat(result, equalTo(listOf("54")))
        }

        @Test
        fun a_2() {
            input.inputln("101")

            lastTwoDigits()

            val result = output.readLines()
            assertThat(result, equalTo(listOf("01")))
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
            input.inputln("1")

            practicalComputing()

            val result = output.readLines()
            assertThat(result, equalTo(listOf("1")))
        }

        @Test
        fun a_3() {
            input.inputln("3")

            practicalComputing()

            val result = output.readLines()
            assertThat(
                result, equalTo(
                    listOf(
                        "1",
                        "1 1",
                        "1 2 1"
                    )
                )
            )
        }

        @Test
        fun a_4() {
            input.inputln("4")

            practicalComputing()

            val result = output.readLines()
            assertThat(
                result, equalTo(
                    listOf(
                        "1",
                        "1 1",
                        "1 2 1",
                        "1 3 3 1"
                    )
                )
            )
        }

        @Test
        fun a_5() {
            input.inputln("5")

            practicalComputing()

            val result = output.readLines()
            assertThat(
                result, equalTo(
                    listOf(
                        "1",
                        "1 1",
                        "1 2 1",
                        "1 3 3 1",
                        "1 4 6 4 1"
                    )
                )
            )
        }

        @Test
        fun a_6() {
            input.inputln("6")

            practicalComputing()

            val result = output.readLines()
            assertThat(
                result, equalTo(
                    listOf(
                        "1",
                        "1 1",
                        "1 2 1",
                        "1 3 3 1",
                        "1 4 6 4 1",
                        "1 5 10 10 5 1"
                    )
                )
            )
        }

        @Test
        fun a_10() {
            input.inputln("10")

            practicalComputing()

            val result = output.readLines()
            assertThat(
                result, equalTo(
                    listOf(
                        "1",
                        "1 1",
                        "1 2 1",
                        "1 3 3 1",
                        "1 4 6 4 1",
                        "1 5 10 10 5 1",
                        "1 6 15 20 15 6 1",
                        "1 7 21 35 35 21 7 1",
                        "1 8 28 56 70 56 28 8 1",
                        "1 9 36 84 126 126 84 36 9 1"
                    )
                )
            )
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