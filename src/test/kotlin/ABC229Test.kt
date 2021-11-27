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
        fun `onAndOff_20 21 20`() {
            input.inputln("20 21 20")

            onAndOff()

            val result = output.readLines()
            assertThat(result, equalTo(listOf("Yes")))
        }

        @Test
        fun `onAndOff_0 1 0`() {
            input.inputln("0 1 0")

            onAndOff()

            val result = output.readLines()
            assertThat(result, equalTo(listOf("Yes")))
        }

        @Test
        fun `onAndOff_0 1 1`() {
            input.inputln("0 1 1")

            onAndOff()

            val result = output.readLines()
            assertThat(result, equalTo(listOf("No")))
        }

        @Test
        fun `onAndOff_0 1 23`() {
            input.inputln("0 1 23")

            onAndOff()

            val result = output.readLines()
            assertThat(result, equalTo(listOf("No")))
        }

        @Test
        fun `onAndOff_1 0 0`() {
            input.inputln("1 0 0")

            onAndOff()

            val result = output.readLines()
            assertThat(result, equalTo(listOf("No")))
        }

        @Test
        fun `onAndOff_2 0 0`() {
            input.inputln("2 0 0")

            onAndOff()

            val result = output.readLines()
            assertThat(result, equalTo(listOf("No")))
        }

        @Test
        fun `onAndOff_12 0 0`() {
            input.inputln("12 0 0")

            onAndOff()

            val result = output.readLines()
            assertThat(result, equalTo(listOf("No")))
        }

        @Test
        fun `onAndOff_11 0 0`() {
            input.inputln("11 0 0")

            onAndOff()

            val result = output.readLines()
            assertThat(result, equalTo(listOf("No")))
        }

        @Test
        fun `onAndOff_23 0 0`() {
            input.inputln("23 0 0")

            onAndOff()

            val result = output.readLines()
            assertThat(result, equalTo(listOf("No")))
        }

        @Test
        fun `onAndOff_22 0 0`() {
            input.inputln("22 0 0")

            onAndOff()

            val result = output.readLines()
            assertThat(result, equalTo(listOf("No")))
        }

        @Test
        fun `onAndOff_0 23 23`() {
            input.inputln("0 23 23")

            onAndOff()

            val result = output.readLines()
            assertThat(result, equalTo(listOf("No")))
        }

        @Test
        fun `onAndOff_1 0 23`() {
            input.inputln("1 0 23")

            onAndOff()

            val result = output.readLines()
            assertThat(result, equalTo(listOf("Yes")))
        }

        @Test
        fun `onAndOff_23 0 23`() {
            input.inputln("23 0 23")

            onAndOff()

            val result = output.readLines()
            assertThat(result, equalTo(listOf("Yes")))
        }

        @Test
        fun `onAndOff_0 23 22`() {
            input.inputln("0 23 22")

            onAndOff()

            val result = output.readLines()
            assertThat(result, equalTo(listOf("Yes")))
        }

        @Test
        fun `onAndOff_23 0 22`() {
            input.inputln("23 0 22")

            onAndOff()

            val result = output.readLines()
            assertThat(result, equalTo(listOf("No")))
        }

        @Test
        fun `onAndOff_1 0 1`() {
            input.inputln("1 0 1")

            onAndOff()

            val result = output.readLines()
            assertThat(result, equalTo(listOf("Yes")))
        }


        @Test
        fun `onAndOff_1 0 2`() {
            input.inputln("1 0 2")

            onAndOff()

            val result = output.readLines()
            assertThat(result, equalTo(listOf("Yes")))
        }

        @Test
        fun `onAndOff_23 22 0`() {
            input.inputln("23 22 0")

            onAndOff()

            val result = output.readLines()
            assertThat(result, equalTo(listOf("Yes")))
        }

        @Test
        fun `onAndOff_23 22 22`() {
            input.inputln("23 22 22")

            onAndOff()

            val result = output.readLines()
            assertThat(result, equalTo(listOf("No")))
        }

        @Test
        fun `onAndOff_23 22 23`() {
            input.inputln("23 22 23")

            onAndOff()

            val result = output.readLines()
            assertThat(result, equalTo(listOf("Yes")))
        }

        @Test
        fun `onAndOff_23 22 1`() {
            input.inputln("23 22 1")

            onAndOff()

            val result = output.readLines()
            assertThat(result, equalTo(listOf("Yes")))
        }

        @Test
        fun `onAndOff_23 22 2`() {
            input.inputln("23 22 2")

            onAndOff()

            val result = output.readLines()
            assertThat(result, equalTo(listOf("Yes")))
        }

        @Test
        fun onAndOff_1() {
            input.inputln("7 20 12")

            onAndOff()

            val result = output.readLines()
            assertThat(result, equalTo(listOf("Yes")))
        }

        @Test
        fun onAndOff_2() {
            input.inputln("20 7 12")

            onAndOff()

            val result = output.readLines()
            assertThat(result, equalTo(listOf("No")))
        }

        @Test
        fun onAndOff_3() {
            input.inputln("23 0 23")

            onAndOff()

            val result = output.readLines()
            assertThat(result, equalTo(listOf("Yes")))
        }
    }
}