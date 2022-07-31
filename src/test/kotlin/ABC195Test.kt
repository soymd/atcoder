import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.AfterEach
import org.junit.jupiter.api.BeforeEach
import org.junit.jupiter.api.Nested
import org.junit.jupiter.api.Test

class ABC195Test {
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
            input.inputln("1010")

            abc195c()

            val result = output.readLines()
            assertThat(result, equalTo(listOf("11")))
        }

        @Test
        fun a_2() {
            input.inputln("27182818284590")

            abc195c()

            val result = output.readLines()
            assertThat(result, equalTo(listOf("107730272137364")))
        }

        @Test
        fun a_999() {
            input.inputln("999")

            abc195c()

            val result = output.readLines()
            assertThat(result, equalTo(listOf("0")))
        }

        @Test
        fun a_1000() {
            input.inputln("1000")

            abc195c()

            val result = output.readLines()
            assertThat(result, equalTo(listOf("1")))
        }

        @Test
        fun a_999999() {
            input.inputln("999999")

            abc195c()

            val result = output.readLines()
            assertThat(result, equalTo(listOf("999000")))
        }

        @Test
        fun a_1000000() {
            input.inputln("1000000")

            abc195c()

            val result = output.readLines()
            assertThat(result, equalTo(listOf("999002")))
        }

        @Test
        fun a_1000001() {
            input.inputln("1000001")

            abc195c()

            val result = output.readLines()
            assertThat(result, equalTo(listOf("999004")))
        }

        @Test
        fun a_999999999() {
            input.inputln("999999999")

            abc195c()

            val result = output.readLines()
            assertThat(result, equalTo(listOf("1998999000")))
        }

        @Test
        fun a_1000000000() {
            input.inputln("1000000000")

            abc195c()

            val result = output.readLines()
            val expected = 1998999000 + 3
            assertThat(result, equalTo(listOf(expected.toString())))
        }

        @Test
        fun a_9999999999() {
            input.inputln("999999999999")

            abc195c()

            val result = output.readLines()
            assertThat(result, equalTo(listOf("2998998999000")))
        }

        @Test
        fun a_10000000000() {
            input.inputln("1000000000000")

            abc195c()

            val result = output.readLines()
            val expected = 2998998999000 + 4
            assertThat(result, equalTo(listOf(expected.toString())))
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