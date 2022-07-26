import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.AfterEach
import org.junit.jupiter.api.BeforeEach
import org.junit.jupiter.api.Nested
import org.junit.jupiter.api.Test

class ABC261Test {
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
            input.inputln("0 3 1 5")

            abc261a()

            val result = output.readLines()
            assertThat(result, equalTo(listOf("2")))
        }

        @Test
        fun a_2() {
            input.inputln("0 1 4 5")

            abc261a()

            val result = output.readLines()
            assertThat(result, equalTo(listOf("0")))
        }

        @Test
        fun a_3() {
            input.inputln("0 3 3 7")

            abc261a()

            val result = output.readLines()
            assertThat(result, equalTo(listOf("0")))
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
            input.inputln("5")
            input.inputln("newfile")
            input.inputln("newfile")
            input.inputln("newfolder")
            input.inputln("newfile")
            input.inputln("newfolder")

            abc261c()

            val result = output.readLines()
            assertThat(
                result, equalTo(
                    listOf(
                        "newfile",
                        "newfile(1)",
                        "newfolder",
                        "newfile(2)",
                        "newfolder(1)"
                    )
                )
            )
        }

        @Test
        fun a_2() {
            input.inputln("11")
            input.inputln("a")
            input.inputln("a")
            input.inputln("a")
            input.inputln("a")
            input.inputln("a")
            input.inputln("a")
            input.inputln("a")
            input.inputln("a")
            input.inputln("a")
            input.inputln("a")
            input.inputln("a")

            abc261c()

            val result = output.readLines()
            assertThat(
                result, equalTo(
                    listOf(
                        "a",
                        "a(1)",
                        "a(2)",
                        "a(3)",
                        "a(4)",
                        "a(5)",
                        "a(6)",
                        "a(7)",
                        "a(8)",
                        "a(9)",
                        "a(10)"
                    )
                )
            )
        }

        @Test
        fun a_3() {
            input.inputln("")

            // abc261c()

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