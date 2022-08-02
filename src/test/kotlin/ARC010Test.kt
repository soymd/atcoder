import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.AfterEach
import org.junit.jupiter.api.BeforeEach
import org.junit.jupiter.api.Nested
import org.junit.jupiter.api.Test

class ARC010Test {
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
            input.inputln("100 3 0 100")
            input.inputln("10")
            input.inputln("20")
            input.inputln("30")

            arc010a()

            val result = output.readLines()
            assertThat(result, equalTo(listOf("complete")))
        }

        @Test
        fun a_2() {
            input.inputln("100 4 0 100")
            input.inputln("10")
            input.inputln("20")
            input.inputln("30")
            input.inputln("40")

            arc010a()

            val result = output.readLines()
            assertThat(result, equalTo(listOf("complete")))
        }

        @Test
        fun a_3() {
            input.inputln("100 4 0 100")
            input.inputln("50")
            input.inputln("40")
            input.inputln("30")
            input.inputln("20")
            input.inputln("")

            arc010a()

            val result = output.readLines()
            assertThat(result, equalTo(listOf("3")))
        }

        @Test
        fun a_4() {
            input.inputln("100 4 10 100")
            input.inputln("50")
            input.inputln("40")
            input.inputln("30")
            input.inputln("20")

            arc010a()

            val result = output.readLines()
            assertThat(result, equalTo(listOf("complete")))
        }

        @Test
        fun a_5() {
            input.inputln("5 3 20 10")
            input.inputln("15")
            input.inputln("5")
            input.inputln("20")

            arc010a()

            val result = output.readLines()
            assertThat(result, equalTo(listOf("3")))
        }

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