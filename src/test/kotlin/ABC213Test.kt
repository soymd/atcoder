import org.hamcrest.CoreMatchers.equalTo
import org.junit.Assert.assertThat
import org.junit.Before
import org.junit.jupiter.api.Test


class ABC213Test {

    @Before
    fun setUp() {
    }

    @Test
    fun `BitwiseExclusiveOr 3 6`() {
        assertThat(bitwiseExclusiveOr(3, 6), equalTo(5))
    }

    @Test
    fun `BitwiseExclusiveOr 10 12`() {
        assertThat(bitwiseExclusiveOr(10, 12), equalTo(6))
    }

    @Test
    fun `boobyPrize 1, 123 12345 12 1234 123456`() {
        assertThat(
            boobyPrize(6, listOf(1, 123, 12345, 12, 1234, 123456)),
            equalTo(3)
        )
    }

    @Test
    fun `boobyPrize 5, 3 1 4 15 9`() {
        assertThat(
            boobyPrize(5, listOf(3, 1, 4, 15, 9)),
            equalTo(5)
        )
    }


}