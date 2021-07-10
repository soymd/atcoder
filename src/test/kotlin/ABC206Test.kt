import org.hamcrest.CoreMatchers.equalTo
import org.junit.Assert.assertThat
import org.junit.Before
import org.junit.jupiter.api.Test


class ABC206Test {

    @Before
    fun setUp() {
    }

    @Test
    fun maxiBuying_180() {
        assertThat(maxiBuying(180), equalTo("Yay!"))
    }

    @Test
    fun maxiBuying_200() {
        assertThat(maxiBuying(200), equalTo(":("))
    }

    @Test
    fun maxiBuying_191() {
        assertThat(maxiBuying(191), equalTo("so-so"))
    }

    @Test
    fun savings_12() {
        assertThat(savings(12), equalTo(5))
    }

    @Test
    fun savings_100128() {
        assertThat(savings(100128), equalTo(447))
    }

    @Test
    fun swappable_3_1_7_1() {
        assertThat(swappable(3, listOf(1L, 7L, 1L)), equalTo(2))
        //
    }

    @Test
    fun swappable_10_100_() {
        assertThat(
            swappable(
                10, listOf(
                    1L,
                    10L,
                    100L,
                    1000L,
                    10000L,
                    100000L,
                    1000000L,
                    10000000L,
                    100000000L,
                    1000000000L
                )
            ), equalTo(45)
        )
    }

    @Test
    fun swappable_2_() {
        assertThat(
            swappable(
                20, listOf(
                    7L, 8L, 1L, 1L, 4L, 9L, 9L, 6L, 8L, 2L, 4L, 1L, 1L, 9L, 5L, 5L, 5L, 3L, 6L, 4L
                )
            ), equalTo(173)
        )
    }
}