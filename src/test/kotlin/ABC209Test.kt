import org.hamcrest.CoreMatchers.equalTo
import org.junit.Assert.assertThat
import org.junit.Before
import org.junit.jupiter.api.Test


class ABC209Test {

    @Before
    fun setUp() {
    }

    @Test
    fun counting_2_4() {
        assertThat(counting(2, 4), equalTo(3))
    }

    @Test
    fun counting_10_100() {
        assertThat(counting(10, 100), equalTo(91))
    }

    @Test
    fun counting_3_2() {
        assertThat(counting(3, 2), equalTo(0))
    }

    @Test
    fun counting_2_2() {
        assertThat(counting(2, 2), equalTo(0))
    }

    @Test
    fun `Can you buy them all 2 3 1 3`() {
        assertThat(canYouBuyThemAll(2, 3, listOf(1, 3)), equalTo("Yes"))
    }

    @Test
    fun `Can you buy them all 4 10 3 3 4 4`() {
        assertThat(canYouBuyThemAll(4, 10, listOf(3, 3, 4, 4)), equalTo("No"))
    }

    @Test
    fun `Can you buy them all 4 10 3 3 4 2`() {
        assertThat(canYouBuyThemAll(3, 10, listOf(3, 3, 4)), equalTo("Yes"))
    }

    @Test
    fun `Can you buy them all 4 10 3 3`() {
        assertThat(canYouBuyThemAll(3, 10, listOf(3, 3, 5)), equalTo("Yes"))
    }

    @Test
    fun `Can you buy them all 3 10`() {
        assertThat(canYouBuyThemAll(3, 10, listOf(3, 3, 6)), equalTo("No"))
    }

    @Test
    fun `Can you buy them all 8 30 `() {
        assertThat(canYouBuyThemAll(8, 30, listOf(3, 1, 4, 1, 5, 9, 2, 6)), equalTo("Yes"))
    }

    @Test
    fun `notEqual 2, 1 3`() {
        assertThat(notEqual(2, listOf(1, 3)), equalTo(2L))
        /*
          // 1 2
             1 3
          // 2 1
             2 3
          // 3 1
          // 3 2
        */
    }

    @Test
    fun `notEqual 2, 1 1`() {
        assertThat(notEqual(2, listOf(1, 1)), equalTo(0L))
        /*
        totalPermutation = 1 になってそこから何も引かれない(diffPattern = 0)ままテスト終了
         - totalPermutationの出し方が不味い
         - diffPatternの出し方が不味い

        */
    }

    @Test
    fun `notEqual 4, 3 3 4 4`() {
        assertThat(notEqual(4, listOf(3, 3, 4, 4)), equalTo(12L))
        /*
        i:1 j:2
        i:1 j:3
        i:1 j:4
        i:2 j:3
        i:2 j:4
        i:3 j:4

        1 2 3 4
        1 2 4 3
        1 3 2 4
        1 3 4 2
    //        1 4 2 3
    //        1 4 3 2

        2 1 3 4
        2 1 4 3
        2 3 1 4
        2 3 4 1
    //        2 4 1 3
    //        2 4 3 1

        3 2 1 4
        3 2 4 1
        3 1 2 4
        3 1 4 2
    //        3 4 2 1
    //        3 4 1 2

    //        4 2 3 1
    //        4 2 1 3
    //        4 3 2 1
    //        4 3 1 2
    //        4 1 2 3
    //        4 1 3 2
        */
    }

    @Test
    fun `notEqual 4, 1 3 4 4`() {
        assertThat(notEqual(4, listOf(1, 3, 4, 4)), equalTo(4L))
        /*
        1 2 3 4
        1 2 4 3
        1 3 2 4
        1 3 4 2
    //        1 4 2 3
    //        1 4 3 2

//        2 1 3 4
//        2 1 4 3
//        2 3 1 4
//        2 3 4 1
    //        2 4 1 3
    //        2 4 3 1

//        3 2 1 4
//        3 2 4 1
//        3 1 2 4
//        3 1 4 2
    //        3 4 2 1
    //        3 4 1 2

    //        4 2 3 1
    //        4 2 1 3
    //        4 3 2 1
    //        4 3 1 2
    //        4 1 2 3
    //        4 1 3 2
        */
    }

    @Test
    fun `notEqual 4, 1 4 4 4`() {
        assertThat(notEqual(4, listOf(1, 4, 4, 4)), equalTo(6L))
        /*
        1 2 3 4
        1 2 4 3
        1 3 2 4
        1 3 4 2
        1 4 2 3
        1 4 3 2

//        2 1 3 4
//        2 1 4 3
//        2 3 1 4
//        2 3 4 1
    //        2 4 1 3
    //        2 4 3 1

//        3 2 1 4
//        3 2 4 1
//        3 1 2 4
//        3 1 4 2
    //        3 4 2 1
    //        3 4 1 2

    //        4 2 3 1
    //        4 2 1 3
    //        4 3 2 1
    //        4 3 1 2
    //        4 1 2 3
    //        4 1 3 2
        */
    }

    @Test
    fun `notEqual 4, 2 3 4 4`() {
        assertThat(notEqual(4, listOf(2, 3, 4, 4)), equalTo(8L))
        /*
        1 2 3 4
        1 2 4 3
        1 3 2 4
        1 3 4 2
    //        1 4 2 3
    //        1 4 3 2

        2 1 3 4
        2 1 4 3
        2 3 1 4
        2 3 4 1
    //        2 4 1 3
    //        2 4 3 1

//        3 2 1 4
//        3 2 4 1
//        3 1 2 4
//        3 1 4 2
    //        3 4 2 1
    //        3 4 1 2

    //        4 2 3 1
    //        4 2 1 3
    //        4 3 2 1
    //        4 3 1 2
    //        4 1 2 3
    //        4 1 3 2
        */
    }

    @Test
    fun `notEqual 3, 1 3 4`() {
        assertThat(notEqual(3, listOf(1, 3, 4)), equalTo(4L))

        /*
        1 2 3
        1 2 4
        1 3 2
        1 3 4
//        1 4 2
//        1 4 3

        2 1 3
        2 1 4
        2 3 1
        2 3 4
        2 4 1
        2 4 3

        3 2 1
        3 2 4
        3 1 2
        3 1 4
        3 4 2
        3 4 1

        4 2 3
        4 2 1
        4 3 2
        4 3 1
        4 1 2
        4 1 3
        */
    }

    @Test
    fun `notEqual 10,`() {
        assertThat(
            notEqual(
                10,
                listOf(
                    999999917,
                    999999914,
                    999999923,
                    999999985,
                    999999907,
                    999999965,
                    999999914,
                    999999908,
                    999999951,
                    999999979
                )
            ), equalTo(405924645L)
        )
    }


    @Test
    fun `permutation 5P5`() {
        assertThat(permutation(5, 5), equalTo(120L))
    }

    @Test
    fun `permutation 5P4`() {
        assertThat(permutation(5, 4), equalTo(120L))
    }

    @Test
    fun `permutation 5P3`() {
        assertThat(permutation(5, 3), equalTo(60L))
    }

    @Test
    fun `permutation 5P2`() {
        assertThat(permutation(5, 2), equalTo(20L))
    }

    @Test
    fun `permutation 5P1`() {
        assertThat(permutation(5, 1), equalTo(5L))
    }

    @Test
    fun `factorial 5`() {
        assertThat(factorial(5), equalTo(120L))
    }

    @Test
    fun `factorial 1`() {
        assertThat(factorial(1), equalTo(1L))
    }
}