import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.AfterEach
import org.junit.jupiter.api.BeforeEach
import org.junit.jupiter.api.Nested
import org.junit.jupiter.api.Test

class ABC251Test {
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
            input.inputln("abc")

            abc251a()

            val result = output.readLines()
            assertThat(result, equalTo(listOf("abcabc")))
        }

        @Test
        fun a_2() {
            input.inputln("zz")

            abc251a()

            val result = output.readLines()
            assertThat(result, equalTo(listOf("zzzzzz")))
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
            input.inputln("2 10")
            input.inputln("1 3")

            abc251b()

            val result = output.readLines()
            assertThat(result, equalTo(listOf("3")))
        }

        @Test
        fun a_2() {
            input.inputln("2 1")
            input.inputln("2 3")

            abc251b()

            val result = output.readLines()
            assertThat(result, equalTo(listOf("0")))
        }

        @Test
        fun a_3() {
            input.inputln("4 12")
            input.inputln("3 3 3 3")

            abc251b()

            val result = output.readLines()
            assertThat(result, equalTo(listOf("3")))
        }

        @Test
        fun a_4() {
            input.inputln("7 251")
            input.inputln("202 20 5 1 4 2 100")

            abc251b()

            val result = output.readLines()
            assertThat(result, equalTo(listOf("48")))
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
            input.inputln("3")
            input.inputln("aaa 10")
            input.inputln("bbb 20")
            input.inputln("aaa 30")

            abc251c()

            val result = output.readLines()
            assertThat(result, equalTo(listOf("2")))
        }

        @Test
        fun a_2() {
            input.inputln("5")
            input.inputln("aaa 9")
            input.inputln("bbb 10")
            input.inputln("ccc 10")
            input.inputln("ddd 10")
            input.inputln("bbb 11")

            abc251c()

            val result = output.readLines()
            assertThat(result, equalTo(listOf("2")))
        }

        @Test
        fun a_3() {
            input.inputln("10")
            input.inputln("bb 3")
            input.inputln("ba 1")
            input.inputln("aa 4")
            input.inputln("bb 1")
            input.inputln("ba 5")
            input.inputln("aa 9")
            input.inputln("aa 2")
            input.inputln("ab 6")
            input.inputln("bb 5")
            input.inputln("ab 3")

            abc251c()

            val result = output.readLines()
            assertThat(result, equalTo(listOf("8")))
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