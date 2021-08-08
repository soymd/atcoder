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

}