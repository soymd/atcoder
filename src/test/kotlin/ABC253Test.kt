import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.AfterEach
import org.junit.jupiter.api.BeforeEach
import org.junit.jupiter.api.Nested
import org.junit.jupiter.api.Test

class ABC253Test {
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
            input.inputln("5 3 2")

            median()

            val result = output.readLines()
            assertThat(result, equalTo(listOf("Yes")))
        }

        @Test
        fun a_2() {
            input.inputln("2 5 3")

            median()

            val result = output.readLines()
            assertThat(result, equalTo(listOf("No")))
        }

        @Test
        fun a_3() {
            input.inputln("100 100 100")

            median()

            val result = output.readLines()
            assertThat(result, equalTo(listOf("Yes")))
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
            input.inputln("2 3")
            input.inputln("--o")
            input.inputln("o--")

            distanceBetweenToken()

            val result = output.readLines()
            assertThat(result, equalTo(listOf("3")))
        }

        @Test
        fun a_2() {
            input.inputln("5 4")
            input.inputln("-o--")
            input.inputln("----")
            input.inputln("----")
            input.inputln("----")
            input.inputln("-o--")

            distanceBetweenToken()

            val result = output.readLines()
            assertThat(result, equalTo(listOf("4")))
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