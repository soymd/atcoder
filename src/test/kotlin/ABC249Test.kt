import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.AfterEach
import org.junit.jupiter.api.BeforeEach
import org.junit.jupiter.api.Nested
import org.junit.jupiter.api.Test

class ABC249Test {
    @Nested
    inner class A {
        private val input = StandardInputStream()
        private val output = StandardOutputStream()

        @BeforeEach
        fun setUp() {
            for (i in 0..10) {
                println(i)
            }
            for (i in 0 until 10) {
                println(i)
            }
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
            input.inputln("4 3 3 6 2 5 10")

            abc249a()

            val result = output.readLines()
            assertThat(result, equalTo(listOf("Takahashi")))
        }

        @Test
        fun a_2() {
            input.inputln("3 1 4 1 5 9 2")

            abc249a()

            val result = output.readLines()
            assertThat(result, equalTo(listOf("Aoki")))
        }

        @Test
        fun a_3() {
            input.inputln("1 1 1 1 1 1 1")

            abc249a()

            val result = output.readLines()
            assertThat(result, equalTo(listOf("Draw")))
        }

        @Test
        fun a_4() {
            input.inputln("1 2 1 1 1 1 1")

            abc249a()

            val result = output.readLines()
            assertThat(result, equalTo(listOf("Takahashi")))
        }

        @Test
        fun a_5() {
            input.inputln("10 5 10 5 10 1 12")

            abc249a()

            val result = output.readLines()
            assertThat(result, equalTo(listOf("Aoki")))
        }

        @Test
        fun a_6() {
            input.inputln("11 1 10 1 4 1 3")

            abc249a()

            val result = output.readLines()
            assertThat(result, equalTo(listOf("Aoki")))
        }

        @Test
        fun a_7() {
            input.inputln("4 2 5 1 4 4 5")

            abc249a()

            val result = output.readLines()
            assertThat(result, equalTo(listOf("Takahashi")))
        }

        @Test
        fun a_8() {
            input.inputln("10 36 14 8 48 20 90")

            abc249a()

            val result = output.readLines()
            assertThat(result, equalTo(listOf("Draw")))
        }

        // @Test
        // fun a_random() {
        //
        //     do {
        //         // val a = (1..5).random()
        //         // val b = (1..5).random()
        //         // val c = (1..5).random()
        //         // val d = (1..5).random()
        //         // val e = (1..5).random()
        //         // val f = (1..5).random()
        //         // val x = (1..5).random()
        //         val a = 4
        //         val b = 2
        //         val c = 5
        //         val d = 1
        //         val e = 4
        //         val f = 4
        //         val x = 5
        //
        //         val calcDistance = calcDistance(a, b, c, x)
        //         val calcDistance1 = calcDistance(d, e, f, x)
        //         val result = calcDistance == calcDistance1
        //         val calcDistance2 = calcDistance2(a, b, c, x)
        //         val calcDistance21 = calcDistance2(d, e, f, x)
        //         val result2 = calcDistance2 == calcDistance21
        //         val success = result == result2
        //         println("$a, $b, $c,$d,$e,$f, $x: ")
        //     } while (success)

        // assertThat("", equalTo("f"))
        // }

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
            input.inputln("AtCoder")

            abc249b()

            val result = output.readLines()
            assertThat(result, equalTo(listOf("Yes")))
        }

        @Test
        fun a_2() {
            input.inputln("Aa")

            abc249b()

            val result = output.readLines()
            assertThat(result, equalTo(listOf("Yes")))
        }

        @Test
        fun a_3() {
            input.inputln("atcoder")

            abc249b()

            val result = output.readLines()
            assertThat(result, equalTo(listOf("No")))
        }

        @Test
        fun a_4() {
            input.inputln("Perfect")

            abc249b()

            val result = output.readLines()
            assertThat(result, equalTo(listOf("No")))
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