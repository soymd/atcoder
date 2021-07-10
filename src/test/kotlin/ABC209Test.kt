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
}