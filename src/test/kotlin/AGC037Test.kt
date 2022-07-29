import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.AfterEach
import org.junit.jupiter.api.BeforeEach
import org.junit.jupiter.api.Nested
import org.junit.jupiter.api.Test

class AGC037Test {
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
            input.inputln("aabbaa")
            // aa,b,ba,a
            // a,ab,ba,a

            agc037a()

            val result = output.readLines()
            assertThat(result, equalTo(listOf("4")))
        }

        @Test
        fun a_2() {
            input.inputln("aaaccacabaababc")
            //a,aa,c,ca,c,a,b,a,ab,a,b,c

            agc037a()

            val result = output.readLines()
            assertThat(result, equalTo(listOf("12")))
        }

        @Test
        fun a_aab() {
            input.inputln("aab")

            agc037a()

            val result = output.readLines()
            assertThat(result, equalTo(listOf("2")))
        }

        @Test
        fun a_aaab() {
            input.inputln("aaab")
            //a,aa,b

            agc037a()

            val result = output.readLines()
            assertThat(result, equalTo(listOf("3")))
        }

        @Test
        fun a_aaaab() {
            input.inputln("aaaab")
            //a,aa,a,b

            agc037a()

            val result = output.readLines()
            assertThat(result, equalTo(listOf("4")))
        }

        @Test
        fun a_aaaaab() {
            input.inputln("aaaaab")
            //a,aa,a,ab
            //aa,a,aa,b

            agc037a()

            val result = output.readLines()
            assertThat(result, equalTo(listOf("4")))
        }

        @Test
        fun a_aaaaaab() {
            input.inputln("aaaaaab")
            //aaaaaab
            //a,aa,a,aa,b

            agc037a()

            val result = output.readLines()
            assertThat(result, equalTo(listOf("5")))
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