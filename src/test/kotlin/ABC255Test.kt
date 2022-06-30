import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.hamcrest.Matchers.closeTo
import org.junit.jupiter.api.AfterEach
import org.junit.jupiter.api.BeforeEach
import org.junit.jupiter.api.Nested
import org.junit.jupiter.api.Test

class ABC255Test {
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
            input.inputln("1 2")
            input.inputln("1 0")
            input.inputln("0 1")

            youShouldOutputARCThoughThisIsABC()

            val result = output.readLines()
            assertThat(result, equalTo(listOf("0")))
        }

        @Test
        fun a_2() {
            input.inputln("2 2")
            input.inputln("1 2")
            input.inputln("3 4")

            youShouldOutputARCThoughThisIsABC()

            val result = output.readLines()
            assertThat(result, equalTo(listOf("4")))
        }

        @Test
        fun a_3() {
            input.inputln("2 1")
            input.inputln("90 80")
            input.inputln("70 60")

            youShouldOutputARCThoughThisIsABC()

            val result = output.readLines()
            assertThat(result, equalTo(listOf("70")))
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
            input.inputln("4 2")
            input.inputln("2 3")
            input.inputln("0 0")
            input.inputln("0 1")
            input.inputln("1 2")
            input.inputln("2 0")

            lightItUp()

            val result = output.readLines()

            assertThat(result.first().toDouble(), closeTo(2.23606797749978969, 0.0005))
        }

        @Test
        fun a_2() {
            input.inputln("2 1")
            input.inputln("2")
            input.inputln("-100000 -100000")
            input.inputln("100000 100000")

            lightItUp()

            val result = output.readLines()

            assertThat(result.first().toDouble(), closeTo(282842.712474619009, 0.0005))
        }

        @Test
        fun a_3() {
            input.inputln("8 3")
            input.inputln("2 6 8")
            input.inputln("-17683 17993")
            input.inputln("93038 47074")
            input.inputln("58079 -57520")
            input.inputln("-41515 -89802")
            input.inputln("-72739 68805")
            input.inputln("24324 -73073")
            input.inputln("71049 72103")
            input.inputln("47863 19268")

            lightItUp()

            val result = output.readLines()

            assertThat(result.first().toDouble(), closeTo(130379.280458974768, 0.0005))
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