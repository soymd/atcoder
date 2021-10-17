import org.junit.jupiter.api.AfterEach
import org.junit.jupiter.api.BeforeEach


class ABC223Test {

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

}