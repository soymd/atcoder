import org.hamcrest.CoreMatchers.equalTo
import org.junit.Assert.assertThat
import org.junit.Before
import org.junit.jupiter.api.Test


class ABC209Test {

    @Before
    fun setUp() {
    }

    @Test
    fun counting_2_4() {
        assertThat(counting(2, 4), equalTo(3))
    }

    @Test
    fun counting_10_100() {
        assertThat(counting(10, 100), equalTo(91))
    }

    @Test
    fun counting_3_2() {
        assertThat(counting(3, 2), equalTo(0))
    }

    @Test
    fun counting_2_2() {
        assertThat(counting(2, 2), equalTo(0))
    }

    @Test
    fun `Can you buy them all 2 3 1 3`() {
        assertThat(canYouBuyThemAll(2, 3, listOf(1, 3)), equalTo("Yes"))
    }

    @Test
    fun `Can you buy them all 4 10 3 3 4 4`() {
        assertThat(canYouBuyThemAll(4, 10, listOf(3, 3, 4, 4)), equalTo("No"))
    }

    @Test
    fun `Can you buy them all 4 10 3 3 4 2`() {
        assertThat(canYouBuyThemAll(3, 10, listOf(3, 3, 4)), equalTo("Yes"))
    }

    @Test
    fun `Can you buy them all 4 10 3 3`() {
        assertThat(canYouBuyThemAll(3, 10, listOf(3, 3, 5)), equalTo("Yes"))
    }

    @Test
    fun `Can you buy them all 3 10`() {
        assertThat(canYouBuyThemAll(3, 10, listOf(3, 3, 6)), equalTo("No"))
    }

    @Test
    fun `Can you buy them all 8 30 `() {
        assertThat(canYouBuyThemAll(8, 30, listOf(3, 1, 4, 1, 5, 9, 2, 6)), equalTo("Yes"))
    }
}