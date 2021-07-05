import org.hamcrest.CoreMatchers.equalTo
import org.junit.Assert.assertThat
import org.junit.Before
import org.junit.jupiter.api.Test


class ABC207BTest {

    @Before
    fun setUp() {
    }

    @Test
    fun test_hydrate() {
        val (a, b, c, d) = listOf(5, 2, 3, 2)

        assertThat(hydrate(a, b, c, d), equalTo(2))
    }

    @Test
    fun test_hydrate_2() {
        val (a, b, c, d) = listOf(6, 9, 2, 3)

        assertThat(hydrate(a, b, c, d), equalTo(-1))
    }

    @Test
    fun test_hydrate_3() {
        val (a, b, c, d) = listOf(2, 1, 1, 2)

        assertThat(hydrate(a, b, c, d), equalTo(2))
    }

    @Test
    fun test_hydrate_4() {
        val (a, b, c, d) = listOf(10, 1, 2, 2)

        assertThat(hydrate(a, b, c, d), equalTo(4))
    }

    @Test
    fun test_hydrate_5() {
        val (a, b, c, d) = listOf(1, 1, 1, 1)

        assertThat(hydrate(a, b, c, d), equalTo(-1))
    }

    @Test
    fun test_hydrate_6() {
        val (a, b, c, d) = listOf(1, 2, 2, 2)

        assertThat(hydrate(a, b, c, d), equalTo(1))
    }

    @Test
    fun test_hydrate_7() {
        val (a, b, c, d) = listOf(2, 2, 2, 2)

        assertThat(hydrate(a, b, c, d), equalTo(1))
    }

    @Test
    fun test_hydrate_8() {
        val (a, b, c, d) = listOf(2, 2, 2, 1)

        assertThat(hydrate(a, b, c, d), equalTo(-1))
    }

    @Test
    fun test_hydrate_9() {
        val (a, b, c, d) = listOf(1, 2, 2, 1)

        assertThat(hydrate(a, b, c, d), equalTo(-1))
    }

    @Test
    fun test_hydrate_10() {
        val (a, b, c, d) = listOf(1, 2, 2, 1)

        assertThat(hydrate(a, b, c, d), equalTo(-1))
    }

    @Test
    fun test_hydrate_11() {
        val (a, b, c, d) = listOf(1, 1, 1, 2)

        assertThat(hydrate(a, b, c, d), equalTo(1))
    }

    @Test
    fun test_hydrate_12() {
        val (a, b, c, d) = listOf(99792, 61343, 5112, 12)

        assertThat(hydrate(a, b, c, d), equalTo(99792))
    }

}