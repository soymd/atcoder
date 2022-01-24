import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.AfterEach
import org.junit.jupiter.api.BeforeEach
import org.junit.jupiter.api.Nested
import org.junit.jupiter.api.Test

class ABCTest {
    //    @Nested
//    inner class Foo {
//        private val input = StandardInputStream()
//        private val output = StandardOutputStream()
//
//        @BeforeEach
//        fun setUp() {
//            System.setIn(input)
//            System.setOut(output)
//        }
//
//        @AfterEach
//        fun tearDown() {
//            System.setIn(null)
//            System.setOut(null)
//        }
//
//        @Test
//        fun foo_1() {
//            input.inputln("2 3")
//
//            foo()
//
//            val result = output.readLines()
//            assertThat(result, equalTo(listOf("2")))
//        }
//    }
    @Nested
    inner class ABC236 {
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
        fun chokudai_1() {
            input.inputln("chokudai")
            input.inputln("3 5")

            chokudai()

            val result = output.readLines()
            assertThat(result, equalTo(listOf("chukodai")))
        }

        @Test
        fun chokudai_2() {
            input.inputln("aa")
            input.inputln("1 2")

            chokudai()

            val result = output.readLines()
            assertThat(result, equalTo(listOf("aa")))
        }

        @Test
        fun chokudai_3() {
            input.inputln("aaaabbbb")
            input.inputln("1 8")

            chokudai()

            val result = output.readLines()
            assertThat(result, equalTo(listOf("baaabbba")))
        }
    }

    @Nested
    inner class ABC234 {
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
        fun longestSegment_a() {
            input.inputln("3")
            input.inputln("0 0")
            input.inputln("0 1")
            input.inputln("2 2")

            longestSegment()

            val result = output.readLines()
            assertThat(result, equalTo(listOf("2.82842712475")))
        }

        @Test
        fun longestSegment_b() {
            input.inputln("3")
            input.inputln("0 0")
            input.inputln("-1 1")
            input.inputln("1 1")

            longestSegment()

            val result = output.readLines()
            assertThat(result, equalTo(listOf("2")))
//            assertThat(result, equalTo(listOf("2.2360679775")))
        }

        @Test
        fun longestSegment_1() {
            input.inputln("3")
            input.inputln("0 0")
            input.inputln("0 1")
            input.inputln("1 1")

            longestSegment()

            val result = output.readLines()
            assertThat(result, equalTo(listOf("1.4142135624")))
        }

        @Test
        fun longestSegment_2() {
            input.inputln("5")
            input.inputln("315 271")
            input.inputln("-2 -621")
            input.inputln("-205 -511")
            input.inputln("-952 482")
            input.inputln("165 463")

            longestSegment()

            val result = output.readLines()
            assertThat(result, equalTo(listOf("1455.7159750446")))
        }

        @Test
        fun weirdFunction_1() {
            input.inputln("0")

            weirdFunction()

            val result = output.readLines()
            assertThat(result, equalTo(listOf("1371")))
        }

        @Test
        fun weirdFunction_2() {
            input.inputln("3")

            weirdFunction()

            val result = output.readLines()
            assertThat(result, equalTo(listOf("722502")))
        }

        @Test
        fun weirdFunction_3() {
            input.inputln("10")

            weirdFunction()

            val result = output.readLines()
            assertThat(result, equalTo(listOf("1111355571")))
        }
    }

    @Nested
    inner class ABC235 {
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
        fun climbingTakahashi_1() {
            input.inputln("5")
            input.inputln("1 5 10 4 2")

            climbingTakahashi()

            val result = output.readLines()
            assertThat(result, equalTo(listOf("10")))
        }

        @Test
        fun climbingTakahashi_2() {
            input.inputln("3")
            input.inputln("100 1000 100000")

            climbingTakahashi()

            val result = output.readLines()
            assertThat(result, equalTo(listOf("100000")))
        }

        @Test
        fun climbingTakahashi_3() {
            input.inputln("4")
            input.inputln("27 1828 1828 9242")

            climbingTakahashi()

            val result = output.readLines()
            assertThat(result, equalTo(listOf("1828")))
        }

        @Test
        fun rotate_1() {
            input.inputln("123")

            rotate()

            val result = output.readLines()
            assertThat(result, equalTo(listOf("666")))
        }

        @Test
        fun rotate_9() {
            input.inputln("999")

            rotate()

            val result = output.readLines()
            assertThat(result, equalTo(listOf("2997")))
        }
    }

    @Nested
    inner class ABC233 {
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
        fun tenYenStamp_1() {
            input.inputln("80 94")

            tenYenStamp()

            val result = output.readLines()
            assertThat(result, equalTo(listOf("2")))
        }

        @Test
        fun tenYenStamp_2() {
            input.inputln("1000 63")

            tenYenStamp()

            val result = output.readLines()
            assertThat(result, equalTo(listOf("0")))
        }

        @Test
        fun tenYenStamp_3() {
            input.inputln("270 750")

            tenYenStamp()

            val result = output.readLines()
            assertThat(result, equalTo(listOf("48")))
        }

        @Test
        fun aReverse_1() {
            input.inputln("3 7")
            input.inputln("abcdefgh")

            aReverse()

            val result = output.readLines()
            assertThat(result, equalTo(listOf("abgfedch")))
        }

        @Test
        fun aReverse_2() {
            input.inputln("1 7")
            input.inputln("reviver")

            aReverse()

            val result = output.readLines()
            assertThat(result, equalTo(listOf("reviver")))
        }

        @Test
        fun aReverse_3() {
            input.inputln("4 13")
            input.inputln("merrychristmas")

            aReverse()

            val result = output.readLines()
            assertThat(result, equalTo(listOf("meramtsirhcyrs")))
        }


        @Test
        fun aReverse_a() {
            input.inputln("1 1")
            input.inputln("merrychristmas")

            aReverse()

            val result = output.readLines()
            assertThat(result, equalTo(listOf("merrychristmas")))
        }

        @Test
        fun aReverse_b() {
            input.inputln("1 3")
            input.inputln("foo")

            aReverse()

            val result = output.readLines()
            assertThat(result, equalTo(listOf("oof")))
        }
    }

    @Nested
    inner class ABC232 {
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
        fun graphIsomorphism_1() {
            input.inputln("4 4")

            input.inputln("1 2")
            input.inputln("1 3")
            input.inputln("1 4")
            input.inputln("3 4")

            input.inputln("1 3")
            input.inputln("1 4")
            input.inputln("2 3")
            input.inputln("3 4")

            graphIsomorphism()

            val result = output.readLines()
            assertThat(result, equalTo(listOf("Yes")))
        }

        @Test
        fun graphIsomorphism_2() {
            input.inputln("5 6")

            input.inputln("1 2")
            input.inputln("1 3")
            input.inputln("1 4")
            input.inputln("3 4")
            input.inputln("3 5")
            input.inputln("4 5")

            input.inputln("1 2")
            input.inputln("1 3")
            input.inputln("1 4")
            input.inputln("1 5")
            input.inputln("3 5")
            input.inputln("4 5")

            graphIsomorphism()

            val result = output.readLines()
            assertThat(result, equalTo(listOf("No")))
        }

        @Test
        fun graphIsomorphism_3() {
            input.inputln("8 0")

            graphIsomorphism()

            val result = output.readLines()
            assertThat(result, equalTo(listOf("Yes")))
        }

        @Test
        fun caesarCipher_a() {
            input.inputln("za")
            input.inputln("ab")

            caesarCipher()

            val result = output.readLines()
            assertThat(result, equalTo(listOf("Yes")))
        }

        @Test
        fun caesarCipher_b() {
            input.inputln("ab")
            input.inputln("za")

            caesarCipher()

            val result = output.readLines()
            assertThat(result, equalTo(listOf("Yes")))
        }

        @Test
        fun caesarCipher_1() {
            input.inputln("abc")
            input.inputln("ijk")

            caesarCipher()

            val result = output.readLines()
            assertThat(result, equalTo(listOf("Yes")))
        }

        @Test
        fun caesarCipher_2() {
            input.inputln("z")
            input.inputln("a")

            caesarCipher()

            val result = output.readLines()
            assertThat(result, equalTo(listOf("Yes")))
        }

        @Test
        fun caesarCipher_3() {
            input.inputln("ppq")
            input.inputln("qqp")

            caesarCipher()

            val result = output.readLines()
            assertThat(result, equalTo(listOf("No")))
        }

        @Test
        fun caesarCipher_4() {
            input.inputln("atcoder")
            input.inputln("atcoder")

            caesarCipher()

            val result = output.readLines()
            assertThat(result, equalTo(listOf("Yes")))
        }

        @Test
        fun qqSolver_1() {
            input.inputln("3x7")

            qqSolver()

            val result = output.readLines()
            assertThat(result, equalTo(listOf("21")))
        }

        @Test
        fun qqSolver_2() {
            input.inputln("9x9")

            qqSolver()

            val result = output.readLines()
            assertThat(result, equalTo(listOf("81")))
        }
    }

    @Nested
    inner class Election {
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
        fun election_1() {
            input.inputln("5")
            input.inputln("snuke")
            input.inputln("snuke")
            input.inputln("takahashi")
            input.inputln("takahashi")
            input.inputln("takahashi")

            election()

            val result = output.readLines()
            assertThat(result, equalTo(listOf("takahashi")))
        }

        @Test
        fun election_2() {
            input.inputln("1")
            input.inputln("a")

            election()

            val result = output.readLines()
            assertThat(result, equalTo(listOf("a")))
        }
    }

    @Nested
    inner class WaterPressure {
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
        fun waterPressure_1() {
            input.inputln("1000")

            waterPressure()

            val result = output.readLines()
            assertThat(result, equalTo(listOf("10")))
        }

        @Test
        fun waterPressure_2() {
            input.inputln("50")

            waterPressure()

            val result = output.readLines()
            assertThat(result, equalTo(listOf("0.5")))
        }

        @Test
        fun waterPressure_3() {
            input.inputln("3141")

            waterPressure()

            val result = output.readLines()
            assertThat(result, equalTo(listOf("31.41")))
        }
    }

    @Nested
    inner class XDrawing {
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
        fun xDrawing_1() {
            input.inputln("5 3 2")//n, a, b
            input.inputln("1 5 1 5")//p, q, r, s

            xDrawing()

            val result = output.readLines()
            assertThat(
                result, equalTo(
                    listOf(
                        "...#.",
                        "#.#..",
                        ".#...",
                        "#.#..",
                        "...#."
                    )
                )
            )
        }

        @Test
        fun xDrawing_2() {
            input.inputln("5 3 3")
            input.inputln("4 5 2 5")

            xDrawing()

            val result = output.readLines()
            assertThat(
                result, equalTo(
                    listOf(
                        "#.#.",
                        "...#"
                    )
                )
            )
        }

        @Test
        fun xDrawing_3() {
            input.inputln("1000000000000000000 999999999999999999 999999999999999999")
            input.inputln("999999999999999998 1000000000000000000 999999999999999998 1000000000000000000")

            xDrawing()

            val result = output.readLines()
            assertThat(
                result, equalTo(
                    listOf(
                        "#.#",
                        ".#.",
                        "#.#"
                    )
                )
            )
        }
    }

    @Nested
    inner class TripleMetre {
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
        fun tripleMetre_xoxxoxxo() {
            input.inputln("xoxxoxxo")

            tripleMetre()

            val result = output.readLines()
            assertThat(result, equalTo(listOf("Yes")))
        }

        @Test
        fun tripleMetre_xxoxxoxo() {
            input.inputln("xxoxxoxo")

            tripleMetre()

            val result = output.readLines()
            assertThat(result, equalTo(listOf("No")))
        }

        @Test
        fun tripleMetre_o() {
            input.inputln("o")

            tripleMetre()

            val result = output.readLines()
            assertThat(result, equalTo(listOf("Yes")))
        }

        @Test
        fun tripleMetre_ox() {
            input.inputln("ox")

            tripleMetre()

            val result = output.readLines()
            assertThat(result, equalTo(listOf("Yes")))
        }

        @Test
        fun tripleMetre_x() {
            input.inputln("x")

            tripleMetre()

            val result = output.readLines()
            assertThat(result, equalTo(listOf("Yes")))
        }

        @Test
        fun tripleMetre_oo() {
            input.inputln("oo")

            tripleMetre()

            val result = output.readLines()
            assertThat(result, equalTo(listOf("No")))
        }

        @Test
        fun tripleMetre_xxxxxxxx() {
            input.inputln("xxxxxxxx")

            tripleMetre()

            val result = output.readLines()
            assertThat(result, equalTo(listOf("No")))
        }
    }

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