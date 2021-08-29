import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.AfterEach
import org.junit.jupiter.api.BeforeEach
import org.junit.jupiter.api.Test


class ABC216Test {

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
    fun sameName_1() {
        input.inputln("3")
        input.inputln("tanaka taro")
        input.inputln("sato hanako")
        input.inputln("tanaka taro")

        sameName()

        val result = output.readLines()
        assertThat(result, equalTo(listOf("Yes")))
    }

    @Test
    fun sameName_2() {
        input.inputln("3")
        input.inputln("saito ichiro")
        input.inputln("saito jiro")
        input.inputln("saito saburo")

        sameName()

        val result = output.readLines()
        assertThat(result, equalTo(listOf("No")))
    }

    @Test
    fun sameName_3() {
        input.inputln("4")
        input.inputln("sypdgidop bkseq")
        input.inputln("bajsqz hh")
        input.inputln("ozjekw mcybmtt")
        input.inputln("qfeysvw dbo")

        sameName()

        val result = output.readLines()
        assertThat(result, equalTo(listOf("No")))
    }
}