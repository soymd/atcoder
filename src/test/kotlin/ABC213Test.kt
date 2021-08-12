import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.Ignore
import org.junit.jupiter.api.AfterEach
import org.junit.jupiter.api.BeforeEach
import org.junit.jupiter.api.Test


class ABC213Test {

    private val input = StandardInputStream()
    private val output = StandardOutputStream()

    @BeforeEach
    fun setUp() {
        System.setIn(input)
        System.setOut(output)
    }

    @AfterEach
    fun tearDown() {
        System.setIn(null)
        System.setOut(null)
    }

    @Test
    fun `reorderCards 4 5 2`() {
        input.inputln("4 5 2")
        input.inputln("3 2")
        input.inputln("2 5")
        val actual = reorderCards()
        val expected = listOf("2 1", "1 2")
        assertThat(actual, equalTo(expected))

        //not pass... https://qiita.com/aky100200/items/f4f7d6279524774610fc
//        assertThat(output.readLine(), equalTo("2 1"))
//        assertThat(output.readLine(), equalTo("1 2"))
    }

    @Test
    fun `reorderCards 5 5 5`() {
        input.inputln("5 5 5")
        input.inputln("1 1")
        input.inputln("2 2")
        input.inputln("3 3")
        input.inputln("4 4")
        input.inputln("5 5")
        val actual = reorderCards()
        val expected = listOf(
            "1 1",
            "2 2",
            "3 3",
            "4 4",
            "5 5"
        )

        assertThat(actual, equalTo(expected))
    }

    @Ignore
    @Test
    fun `reorderCards 1000000000 1000000000 10`() {
        input.inputln("1000000000 1000000000 10")
        input.inputln("1000000000 1000000000 10")
        input.inputln("1 1")
        input.inputln("10 10")
        input.inputln("100 100")
        input.inputln("1000 1000")
        input.inputln("10000 10000")
        input.inputln("100000 100000")
        input.inputln("1000000 1000000")
        input.inputln("10000000 10000000")
        input.inputln("100000000 100000000")
        input.inputln("1000000000 1000000000")
        val actual = reorderCards()
        val expected = listOf(
            "1 1",
            "2 2",
            "3 3",
            "4 4",
            "5 5",
            "6 6",
            "7 7",
            "8 8",
            "9 9",
            "10 10"
        )

        assertThat(actual, equalTo(expected))
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
    fun `backToStart1`() {
        assertThat(
            backToStart(
                3,
                mutableMapOf(
                    1 to mutableSetOf(2, 3),
                    2 to mutableSetOf(1, 4),
                    3 to mutableSetOf(1),
                    4 to mutableSetOf(2)
                )
            ),
            equalTo(listOf(1))
        )
    }

    @Test
    fun backToStart2() {

        assertThat(
            backToStart(
                3,
                mutableMapOf(
                    1 to mutableSetOf(2, 3),
                    2 to mutableSetOf(1, 4),
                    3 to mutableSetOf(1, 4),
                    4 to mutableSetOf(2, 3)
                )
            ),
            equalTo(listOf(1))
        )
    }

    @Test
    fun backToStart3() {

        assertThat(
            backToStart(
                4,
                mutableMapOf(
                    1 to mutableSetOf(2, 3),
                    2 to mutableSetOf(1, 3, 4),
                    3 to mutableSetOf(1, 2, 4),
                    4 to mutableSetOf(2, 3)
                )
            ),
            equalTo(listOf(2, 1))
        )
    }

    @Test
    fun backToStart4() {

        assertThat(
            backToStart(
                4,
                mutableMapOf(
                    1 to mutableSetOf(2, 3, 4),
                    2 to mutableSetOf(1, 3, 4),
                    3 to mutableSetOf(1, 2, 4),
                    4 to mutableSetOf(1, 2, 3)
                )
            ),
            equalTo(listOf(1))
        )
    }

    @Test
    fun backToStart5() {

        assertThat(
            backToStart(
                5,
                mutableMapOf(
                    1 to mutableSetOf(2, 3, 4, 5),
                    2 to mutableSetOf(1),
                    3 to mutableSetOf(1),
                    4 to mutableSetOf(1),
                    5 to mutableSetOf(1)
                )
            ),
            equalTo(listOf(1))
        )
    }

    @Test
    fun `backToStart6`() {
        assertThat(
            backToStart(
                3,
                mutableMapOf(
                    1 to mutableSetOf(2, 3),
                    2 to mutableSetOf(1, 4),
                    3 to mutableSetOf(1),
                    4 to mutableSetOf(2)
                )
            ), equalTo(listOf(1))
        )
    }

    @Test
    fun `backToStart7`() {
        assertThat(
            backToStart(
                2,
                mutableMapOf(
                    1 to mutableSetOf(3),
                    2 to mutableSetOf(3),
                    3 to mutableSetOf(1, 2)
                )
            ), equalTo(listOf(3, 1))
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