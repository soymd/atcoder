import org.hamcrest.CoreMatchers.equalTo
import org.junit.Assert.assertThat
import org.junit.Before
import org.junit.jupiter.api.Test

class Itp1KtTest {

    @Before
    fun setUp() {
    }

    @Test
    fun `simpleCalculator 1`() {
        assertThat(
            simpleCalculator(
                listOf(
                    "1 + 2",
                    "56 - 18",
                    "13 * 2",
                    "100 / 10",
                    "27 + 81"
                )
            ), equalTo(
                listOf(3, 38, 26, 10, 108)
            )
        )
    }

    @Test
    fun `circle 2`() {
        assertThat(circle(2.0), equalTo("12.566371 12.566371"))
    }

    @Test
    fun `circle 3`() {
        assertThat(circle(3.0), equalTo("28.274334 18.849556"))
    }

    @Test
    fun `howManyDivisors 5 14 80`() {
        assertThat(howManyDivisors(5, 14, 80), equalTo(3))
    }

    @Test
    fun `circleInRectangle 5 4 1 1 1`() {
        assertThat(circleInRectangle(5, 4, 1, 1, 1), equalTo("Yes"))
    }

    @Test
    fun `circleInRectangle 5 4 2 2 1`() {
        assertThat(circleInRectangle(5, 4, 2, 2, 1), equalTo("Yes"))
    }

    @Test
    fun `circleInRectangle 5 4 2 4 1`() {
        assertThat(circleInRectangle(5, 4, 2, 4, 1), equalTo("No"))
    }

    @Test
    fun `sortingThreeNumbers 3 8 1`() {
        assertThat(sortingThreeNumbers(3, 8, 1), equalTo("1 3 8"))
    }

    @Test
    fun `watch 46979`() {
        assertThat(watch(46979), equalTo("13:2:59"))
    }
}