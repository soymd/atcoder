import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.AfterEach
import org.junit.jupiter.api.BeforeEach
import org.junit.jupiter.api.Nested
import org.junit.jupiter.api.Test

class ABC229Test {
    @Nested
    inner class FirstGrid {
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
        fun firstGrid_1() {
            input.inputln("##")
            input.inputln(".#")

            firstGrid()

            val result = output.readLines()
            assertThat(result, equalTo(listOf("Yes")))
        }

        @Test
        fun firstGrid_2() {
            input.inputln(".#")
            input.inputln("#.")

            firstGrid()

            val result = output.readLines()
            assertThat(result, equalTo(listOf("No")))
        }

        @Test
        fun firstGrid_3() {
            input.inputln("##")
            input.inputln("..")

            firstGrid()

            val result = output.readLines()
            assertThat(result, equalTo(listOf("Yes")))
        }
    }

    @Nested
    inner class HardCalculation {
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
        fun `hardCalculation_229 390`() {
            input.inputln("229 390")

            hardCalculation()

            val result = output.readLines()
            assertThat(result, equalTo(listOf("Hard")))
        }

        @Test
        fun `hardCalculation_123456789 9876543210`() {
            input.inputln("123456789 9876543210")

            hardCalculation()

            val result = output.readLines()
            assertThat(result, equalTo(listOf("Easy")))
        }

        @Test
        fun `hardCalculation_9 11`() {
            input.inputln("9 11")

            hardCalculation()

            val result = output.readLines()
            assertThat(result, equalTo(listOf("Hard")))
        }

        @Test
        fun `hardCalculation_11 9`() {
            input.inputln("11 9")

            hardCalculation()

            val result = output.readLines()
            assertThat(result, equalTo(listOf("Hard")))
        }
    }
}