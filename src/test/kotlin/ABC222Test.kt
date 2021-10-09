import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.AfterEach
import org.junit.jupiter.api.BeforeEach
import org.junit.jupiter.api.Test


class ABC222Test {

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
    fun swissSystemTournament_1() {
        input.inputln("2 3")
        input.inputln("GCP")
        input.inputln("PPP")
        input.inputln("CCC")
        input.inputln("PPC")

        swissSystemTournament()

        val result = output.readLines()
        assertThat(result, equalTo(listOf("3", "1", "2", "4")))
    }

    @Test
    fun swissSystemTournament_2() {
        input.inputln("2 2")
        input.inputln("GC")
        input.inputln("PG")
        input.inputln("CG")
        input.inputln("PP")

        swissSystemTournament()

        val result = output.readLines()
        assertThat(result, equalTo(listOf("1", "2", "3", "4")))
    }

    @Test
    fun failingGrade_1() {
        input.inputln("4 50")
        input.inputln("80 60 40 0")

        failingGrade()

        val result = output.readLines()
        assertThat(result, equalTo(listOf("2")))
    }

    @Test
    fun failingGrade_2() {
        input.inputln("3 90")
        input.inputln("89 89 89")

        failingGrade()

        val result = output.readLines()
        assertThat(result, equalTo(listOf("3")))
    }

    @Test
    fun failingGrade_3() {
        input.inputln("2 22")
        input.inputln("6 37")

        failingGrade()

        val result = output.readLines()
        assertThat(result, equalTo(listOf("1")))
    }

    @Test
    fun fourDigits_1() {
        input.inputln("321")

        fourDigits()

        val result = output.readLines()
        assertThat(result, equalTo(listOf("0321")))
    }

    @Test
    fun fourDigits_2() {
        input.inputln("7777")

        fourDigits()

        val result = output.readLines()
        assertThat(result, equalTo(listOf("7777")))
    }
}