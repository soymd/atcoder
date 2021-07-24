import org.hamcrest.CoreMatchers.equalTo
import org.junit.Assert.assertThat
import org.junit.Before
import org.junit.jupiter.api.Test


class ABC211Test {

    @Before
    fun setUp() {
    }

    @Test
    fun bloodPressure_130_100() {
        assertThat(
            bloodPressure(130, 100),
            equalTo(110F)
        )
    }

    @Test
    fun bloodPressure_300_50() {
        assertThat(
            bloodPressure(300, 50),
            equalTo(133.3333333F)
        )
    }

    @Test
    fun bloodPressure_123_123() {
        assertThat(
            bloodPressure(123, 123),
            equalTo(123F)
        )
    }

}