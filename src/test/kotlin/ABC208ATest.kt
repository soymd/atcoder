import org.hamcrest.CoreMatchers.equalTo
import org.junit.Assert.assertThat
import org.junit.Before
import org.junit.jupiter.api.Test


class ABC208ATest {

    @Before
    fun setUp() {
    }

    var a = 0
    var b = 0

    @Test
    fun rollingDice_2_11() {
        initRollingDice(2, 11)

        assertThat(rollingDice(a, b), equalTo("Yes"))
    }

    @Test
    fun rollingDice_2_13() {
        initRollingDice(2, 13)

        assertThat(rollingDice(a, b), equalTo("No"))
    }

    @Test
    fun rollingDice_3_17() {
        initRollingDice(3, 17)

        assertThat(rollingDice(a, b), equalTo("Yes"))
    }

    @Test
    fun rollingDice_100_599() {
        initRollingDice(100, 599)

        assertThat(rollingDice(a, b), equalTo("Yes"))
    }

    @Test
    fun rollingDice_2_1() {
        initRollingDice(2, 1)

        assertThat(rollingDice(a, b), equalTo("No"))
    }

    @Test
    fun rollingDice_100_600() {
        initRollingDice(100, 600)

        assertThat(rollingDice(a, b), equalTo("Yes"))
    }

    private fun initRollingDice(a: Int, b: Int) {
        this.a = a
        this.b = b
    }
}