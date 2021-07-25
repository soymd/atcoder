import org.hamcrest.CoreMatchers.equalTo
import org.junit.Assert.assertThat
import org.junit.Before
import org.junit.jupiter.api.Test

class Itp1KtTest {

    @Before
    fun setUp() {
    }

    @Test
    fun `watch 46979`() {
        assertThat(watch(46979), equalTo("13:2:59"))
    }
}