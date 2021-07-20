import org.hamcrest.CoreMatchers.equalTo
import org.junit.Assert.assertThat
import org.junit.Before
import org.junit.jupiter.api.Test


class ABC210Test {

    @Before
    fun setUp() {
    }

    @Test
    fun cabbage_5_3_20_15() {
        assertThat(
            cabbages(5L, 3L, 20L, 15L),
            equalTo(90L)
        )
    }

    @Test
    fun cabbage_10_10_100_1() {
        assertThat(
            cabbages(10L, 10L, 100L, 1L),
            equalTo(1000L)
        )
    }

    @Test
    fun cabbage_10_100_100_1() {
        assertThat(
            cabbages(10L, 100L, 100L, 1L),
            equalTo(1000L)
        )
    }

    @Test
    fun bouzuMekuri_5_00101() {
        assertThat(
            bouzuMekuri(5, "00101"),
            equalTo("Takahashi")
        )
    }

    @Test
    fun bouzuMekuri_3_010() {
        assertThat(
            bouzuMekuri(3, "010"),
            equalTo("Aoki")
        )
    }

    @Test
    fun bouzuMekuri_3_111() {
        assertThat(
            bouzuMekuri(3, "111"),
            equalTo("Takahashi")
        )
    }

    @Test
    fun colorfulCandies_7_3() {
        assertThat(
            colorfulCandies(7, 3, listOf(1, 2, 1, 2, 3, 3, 1)),
            equalTo(3)
        )
    }

    @Test
    fun colorfulCandies_5_5() {
        assertThat(
            colorfulCandies(5, 5, listOf(4, 4, 4, 4, 4)),
            equalTo(1)
        )
    }

    @Test
    fun colorfulCandies_10_6() {
        assertThat(
            colorfulCandies(
                10, 6,
                listOf(
                    304621362,//5 1
                    506696497,//2 2
                    304621362,//5
                    506696497,//2
                    834022578,//1 3
                    304621362,//5
                    414720753,//2 4
                    304621362,//5
                    304621362,//5
                    414720753 //2
                )
            ),
            equalTo(4)
        )
    }


}