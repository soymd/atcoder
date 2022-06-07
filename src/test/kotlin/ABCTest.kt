import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.AfterEach
import org.junit.jupiter.api.BeforeEach
import org.junit.jupiter.api.Nested
import org.junit.jupiter.api.Test

class ABCTest {
    //    @Nested
//    inner class ABC {
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
    inner class ABC240 {
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
        fun toRoman_1() {
            assertThat(toRoman(1), equalTo("I"))
            assertThat(toRoman(2), equalTo("II"))
            assertThat(toRoman(3), equalTo("III"))
            assertThat(toRoman(4), equalTo("IV"))
            assertThat(toRoman(5), equalTo("V"))
        }

        @Test
        fun jumpingTakahashi_1() {
            input.inputln("2 10")
            input.inputln("3 6")
            input.inputln("4 5")

            jumpingTakahashi()

            val result = output.readLines()
            assertThat(result, equalTo(listOf("Yes")))
        }

        @Test
        fun jumpingTakahashi_2() {
            input.inputln("2 10")
            input.inputln("10 100")
            input.inputln("10 100")

            jumpingTakahashi()

            val result = output.readLines()
            assertThat(result, equalTo(listOf("No")))
        }

        @Test
        fun jumpingTakahashi_3() {
            input.inputln("4 12")
            input.inputln("1 8")
            input.inputln("5 7")
            input.inputln("3 4")
            input.inputln("2 6")

            jumpingTakahashi()

            val result = output.readLines()
            assertThat(result, equalTo(listOf("Yes")))
        }

        @Test
        fun countDistinctIntegers_1() {
            input.inputln("6")
            input.inputln("1 4 1 2 2 1")

            countDistinctIntegers()

            val result = output.readLines()
            assertThat(result, equalTo(listOf("3")))
        }

        @Test
        fun countDistinctIntegers_2() {
            input.inputln("1")
            input.inputln("1")

            countDistinctIntegers()

            val result = output.readLines()
            assertThat(result, equalTo(listOf("1")))
        }

        @Test
        fun countDistinctIntegers_3() {
            input.inputln("11")
            input.inputln("3 1 4 1 5 9 2 6 5 3 5")

            countDistinctIntegers()

            val result = output.readLines()
            assertThat(result, equalTo(listOf("7")))
        }

        @Test
        fun edgeChecker_1() {
            input.inputln("4 5")

            edgeChecker()

            val result = output.readLines()
            assertThat(result, equalTo(listOf("Yes")))
        }

        @Test
        fun edgeChecker_2() {
            input.inputln("3 5")

            edgeChecker()

            val result = output.readLines()
            assertThat(result, equalTo(listOf("No")))
        }

        @Test
        fun edgeChecker_3() {
            input.inputln("1 10")

            edgeChecker()

            val result = output.readLines()
            assertThat(result, equalTo(listOf("Yes")))
        }
    }

    @Nested
    inner class ABC239 {
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
        fun digitnum_1() {
            input.inputln("16")

            digitnum()

            val result = output.readLines()
            assertThat(result, equalTo(listOf("73")))
        }

        @Test
        fun digitnum_2() {
            input.inputln("238")

            digitnum()

            val result = output.readLines()
            assertThat(result, equalTo(listOf("13870")))
        }

        @Test
        fun digitnum_3() {
            input.inputln("999999999999999999")

            digitnum()

            val result = output.readLines()
            assertThat(result, equalTo(listOf("762062362")))
        }

        @Test
        fun integerDivision_1() {
            input.inputln("47")

            integerDivision()

            val result = output.readLines()
            assertThat(result, equalTo(listOf("4")))
        }

        @Test
        fun integerDivision_2() {
            input.inputln("-24")

            integerDivision()

            val result = output.readLines()
            assertThat(result, equalTo(listOf("-3")))
        }

        @Test
        fun integerDivision_3() {
            input.inputln("50")

            integerDivision()

            val result = output.readLines()
            assertThat(result, equalTo(listOf("5")))
        }

        @Test
        fun integerDivision__10() {
            input.inputln("-10")

            integerDivision()

            val result = output.readLines()
            assertThat(result, equalTo(listOf("-1")))
        }

        @Test
        fun integerDivision_0() {
            input.inputln("0")

            integerDivision()

            val result = output.readLines()
            assertThat(result, equalTo(listOf("0")))
        }

        @Test
        fun integerDivision__9() {
            input.inputln("-9")

            integerDivision()

            val result = output.readLines()
            assertThat(result, equalTo(listOf("-1")))
        }

        @Test
        fun integerDivision_9() {
            input.inputln("9")

            integerDivision()

            val result = output.readLines()
            assertThat(result, equalTo(listOf("0")))
        }

        @Test
        fun horizon_1() {
            input.inputln("333")

            horizon()

            val result = output.readLines()
            assertThat(result, equalTo(listOf("65287.907678222")))
        }

        @Test
        fun horizon_2() {
            input.inputln("634")

            horizon()

            val result = output.readLines()
            assertThat(result, equalTo(listOf("90086.635834623")))
        }
    }

    @Nested
    inner class ABC238 {
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
        fun pizza_1() {
            input.inputln("4")
            input.inputln("90 180 45 195")

            pizza()

            val result = output.readLines()
            assertThat(result, equalTo(listOf("120")))
        }

        @Test
        fun pizza_2() {
            input.inputln("1")
            input.inputln("1")

            pizza()

            val result = output.readLines()
            assertThat(result, equalTo(listOf("359")))
        }

        @Test
        fun pizza_3() {
            input.inputln("10")
            input.inputln("215 137 320 339 341 41 44 18 241 149")

            pizza()

            val result = output.readLines()
            assertThat(result, equalTo(listOf("170")))
        }

        @Test
        fun pizza_a() {
            input.inputln("1")
            input.inputln("359")

            pizza()

            val result = output.readLines()
            assertThat(result, equalTo(listOf("359")))
        }

        @Test
        fun exponentialOrQuadratic_1() {
            input.inputln("5")

            exponentialOrQuadratic()

            val result = output.readLines()
            assertThat(result, equalTo(listOf("Yes")))
        }

        @Test
        fun exponentialOrQuadratic_2() {
            input.inputln("2")

            exponentialOrQuadratic()

            val result = output.readLines()
            assertThat(result, equalTo(listOf("No")))
        }

        @Test
        fun exponentialOrQuadratic_3() {
            input.inputln("623947744")

            exponentialOrQuadratic()

            val result = output.readLines()
            assertThat(result, equalTo(listOf("Yes")))
        }
    }

    @Nested
    inner class ABC237 {
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
        fun matrixTransposition_1() {
            input.inputln("4 3")
            input.inputln("1 2 3")
            input.inputln("4 5 6")
            input.inputln("7 8 9")
            input.inputln("10 11 12")

            matrixTransposition()

            val result = output.readLines()
            assertThat(
                result, equalTo(
                    listOf(
                        "1 4 7 10",
                        "2 5 8 11",
                        "3 6 9 12"
                    )
                )
            )
        }

        @Test
        fun matrixTransposition_2() {
            input.inputln("2 2")
            input.inputln("1000000000 1000000000")
            input.inputln("1000000000 1000000000")

            matrixTransposition()

            val result = output.readLines()
            assertThat(
                result, equalTo(
                    listOf(
                        "1000000000 1000000000",
                        "1000000000 1000000000"
                    )
                )
            )
        }

        @Test
        fun notOverFlow_1() {
            input.inputln("10")

            notOverFlow()

            val result = output.readLines()
            assertThat(result, equalTo(listOf("Yes")))
        }

        @Test
        fun notOverFlow_2() {
            input.inputln("-9876543210")

            notOverFlow()

            val result = output.readLines()
            assertThat(result, equalTo(listOf("No")))
        }
    }

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
        fun whoIsMissing_1() {
            input.inputln("3")
            input.inputln("1 3 2 3 3 2 2 1 1 1 2")

            whoIsMissing()

            val result = output.readLines()
            assertThat(result, equalTo(listOf("3")))
        }

        @Test
        fun whoIsMissing_2() {
            input.inputln("1")
            input.inputln("1 1 1")

            whoIsMissing()

            val result = output.readLines()
            assertThat(result, equalTo(listOf("1")))
        }

        @Test
        fun whoIsMissing_3() {
            input.inputln("4")
            input.inputln("3 2 1 1 2 4 4 4 4 3 1 3 2 1 3")

            whoIsMissing()

            val result = output.readLines()
            assertThat(result, equalTo(listOf("2")))
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