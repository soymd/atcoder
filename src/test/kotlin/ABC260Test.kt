import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.AfterEach
import org.junit.jupiter.api.BeforeEach
import org.junit.jupiter.api.Nested
import org.junit.jupiter.api.Test

class ABC260Test {
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
            input.inputln("pop")

            abc260a()

            val result = output.readLines()
            assertThat(result, equalTo(listOf("o")))
        }

        @Test
        fun a_2() {
            input.inputln("abc")

            abc260a()

            val result = output.readLines()
            assertThat(result, equalTo(listOf("a")))
        }

        @Test
        fun a_3() {
            input.inputln("xxx")

            abc260a()

            val result = output.readLines()
            assertThat(result, equalTo(listOf("-1")))
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

//         assertThat(result.first().toDouble(), closeTo(2.23606797749978969, 0.0005))
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
            input.inputln("6 1 0 2")
            input.inputln("80 60 80 60 70 70")
            input.inputln("40 20 50 90 90 80")

            abc260b()

            val result = output.readLines()
            assertThat(
                result, equalTo(
                    listOf(
                        "1",
                        "4",
                        "5"
                    )
                )
            )
        }

        @Test
        fun a_2() {
            input.inputln("5 2 1 2")
            input.inputln("0 100 0 100 0")
            input.inputln("0 0 100 100 0")

            abc260b()

            val result = output.readLines()
            assertThat(
                result, equalTo(
                    listOf(
                        "1",
                        "2",
                        "3",
                        "4",
                        "5"
                    )
                )
            )
        }

        @Test
        fun a_3() {
            input.inputln("15 4 3 2")
            input.inputln("30 65 20 95 100 45 70 85 20 35 95 50 40 15 85")
            input.inputln("0 25 45 35 65 70 80 90 40 55 20 20 45 75 100")

            abc260b()

            val result = output.readLines()
            assertThat(
                result, equalTo(
                    listOf(
                        "2",
                        "4",
                        "5",
                        "6",
                        "7",
                        "8",
                        "11",
                        "14",
                        "15"
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