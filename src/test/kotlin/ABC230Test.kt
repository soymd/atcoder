import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.AfterEach
import org.junit.jupiter.api.BeforeEach
import org.junit.jupiter.api.Nested
import org.junit.jupiter.api.Test

class ABC230Test {
    @Nested
    inner class AtCoderQuiz3 {
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
        fun atCoderQuiz3_0() {
            input.inputln("41")

            atCoderQuiz3()

            val result = output.readLines()
            assertThat(result, equalTo(listOf("AGC041")))
        }

        @Test
        fun atCoderQuiz3_1() {
            input.inputln("42")

            atCoderQuiz3()

            val result = output.readLines()
            assertThat(result, equalTo(listOf("AGC043")))
        }

        @Test
        fun atCoderQuiz3_2() {
            input.inputln("19")

            atCoderQuiz3()

            val result = output.readLines()
            assertThat(result, equalTo(listOf("AGC019")))
        }

        @Test
        fun atCoderQuiz3_3() {
            input.inputln("1")

            atCoderQuiz3()

            val result = output.readLines()
            assertThat(result, equalTo(listOf("AGC001")))
        }

        @Test
        fun atCoderQuiz3_4() {
            input.inputln("50")

            atCoderQuiz3()

            val result = output.readLines()
            assertThat(result, equalTo(listOf("AGC051")))
        }
    }
}