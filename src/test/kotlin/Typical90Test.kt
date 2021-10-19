import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.AfterEach
import org.junit.jupiter.api.BeforeEach
import org.junit.jupiter.api.Nested
import org.junit.jupiter.api.Test


class Typical90Test {
    @Nested
    class CrossSum {
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
        fun crossSum_a() {
            input.inputln("2 2")

            input.inputln("1 2")
            input.inputln("3 4")

            crossSum()

            val result = output.readLines()
            assertThat(
                result, equalTo(
                    listOf(
                        "6 7",
                        "8 9"
                    )
                )
            )
        }

        @Test
        fun crossSum_b() {
            input.inputln("2 3")

            input.inputln("1 2 3")
            input.inputln("4 5 6")

            crossSum()

            val result = output.readLines()
            assertThat(
                result, equalTo(
                    listOf(
                        "10 11 12",
                        "16 17 18"
                    )
                )
            )
        }

        @Test
        fun crossSum_1() {
            input.inputln("3 3")
            input.inputln("1 1 1")
            input.inputln("1 1 1")
            input.inputln("1 1 1")

            crossSum()

            val result = output.readLines()
            assertThat(
                result, equalTo(
                    listOf(
                        "5 5 5",
                        "5 5 5",
                        "5 5 5"
                    )
                )
            )
        }

        @Test
        fun crossSum_2() {
            input.inputln("4 4")
            input.inputln("3 1 4 1")
            input.inputln("5 9 2 6")
            input.inputln("5 3 5 8")
            input.inputln("9 7 9 3")

            crossSum()

            val result = output.readLines()
            assertThat(
                result, equalTo(
                    listOf(
                        "28 28 25 26",
                        "39 33 40 34",
                        "38 38 36 31",
                        "41 41 39 43"
                    )
                )
            )
        }

        @Test
        fun crossSum_3() {
            input.inputln("2 10")
            input.inputln("31 41 59 26 53 58 97 93 23 84")
            input.inputln("62 64 33 83 27 95 2 88 41 97")

            crossSum()

            val result = output.readLines()
            assertThat(
                result, equalTo(
                    listOf(
                        "627 629 598 648 592 660 567 653 606 662",
                        "623 633 651 618 645 650 689 685 615 676"
                    )
                )
            )
        }

        @Test
        fun crossSum_4() {
            input.inputln("10 10")
            input.inputln("83 86 77 65 93 85 86 92 99 71")
            input.inputln("62 77 90 59 63 76 90 76 72 86")
            input.inputln("61 68 67 79 82 80 62 73 67 85")
            input.inputln("79 52 72 58 69 67 93 56 61 92")
            input.inputln("79 73 71 69 84 87 98 74 65 70")
            input.inputln("63 76 91 80 56 73 62 70 96 81")
            input.inputln("55 75 84 77 86 55 96 79 63 57")
            input.inputln("74 95 82 95 64 67 84 64 93 50")
            input.inputln("87 58 76 78 88 84 53 51 54 99")
            input.inputln("82 60 76 68 89 62 76 86 94 89")

            crossSum()

            val result = output.readLines()
            assertThat(
                result, equalTo(
                    listOf(
                        "1479 1471 1546 1500 1518 1488 1551 1466 1502 1546",
                        "1414 1394 1447 1420 1462 1411 1461 1396 1443 1445",
                        "1388 1376 1443 1373 1416 1380 1462 1372 1421 1419",
                        "1345 1367 1413 1369 1404 1368 1406 1364 1402 1387",
                        "1416 1417 1485 1429 1460 1419 1472 1417 1469 1480",
                        "1410 1392 1443 1396 1466 1411 1486 1399 1416 1447",
                        "1397 1372 1429 1378 1415 1408 1431 1369 1428 1450",
                        "1419 1393 1472 1401 1478 1437 1484 1425 1439 1498",
                        "1366 1390 1438 1378 1414 1380 1475 1398 1438 1409",
                        "1425 1442 1492 1442 1467 1456 1506 1417 1452 1473"
                    )
                )
            )
        }
    }

    @Nested
    class EncyclopediaOfParentheses {
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
        fun encyclopediaOfParentheses_1() {
            input.inputln("2")

            encyclopediaOfParentheses()

            val result = output.readLines()
            assertThat(result, equalTo(listOf("()")))
        }

        @Test
        fun encyclopediaOfParentheses_2() {
            input.inputln("3")

            encyclopediaOfParentheses()

            val result = output.readLines()
            assertThat(result, equalTo(emptyList()))
        }

        @Test
        fun encyclopediaOfParentheses_3() {
            input.inputln("4")

            encyclopediaOfParentheses()

            val result = output.readLines()
            assertThat(result, equalTo(listOf("(())", "()()")))
        }

        @Test
        fun encyclopediaOfParentheses_6() {
            input.inputln("6")

            encyclopediaOfParentheses()

            val result = output.readLines()
            assertThat(
                result, equalTo(
                    listOf(
                        "((()))",
                        "(()())",
                        "(())()",
                        "()(())",
                        "()()()"
                    )
                )
            )
        }

        @Test
        fun encyclopediaOfParentheses_4() {
            input.inputln("10")

            encyclopediaOfParentheses()

            val result = output.readLines()
            assertThat(
                result,
                equalTo(
                    listOf(
                        "((((()))))",
                        "(((()())))",
                        "(((())()))",
                        "(((()))())",
                        "(((())))()",
                        "((()(())))",
                        "((()()()))",
                        "((()())())",
                        "((()()))()",
                        "((())(()))",
                        "((())()())",
                        "((())())()",
                        "((()))(())",
                        "((()))()()",
                        "(()((())))",
                        "(()(()()))",
                        "(()(())())",
                        "(()(()))()",
                        "(()()(()))",
                        "(()()()())",
                        "(()()())()",
                        "(()())(())",
                        "(()())()()",
                        "(())((()))",
                        "(())(()())",
                        "(())(())()",
                        "(())()(())",
                        "(())()()()",
                        "()(((())))",
                        "()((()()))",
                        "()((())())",
                        "()((()))()",
                        "()(()(()))",
                        "()(()()())",
                        "()(()())()",
                        "()(())(())",
                        "()(())()()",
                        "()()((()))",
                        "()()(()())",
                        "()()(())()",
                        "()()()(())",
                        "()()()()()"
                    )
                )
            )
        }
    }

    @Nested
    class YokanParty {
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
        fun yokanParty_1() {
            input.inputln("3 34")
            input.inputln("1")
            input.inputln("8 13 26")

            yokanParty()

            val result = output.readLines()
            assertThat(result, equalTo(listOf("13")))
        }

        @Test
        fun yokanParty_2() {
            input.inputln("7 45")
            input.inputln("2")
            input.inputln("7 11 16 20 28 34 38")

            yokanParty()

            val result = output.readLines()
            assertThat(result, equalTo(listOf("12")))
        }

        @Test
        fun yokanParty_3() {
            input.inputln("3 100")
            input.inputln("1")
            input.inputln("28 54 81")

            yokanParty()

            val result = output.readLines()
            assertThat(result, equalTo(listOf("46")))
        }

        @Test
        fun yokanParty_4() {
            input.inputln("3 100")
            input.inputln("2")
            input.inputln("28 54 81")

            yokanParty()

            val result = output.readLines()
            assertThat(result, equalTo(listOf("26")))
        }

        @Test
        fun yokanParty_5() {
            input.inputln("20 1000")
            input.inputln("4")
            input.inputln("51 69 102 127 233 295 350 388 417 466 469 523 553 587 720 739 801 855 926 954")

            yokanParty()

            val result = output.readLines()
            assertThat(result, equalTo(listOf("170")))
        }
    }
}