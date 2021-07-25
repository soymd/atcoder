import org.hamcrest.CoreMatchers.equalTo
import org.junit.Assert.assertThat
import org.junit.Before
import org.junit.jupiter.api.Test


class ABC211Test {

    @Before
    fun setUp() {
    }

    @Test
    fun chokudai_chchokudai() {
        assertThat(chokudai("chchokudai"), equalTo(3))
    }

    @Test
    fun chokudai_ccchokudai() {
        assertThat(chokudai("ccchokudai"), equalTo(3))
    }

    @Test
    fun chokudai_chchokudaic() {
        assertThat(chokudai("chchokudaic"), equalTo(3))
    }

    @Test
    fun chokudai_atcoderrr() {
        assertThat(chokudai("atcoderrr"), equalTo(0))
    }

    @Test
    fun chokudai_chokudaichokudaichokudai() {
        assertThat(chokudai("chokudaichokudaichokudai"), equalTo(45))
    }

    @Test
    fun chokudai_chokudaichokudai() {
        assertThat(chokudai("chokudaichokudai"), equalTo(9))
    }

    @Test
    fun cycleHit_1() {
        assertThat(
            cycleHit("3B", "HR", "2B", "H"),
            equalTo("Yes")
        )
    }

    @Test
    fun cycleHit_2() {
        assertThat(
            cycleHit("2B", "3B", "HR", "3B"),
            equalTo("No")
        )
    }

    @Test
    fun bloodPressure_130_100() {
        assertThat(
            bloodPressure(130, 100),
            equalTo(110F)
        )
    }

//    @Test
//    fun bloodPressure_300_50() {
//        assertThat(
//            bloodPressure(300, 50),
//            equalTo(133.3333333F)
//        )
//    }

    @Test
    fun bloodPressure_123_123() {
        assertThat(
            bloodPressure(123, 123),
            equalTo(123F)
        )
    }

}