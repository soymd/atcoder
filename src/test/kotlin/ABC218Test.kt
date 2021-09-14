import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.AfterEach
import org.junit.jupiter.api.BeforeEach
import org.junit.jupiter.api.Test


class ABC218Test {

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
    fun shapes_1() {
        input.inputln("5")
        input.inputln(".....")
        input.inputln("..#..")
        input.inputln(".###.")
        input.inputln(".....")
        input.inputln(".....")

        input.inputln(".....")
        input.inputln(".....")
        input.inputln("....#")
        input.inputln("...##")
        input.inputln("....#")

        shapes()

        val result = output.readLines()
        assertThat(result, equalTo(listOf("Yes")))
    }

    @Test
    fun shapes_2() {
        input.inputln("5")
        input.inputln("#####")
        input.inputln("##..#")
        input.inputln("#..##")
        input.inputln("#####")
        input.inputln(".....")

        input.inputln("#####")
        input.inputln("#..##")
        input.inputln("##..#")
        input.inputln("#####")
        input.inputln(".....")

        shapes()

        val result = output.readLines()
        assertThat(result, equalTo(listOf("No")))
    }

    @Test
    fun shapes_3() {
        input.inputln("4")
        input.inputln("#...")
        input.inputln("..#.")
        input.inputln("..#.")
        input.inputln("....")

        input.inputln("#...")
        input.inputln("#...")
        input.inputln("..#.")
        input.inputln("....")

        shapes()

        val result = output.readLines()
        assertThat(result, equalTo(listOf("Yes")))
    }

    @Test
    fun shapes_4() {
        input.inputln("4")
        input.inputln("#...")
        input.inputln(".##.")
        input.inputln("..#.")
        input.inputln("....")

        input.inputln("##..")
        input.inputln("#...")
        input.inputln("..#.")
        input.inputln("....")

        shapes()

        val result = output.readLines()
        assertThat(result, equalTo(listOf("No")))
    }

    @Test
    fun shapes_5() {
        input.inputln("5")
        input.inputln("#####")
        input.inputln("#####")
        input.inputln("#####")
        input.inputln("#####")
        input.inputln("#####")

        input.inputln("#####")
        input.inputln("#####")
        input.inputln("#####")
        input.inputln("#####")
        input.inputln("#####")

        shapes()

        val result = output.readLines()
        assertThat(result, equalTo(listOf("Yes")))
    }

    @Test
    fun shapes_6() {
        input.inputln("3")
        input.inputln("##.")
        input.inputln("#..")
        input.inputln("...")

        input.inputln("...")
        input.inputln("##.")
        input.inputln("#..")

        shapes()

        val result = output.readLines()
        assertThat(result, equalTo(listOf("Yes")))
    }

    @Test
    fun shapes_7() {
        input.inputln("3")
        input.inputln("##.")
        input.inputln("#..")
        input.inputln("...")

        input.inputln("...")
        input.inputln("..#")
        input.inputln(".##")

        shapes()

        val result = output.readLines()
        assertThat(result, equalTo(listOf("Yes")))
    }

    @Test
    fun shapes_8() {
        input.inputln("3")
        input.inputln("##.")
        input.inputln("#..")
        input.inputln("...")

        input.inputln(".##")
        input.inputln("..#")
        input.inputln("...")

        shapes()

        val result = output.readLines()
        assertThat(result, equalTo(listOf("Yes")))
    }

    @Test
    fun shapes_9() {
        input.inputln("3")
        input.inputln("##.")
        input.inputln("#..")
        input.inputln("...")

        input.inputln("...")
        input.inputln(".##")
        input.inputln("..#")

        shapes()

        val result = output.readLines()
        assertThat(result, equalTo(listOf("Yes")))
    }

    @Test
    fun shapes_10() {
        input.inputln("1")
        input.inputln(".")

        input.inputln(".")

        shapes()

        val result = output.readLines()
        assertThat(result, equalTo(listOf("Yes")))
    }

    @Test
    fun shapes_11() {
        input.inputln("1")
        input.inputln("#")

        input.inputln("#")

        shapes()

        val result = output.readLines()
        assertThat(result, equalTo(listOf("Yes")))
    }

    @Test
    fun shapes_12() {
        input.inputln("1")
        input.inputln("#")

        input.inputln(".")

        shapes()

        val result = output.readLines()
        assertThat(result, equalTo(listOf("No")))
    }

    @Test
    fun shapes_13() {
        input.inputln("1")
        input.inputln("#")

        input.inputln(".")

        shapes()

        val result = output.readLines()
        assertThat(result, equalTo(listOf("No")))
    }

    @Test
    fun shapes_14() {
        input.inputln("5")
        input.inputln("#####")
        input.inputln("#####")
        input.inputln("##.##")
        input.inputln("#####")
        input.inputln("#####")

        input.inputln("#####")
        input.inputln("#####")
        input.inputln("##.##")
        input.inputln("#####")
        input.inputln("#####")

        shapes()

        val result = output.readLines()
        assertThat(result, equalTo(listOf("Yes")))
    }

    @Test
    fun shapes_15() {
        input.inputln("4")
        input.inputln("....")
        input.inputln("#...")
        input.inputln(".#..")
        input.inputln("....")

        input.inputln(".#..")
        input.inputln("....")
        input.inputln("..#.")
        input.inputln("....")

        shapes()

        val result = output.readLines()
        assertThat(result, equalTo(listOf("No")))
    }

    @Test
    fun qwerty_1() {
        input.inputln("1 2 3 4 5 6 7 8 9 10 11 12 13 14 15 16 17 18 19 20 21 22 23 24 25 26")

        qwerty()

        val result = output.readLines()

        assertThat(result, equalTo(listOf("abcdefghijklmnopqrstuvwxyz")))
    }

    @Test
    fun qwerty_2() {
        input.inputln("2 1 3 4 5 6 7 8 9 10 11 12 13 14 15 16 17 18 19 20 21 22 23 24 25 26")

        qwerty()

        val result = output.readLines()

        assertThat(result, equalTo(listOf("bacdefghijklmnopqrstuvwxyz")))
    }

    @Test
    fun qwerty_3() {
        input.inputln("5 11 12 16 25 17 18 1 7 10 4 23 20 3 2 24 26 19 14 9 6 22 8 13 15 21")

        qwerty()

        val result = output.readLines()

        assertThat(result, equalTo(listOf("eklpyqragjdwtcbxzsnifvhmou")))
    }
}