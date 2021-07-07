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

    @Test
    fun fairCandyDistribution_2_7_1_8() {
        val actual = fairCandyDistribution(2, 7, listOf(1, 8))

        assertThat(actual, equalTo(listOf(4L, 3L)))
    }

    @Test
    fun fairCandyDistribution_1_3_33() {
        val actual = fairCandyDistribution(1, 3, listOf(33))

        assertThat(actual, equalTo(listOf(3L)))
    }

    @Test
    fun fairCandyDistribution_7_1000000000000_99_8_2_4_43_5_3() {
        val actual = fairCandyDistribution(
            7,
            1000000000000,
            listOf(99, 8, 2, 4, 43, 5, 3)
        )

        assertThat(
            actual, equalTo(
                listOf(
                    142857142857,
                    142857142857,
                    142857142858,
                    142857142857,
                    142857142857,
                    142857142857,
                    142857142857
                )
            )
        )
    }
}