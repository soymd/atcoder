import org.hamcrest.CoreMatchers.equalTo
import org.junit.Assert.assertThat
import org.junit.Before
import org.junit.jupiter.api.Test


class ABC208BTest {

    @Before
    fun setUp() {
    }

    @Test
    fun factorialYenCoin_9() {
        assertThat(factorialYenCoin(9), equalTo(3))
    }

    @Test
    fun factorialYenCoin_119() {
        assertThat(factorialYenCoin(119), equalTo(10))
    }

    @Test
    fun factorialYenCoin_10000000() {
        assertThat(factorialYenCoin(10000000), equalTo(24))
    }
}