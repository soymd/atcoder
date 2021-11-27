import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.AfterEach
import org.junit.jupiter.api.BeforeEach
import org.junit.jupiter.api.Nested
import org.junit.jupiter.api.Test

class ABC229Test {
    @Nested
    inner class Cheese {
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
        fun cheese_1() {
            input.inputln("3 5")//n種類 wグラム
            input.inputln("3 1")//gあたりおいしさa, 総グラムb
            input.inputln("4 2")
            input.inputln("2 3")

            cheese()

            val result = output.readLines()
            assertThat(result, equalTo(listOf("15")))
            //1種類目のチーズを1[g]、2種類目のチーズを2[g]、3種類目のチーズを2[g]乗せるのが最適です。
            //このとき、ピザのおいしさは15となります。
            //3 + 8 + 4
        }

        @Test
        fun cheese_2() {
            input.inputln("4 100")
            input.inputln("6 2")//12
            input.inputln("1 5")//5
            input.inputln("3 9")//27
            input.inputln("8 7")//56

            cheese()

            val result = output.readLines()
            assertThat(result, equalTo(listOf("100")))
            //チーズの重量の総和が W [g] に満たないケースもあります。
        }

        @Test
        fun cheese_3() {
            input.inputln("10 3141")
            input.inputln("314944731 649")
            input.inputln("140276783 228")
            input.inputln("578012421 809")
            input.inputln("878510647 519")
            input.inputln("925326537 943")
            input.inputln("337666726 611")
            input.inputln("879137070 306")
            input.inputln("87808915 39")
            input.inputln("756059990 244")
            input.inputln("228622672 291")

            cheese()

//            val resultL = output.readLines().map { it.toLong() }
//            val diff = resultL.first() - 2357689932073L

            val result = output.readLines()
            assertThat(result, equalTo(listOf("2357689932073")))
        }
    }

    @Nested
    inner class FirstGrid {
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
        fun firstGrid_1() {
            input.inputln("##")
            input.inputln(".#")

            firstGrid()

            val result = output.readLines()
            assertThat(result, equalTo(listOf("Yes")))
        }

        @Test
        fun firstGrid_2() {
            input.inputln(".#")
            input.inputln("#.")

            firstGrid()

            val result = output.readLines()
            assertThat(result, equalTo(listOf("No")))
        }

        @Test
        fun firstGrid_3() {
            input.inputln("##")
            input.inputln("..")

            firstGrid()

            val result = output.readLines()
            assertThat(result, equalTo(listOf("Yes")))
        }
    }

    @Nested
    inner class HardCalculation {
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
        fun `hardCalculation_229 390`() {
            input.inputln("229 390")

            hardCalculation()

            val result = output.readLines()
            assertThat(result, equalTo(listOf("Hard")))
        }

        @Test
        fun `hardCalculation_123456789 9876543210`() {
            input.inputln("123456789 9876543210")

            hardCalculation()

            val result = output.readLines()
            assertThat(result, equalTo(listOf("Easy")))
        }

        @Test
        fun `hardCalculation_9 11`() {
            input.inputln("9 11")

            hardCalculation()

            val result = output.readLines()
            assertThat(result, equalTo(listOf("Hard")))
        }

        @Test
        fun `hardCalculation_11 9`() {
            input.inputln("11 9")

            hardCalculation()

            val result = output.readLines()
            assertThat(result, equalTo(listOf("Hard")))
        }
    }
}