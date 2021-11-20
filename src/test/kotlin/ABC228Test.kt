import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.AfterEach
import org.junit.jupiter.api.BeforeEach
import org.junit.jupiter.api.Nested
import org.junit.jupiter.api.Test

class ABC228Test {
    @Nested
    inner class TakahashisSecret {
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
        fun takahashisSecret_a() {
            input.inputln("4 2")
            input.inputln("3 1 1 2")

            takahashisSecret()

            val result = output.readLines()
            assertThat(result, equalTo(listOf("3")))
        }

        @Test
        fun takahashisSecret_b() {
            input.inputln("20 12")
            input.inputln("7 11 10 1 7 20 14 2 17 3 2 5 19 20 8 14 18 2 10 10")

            takahashisSecret()

            val result = output.readLines()
            assertThat(result, equalTo(listOf("7")))
        }
    }

    @Nested
    inner class OnAndOff {
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
        fun onAndOff_a() {
            input.inputln("20 21 20")

            onAndOff()

            val result = output.readLines()
            assertThat(result, equalTo(listOf("Yes")))
        }

        @Test
        fun onAndOff_b() {
            input.inputln("20 21 20")

            onAndOff()

            val result = output.readLines()
            assertThat(result, equalTo(listOf("Yes")))
        }

        @Test
        fun onAndOff_c() {
            input.inputln("0 1 0")

            onAndOff()

            val result = output.readLines()
            assertThat(result, equalTo(listOf("Yes")))
        }

        @Test
        fun onAndOff_d() {
            input.inputln("0 1 1")

            onAndOff()

            val result = output.readLines()
            assertThat(result, equalTo(listOf("No")))
        }

        @Test
        fun onAndOff_e() {
            input.inputln("0 1 23")

            onAndOff()

            val result = output.readLines()
            assertThat(result, equalTo(listOf("No")))
        }

        @Test
        fun onAndOff_f() {
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
            assertThat(result, equalTo(listOf("Yes")))
        }

        @Test
        fun `onAndOff_23 0 0`() {
            input.inputln("23 0 0")

            onAndOff()

            val result = output.readLines()
            assertThat(result, equalTo(listOf("No")))
        }

        @Test
        fun onAndOff_g() {
            input.inputln("0 23 23")

            onAndOff()

            val result = output.readLines()
            assertThat(result, equalTo(listOf("No")))
        }

        @Test
        fun onAndOff_h() {
            input.inputln("1 0 23")

            onAndOff()

            val result = output.readLines()
            assertThat(result, equalTo(listOf("Yes")))
        }

        @Test
        fun onAndOff_i() {
            input.inputln("23 0 0")

            onAndOff()

            val result = output.readLines()
            assertThat(result, equalTo(listOf("No")))
        }

        @Test
        fun onAndOff_j() {
            input.inputln("23 0 23")

            onAndOff()

            val result = output.readLines()
            assertThat(result, equalTo(listOf("Yes")))
        }

        @Test
        fun onAndOff_k() {
            input.inputln("0 23 22")

            onAndOff()

            val result = output.readLines()
            assertThat(result, equalTo(listOf("Yes")))
        }

        @Test
        fun onAndOff_l() {
            input.inputln("23 0 22")

            onAndOff()

            val result = output.readLines()
            assertThat(result, equalTo(listOf("No")))
        }

        @Test
        fun onAndOff_m() {
            input.inputln("1 0 1")

            onAndOff()

            val result = output.readLines()
            assertThat(result, equalTo(listOf("Yes")))
        }


        @Test
        fun onAndOff_p() {
            input.inputln("1 0 2")

            onAndOff()

            val result = output.readLines()
            assertThat(result, equalTo(listOf("Yes")))
        }

        @Test
        fun onAndOff_q() {
            input.inputln("1 0 23")

            onAndOff()

            val result = output.readLines()
            assertThat(result, equalTo(listOf("Yes")))
        }

        @Test
        fun onAndOff_r() {
            input.inputln("23 22 0")

            onAndOff()

            val result = output.readLines()
            assertThat(result, equalTo(listOf("Yes")))
        }

        @Test
        fun onAndOff_s() {
            input.inputln("23 22 22")

            onAndOff()

            val result = output.readLines()
            assertThat(result, equalTo(listOf("No")))
        }

        @Test
        fun onAndOff_t() {
            input.inputln("23 22 23")

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