class ABC228Test {
//    @Nested
//    inner class SignUpRequest {
//        private val input = StandardInputStream()
//        private val output = StandardOutputStream()
//
//        @BeforeEach
//        fun setUp() {
//            System.setIn(input)
//            System.setOut(output)
//        }
//
//        @AfterEach
//        fun tearDown() {
//            System.setIn(null)
//            System.setOut(null)
//        }
//
//        @Test
//        fun signUpRequest_1() {
//            input.inputln("5")
//            input.inputln("e869120")
//            input.inputln("atcoder")
//            input.inputln("e869120")
//            input.inputln("square1001")
//            input.inputln("square1001")
//
//            signUpRequest()
//
//            val result = output.readLines().map { it.toInt() }
//            assertThat(result, equalTo(listOf(1, 2, 4)))
//            //1 日目にはユーザ名 e869120 が申請され、このユーザ名のユーザはいないため、LowCoder に登録されます。
//            //2 日目にはユーザ名 atcoder が申請され、このユーザ名のユーザはいないため、LowCoder に登録されます。
//            //3 日目にはユーザ名 e869120 が申請されますが、このユーザ名のユーザは既に登録されているため、受理されません。
//            //4 日目にはユーザ名 square1001 が申請され、このユーザ名のユーザはいないため、LowCoder に登録されます。
//            //5 日目にはユーザ名 square1001 が申請されますが、このユーザ名のユーザは既に登録されているため、受理されません。
//        }
//
//        @Test
//        fun signUpRequest_2() {
//            input.inputln("4")
//            input.inputln("taro")
//            input.inputln("hanako")
//            input.inputln("yuka")
//            input.inputln("takashi")
//
//            signUpRequest()
//
//            val result = output.readLines().map { it.toInt() }
//            assertThat(result, equalTo(listOf(1, 2, 3, 4)))
//            //受理されない登録申請が存在しない場合もあります。
//        }
//
//        @Test
//        fun signUpRequest_3() {
//            input.inputln("10")
//            input.inputln("square869120")
//            input.inputln("square869120")
//            input.inputln("square869120")
//            input.inputln("square869120")
//            input.inputln("square869120")
//            input.inputln("square869120")
//            input.inputln("square869120")
//            input.inputln("square869120")
//            input.inputln("square869120")
//            input.inputln("square869120")
//
//            signUpRequest()
//
//            val result = output.readLines().map { it.toInt() }
//            assertThat(result, equalTo(listOf(1)))
//            //S i ​ がすべて同じである可能性もあります。。
//        }
//    }
}