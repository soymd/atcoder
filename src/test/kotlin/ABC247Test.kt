import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.AfterEach
import org.junit.jupiter.api.BeforeEach
import org.junit.jupiter.api.Nested
import org.junit.jupiter.api.Test

class ABC247Test {
    @Nested
    inner class A {
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
        fun a_1() {
            input.inputln("1011")

            abc247a()

            val result = output.readLines()
            assertThat(result, equalTo(listOf("0101")))
        }

        @Test
        fun a_2() {
            input.inputln("0000")

            abc247a()

            val result = output.readLines()
            assertThat(result, equalTo(listOf("0000")))
        }

        @Test
        fun a_3() {
            input.inputln("1111")

            abc247a()

            val result = output.readLines()
            assertThat(result, equalTo(listOf("0111")))
        }

//        @Test
//        fun a_4() {
//            input.inputln("")
//
//            //()
//
//            val result = output.readLines()
//            assertThat(result, equalTo(listOf("")))
//        }
//
//        @Test
//        fun a_5() {
//            input.inputln("")
//
//            //()
//
//            val result = output.readLines()
//            assertThat(result, equalTo(listOf("")))
//        }
    }

    @Nested
    inner class B {
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
        fun a_1() {
            input.inputln("3")
            input.inputln("tanaka taro")
            input.inputln("tanaka jiro")
            input.inputln("suzuki hanako")

            abc247b()

            val result = output.readLines()
            assertThat(result, equalTo(listOf("Yes")))
        }

        @Test
        fun a_2() {
            input.inputln("3")
            input.inputln("aaa bbb")
            input.inputln("xxx aaa")
            input.inputln("bbb yyy")

            abc247b()

            val result = output.readLines()
            assertThat(result, equalTo(listOf("No")))
        }

        @Test
        fun a_3() {
            input.inputln("2")
            input.inputln("tanaka taro")
            input.inputln("tanaka taro")

            abc247b()

            val result = output.readLines()
            assertThat(result, equalTo(listOf("No")))
        }

        @Test
        fun a_4() {
            input.inputln("3")
            input.inputln("takahashi chokudai")
            input.inputln("aoki kensho")
            input.inputln("snu ke")

            abc247b()

            val result = output.readLines()
            assertThat(result, equalTo(listOf("Yes")))
        }
//
//        @Test
//        fun a_5() {
//            input.inputln("")
//
//            //()
//
//            val result = output.readLines()
//            assertThat(result, equalTo(listOf("")))
//        }
    }

    @Nested
    inner class C {
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
        fun a_1() {
            input.inputln("")

            //()

            val result = output.readLines()
            assertThat(result, equalTo(listOf("")))
        }

        @Test
        fun a_2() {
            input.inputln("")

            //()

            val result = output.readLines()
            assertThat(result, equalTo(listOf("")))
        }

        @Test
        fun a_3() {
            input.inputln("")

            //()

            val result = output.readLines()
            assertThat(result, equalTo(listOf("")))
        }

//        @Test
//        fun a_4() {
//            input.inputln("")
//
//            //()
//
//            val result = output.readLines()
//            assertThat(result, equalTo(listOf("")))
//        }
//
//        @Test
//        fun a_5() {
//            input.inputln("")
//
//            //()
//
//            val result = output.readLines()
//            assertThat(result, equalTo(listOf("")))
//        }
    }
}