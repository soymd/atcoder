import org.hamcrest.CoreMatchers.equalTo
import org.junit.Assert.assertThat
import org.junit.Before
import org.junit.jupiter.api.Test


class ABC213Test {

    @Before
    fun setUp() {
    }

    @Test
    fun `createConnections`() {
        assertThat(
            createConnections(
                listOf(
                    listOf(1, 2),
                    listOf(2, 4),
                    listOf(1, 3)
                )
            ), equalTo(
                mutableMapOf(
                    1 to mutableSetOf(2, 3),
                    2 to mutableSetOf(1, 4),
                    3 to mutableSetOf(1),
                    4 to mutableSetOf(2)
                )
            )
        )
        assertThat(
            createConnections(
                listOf(
                    listOf(1, 2),
                    listOf(2, 4),
                    listOf(1, 3),
                    listOf(3, 4)
                )
            ), equalTo(
                mutableMapOf(
                    1 to mutableSetOf(2, 3),
                    2 to mutableSetOf(1, 4),
                    3 to mutableSetOf(1, 4),
                    4 to mutableSetOf(2, 3)
                )
            )
        )
        assertThat(
            createConnections(
                listOf(
                    listOf(1, 2),
                    listOf(2, 4),
                    listOf(1, 3),
                    listOf(3, 4),
                    listOf(2, 3)
                )
            ), equalTo(
                mutableMapOf(
                    1 to mutableSetOf(2, 3),
                    2 to mutableSetOf(1, 3, 4),
                    3 to mutableSetOf(1, 2, 4),
                    4 to mutableSetOf(2, 3)
                )
            )
        )
        assertThat(
            createConnections(
                listOf(
                    listOf(1, 2),
                    listOf(2, 4),
                    listOf(1, 3),
                    listOf(3, 4),
                    listOf(2, 3),
                    listOf(1, 4)

                )
            ), equalTo(
                mutableMapOf(
                    1 to mutableSetOf(2, 3, 4),
                    2 to mutableSetOf(1, 3, 4),
                    3 to mutableSetOf(1, 2, 4),
                    4 to mutableSetOf(1, 2, 3)
                )
            )
        )
        assertThat(
            createConnections(
                listOf(
                    listOf(1, 2),
                    listOf(1, 3),
                    listOf(1, 4),
                    listOf(1, 5)
                )
            ), equalTo(
                mutableMapOf(
                    1 to mutableSetOf(2, 3, 4, 5),
                    2 to mutableSetOf(1),
                    3 to mutableSetOf(1),
                    4 to mutableSetOf(1),
                    5 to mutableSetOf(1)
                )
            )
        )
    }

    @Test
    fun `takahashiTour 1`() {
        assertThat(
            takahashiTour(
                4, listOf(
                    listOf(1, 2),
                    listOf(2, 4),
                    listOf(1, 3)
                )
            ), equalTo("1 2 4 2 1 3 1")
        )
    }

    @Test
    fun `takahashiTour 1-1`() {
        //todo: not pass
        assertThat(
            takahashiTour(
                4, listOf(
                    listOf(1, 2),
                    listOf(2, 4),
                    listOf(1, 3),
                    listOf(3, 4)
                )
            ), equalTo("1 2 4 3 1")
        )
    }

    @Test
    fun `takahashiTour 1-2`() {
        //todo: not pass
        assertThat(
            takahashiTour(
                4, listOf(
                    listOf(1, 2),
                    listOf(2, 4),
                    listOf(1, 3),
                    listOf(3, 4),
                    listOf(2, 3)
                )
            ), equalTo("1 2 3 4 2 1")
        )
    }

    @Test
    fun `takahashiTour 2`() {
        assertThat(
            takahashiTour(
                5, listOf(
                    listOf(1, 2),
                    listOf(1, 3),
                    listOf(1, 4),
                    listOf(1, 5)
                )
            ), equalTo("1 2 1 3 1 4 1 5 1")
        )
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