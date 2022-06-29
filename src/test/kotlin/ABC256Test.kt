import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.AfterEach
import org.junit.jupiter.api.BeforeEach
import org.junit.jupiter.api.Nested
import org.junit.jupiter.api.Test

class ABC256Test {
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
            input.inputln("3")

            twoN()

            val result = output.readLines()
            assertThat(result, equalTo(listOf("8")))
        }

        @Test
        fun a_2() {
            input.inputln("30")

            twoN()

            val result = output.readLines()
            assertThat(result, equalTo(listOf("1073741824")))
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
            input.inputln("4")
            input.inputln("1 1 3 2")

            batters()

            val result = output.readLines()
            assertThat(result, equalTo(listOf("3")))
        }

        @Test
        fun a_2() {
            input.inputln("3")
            input.inputln("1 1 1")

            batters()

            val result = output.readLines()
            assertThat(result, equalTo(listOf("0")))
        }

        @Test
        fun a_3() {
            input.inputln("10")
            input.inputln("2 2 4 1 1 1 4 2 2 1")

            batters()

            val result = output.readLines()
            assertThat(result, equalTo(listOf("8")))
        }

        @Test
        fun a_4() {
            input.inputln("10")
            input.inputln("2 2 4 1 1 1 4")

            batters()

            val result = output.readLines()
            assertThat(result, equalTo(listOf("7")))
        }
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
    }
}