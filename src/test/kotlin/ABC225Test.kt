import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.AfterEach
import org.junit.jupiter.api.BeforeEach
import org.junit.jupiter.api.Test


class ABC225Test {
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
    fun calendarValidator_a() {
        input.inputln("1 3")
        input.inputln("1 2 3")

        calendarValidator()

        val result = output.readLines()
        assertThat(result, equalTo(listOf("Yes")))
    }

    @Test
    fun calendarValidator_b() {
        input.inputln("1 1")
        input.inputln("1")

        calendarValidator()

        val result = output.readLines()
        assertThat(result, equalTo(listOf("Yes")))
    }

    @Test
    fun calendarValidator_c() {
        input.inputln("2 1")
        input.inputln("1")
        input.inputln("8")

        calendarValidator()

        val result = output.readLines()
        assertThat(result, equalTo(listOf("Yes")))
    }

    @Test
    fun calendarValidator_d() {
        input.inputln("3 1")
        input.inputln("1")
        input.inputln("8")
        input.inputln("9")

        calendarValidator()

        val result = output.readLines()
        assertThat(result, equalTo(listOf("No")))
    }

    @Test
    fun calendarValidator_e() {
        input.inputln("1 7")
        input.inputln("1 2 3 4 5 6 8")

        calendarValidator()

        val result = output.readLines()
        assertThat(result, equalTo(listOf("No")))
    }

    @Test
    fun calendarValidator_f() {
        input.inputln("1 2")
        input.inputln("1 3")

        calendarValidator()

        val result = output.readLines()
        assertThat(result, equalTo(listOf("No")))
    }

    @Test
    fun calendarValidator_g() {
        input.inputln("2 2")
        input.inputln("1 2")
        input.inputln("8 8")

        calendarValidator()

        val result = output.readLines()
        assertThat(result, equalTo(listOf("No")))
    }

    @Test
    fun calendarValidator_h() {
        input.inputln("2 2")
        input.inputln("1 2")
        input.inputln("6 9")

        calendarValidator()

        val result = output.readLines()
        assertThat(result, equalTo(listOf("No")))
    }

    @Test
    fun calendarValidator_1() {
        input.inputln("2 3")
        input.inputln("1 2 3")
        input.inputln("8 9 10")

        calendarValidator()

        val result = output.readLines()
        assertThat(result, equalTo(listOf("Yes")))
    }

    @Test
    fun calendarValidator_2() {
        input.inputln("2 1")
        input.inputln("1")
        input.inputln("2")

        calendarValidator()

        val result = output.readLines()
        assertThat(result, equalTo(listOf("No")))
    }

    @Test
    fun calendarValidator_3() {
        input.inputln("10 4")
        input.inputln("1346 1347 1348 1349")
        input.inputln("1353 1354 1355 1356")
        input.inputln("1360 1361 1362 1363")
        input.inputln("1367 1368 1369 1370")
        input.inputln("1374 1375 1376 1377")
        input.inputln("1381 1382 1383 1384")
        input.inputln("1388 1389 1390 1391")
        input.inputln("1395 1396 1397 1398")
        input.inputln("1402 1403 1404 1405")
        input.inputln("1409 1410 1411 1412")

        calendarValidator()

        val result = output.readLines()
        assertThat(result, equalTo(listOf("Yes")))
    }

    @Test
    fun starOrNot_1() {
        input.inputln("5")
        input.inputln("1 4")
        input.inputln("2 4")
        input.inputln("3 4")
        input.inputln("4 5")

        starOrNot()

        val result = output.readLines()
        assertThat(result, equalTo(listOf("Yes")))
    }

    @Test
    fun starOrNot_2() {
        input.inputln("4")
        input.inputln("2 4")
        input.inputln("1 4")
        input.inputln("2 3")

        starOrNot()

        val result = output.readLines()
        assertThat(result, equalTo(listOf("No")))
    }

    @Test
    fun starOrNot_3() {
        input.inputln("10")
        input.inputln("9 10")
        input.inputln("3 10")
        input.inputln("4 10")
        input.inputln("8 10")
        input.inputln("1 10")
        input.inputln("2 10")
        input.inputln("7 10")
        input.inputln("6 10")
        input.inputln("5 10")

        starOrNot()

        val result = output.readLines()
        assertThat(result, equalTo(listOf("Yes")))
    }

    @Test
    fun distinctStrings_1() {
        input.inputln("aba")

        distinctStrings()

        val result = output.readLines()
        assertThat(result, equalTo(listOf("3")))
    }

    @Test
    fun distinctStrings_2() {
        input.inputln("ccc")

        distinctStrings()

        val result = output.readLines()
        assertThat(result, equalTo(listOf("1")))
    }

    @Test
    fun distinctStrings_3() {
        input.inputln("xyz")

        distinctStrings()

        val result = output.readLines()
        assertThat(result, equalTo(listOf("6")))
    }
}