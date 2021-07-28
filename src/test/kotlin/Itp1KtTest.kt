import org.hamcrest.CoreMatchers.equalTo
import org.junit.Assert.assertThat
import org.junit.Before
import org.junit.jupiter.api.Test

class Itp1KtTest {

    @Before
    fun setUp() {
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