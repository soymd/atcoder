import org.hamcrest.CoreMatchers.equalTo
import org.junit.Assert.assertThat
import org.junit.Before
import org.junit.jupiter.api.Test


class ABC212Test {

    @Before
    fun setUp() {
    }

    @Test
    fun `weakPassword 7777`() {
        assertThat(weakPassword("7777"), equalTo("Weak"))
    }

    @Test
    fun `weakPassword 0112`() {
        assertThat(weakPassword("0112"), equalTo("Strong"))
    }

    @Test
    fun `weakPassword 9012`() {
        assertThat(weakPassword("9012"), equalTo("Weak"))
    }

    @Test
    fun `alloy 50 50`() {
        assertThat(alloy(50, 50), equalTo("Alloy"))
    }

    @Test
    fun `alloy 100 0`() {
        assertThat(alloy(100, 0), equalTo("Gold"))
    }

    @Test
    fun `alloy 0 100`() {
        assertThat(alloy(0, 100), equalTo("Silver"))
    }

    @Test
    fun `alloy 100 2`() {
        assertThat(alloy(100, 2), equalTo("Alloy"))
    }
}