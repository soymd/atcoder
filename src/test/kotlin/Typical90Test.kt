import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.AfterEach
import org.junit.jupiter.api.BeforeEach
import org.junit.jupiter.api.Nested
import org.junit.jupiter.api.Test


class Typical90Test {
    @Nested
    class CubicCake {
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
        fun cubicCake_a() {
            input.inputln("2 2 6")

            cubicCake()

            val result = output.readLines()
            assertThat(result, equalTo(listOf("2")))
        }

        @Test
        fun cubicCake_1() {
            input.inputln("2 2 3")

            cubicCake()

            val result = output.readLines()
            assertThat(result, equalTo(listOf("4")))
        }

        @Test
        fun cubicCake_2() {
            input.inputln("2 2 4")

            cubicCake()

            val result = output.readLines()
            assertThat(result, equalTo(listOf("1")))
        }

//        @Test
//        fun cubicCake_3() {
//            input.inputln("1000000000000000000 999999999999999999 999999999999999998")
//
//            cubicCake()
//
//            val result = output.readLines()
//            assertThat(result, equalTo(listOf("2999999999999999994")))
//        }
    }

    @Nested
    class LogInequality {
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
        fun logInequality_b() {
            input.inputln("8650415919381337932 17 13")

            logInequality()

            val result = output.readLines()
            assertThat(result, equalTo(listOf("Yes")))
        }

        @Test
        fun `logInequality_Killer_Type_A_-1`() {
            input.inputln("8650415919381337934 17 13")

            logInequality()

            val result = output.readLines()
            assertThat(result, equalTo(listOf("No")))
        }

        @Test
        fun logInequality_1() {
            input.inputln("4 3 2")

            logInequality()

            val result = output.readLines()
            assertThat(result, equalTo(listOf("Yes")))
            //log 2 ​ 4=2,3log 2 ​ 2=3×1=3 より、 log 2 ​ 4<3log 2 ​ 2 です。
        }

        @Test
        fun logInequality_2() {
            input.inputln("16 3 2")

            logInequality()

            val result = output.readLines()
            assertThat(result, equalTo(listOf("No")))
            //log 2 ​ 16=4,3log 2 ​ 2=3×1=3 より、 log 2 ​ 16<3log 2 ​ 2 ではありません。
        }

        @Test
        fun logInequality_3() {
            input.inputln("8 3 2")

            logInequality()

            val result = output.readLines()
            assertThat(result, equalTo(listOf("No")))
            //log 2 ​ 8=3,3log 2 ​ 2=3×1=3 より、 log 2 ​ 8=3log 2 ​ 2 です。 両辺の値が等しいときも No を出力することに注意してください。
        }
    }

    @Nested
    class StatueOfChokudai {
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
        fun statueOfChokudai_a() {
            input.inputln("360")//T分で1周
            input.inputln("2 1 1")//L X Y
            input.inputln("9")//Q
            input.inputln("10")//E
            input.inputln("30")//E
            input.inputln("45")//E
            input.inputln("60")//E
            input.inputln("89")//E
            input.inputln("120")//E
            input.inputln("210")//E
            input.inputln("240")//E
            input.inputln("330")//E

            statueOfChokudai()

            val result = output.readLines()
            assertThat(result, equalTo(listOf("0.000000000000")))
        }

        @Test
        fun statueOfChokudai_1() {
            input.inputln("4")//T分で1周
            input.inputln("2 1 1")//L X Y
            input.inputln("4")//Q
            input.inputln("0")//E
            input.inputln("1")//E
            input.inputln("2")//E
            input.inputln("3")//E

            statueOfChokudai()
//高橋直大像は、座標 (1,1,0) に存在します。
//時刻 0 において、E869120 君は座標 (0,0,0) に存在し、E869120 君から見た高橋直大像の俯角は 0 度です。
//時刻 3 において、E869120 君は座標 (0,1,1) に存在し、E869120 君から見た高橋直大像の俯角は 45 度です。
            val result = output.readLines()
            assertThat(
                result, equalTo(
                    listOf(
                        "0.000000000000",
                        "24.094842552111",
                        "54.735610317245",
                        "45.000000000000"
                    )
                )
            )
        }

        @Test
        fun statueOfChokudai_2() {
            input.inputln("5121")//T
            input.inputln("312000000 4123 3314")//L X Y
            input.inputln("6")//Q
            input.inputln("123")//E
            input.inputln("12")//E
            input.inputln("445")//E
            input.inputln("4114")//E
            input.inputln("42")//E
            input.inputln("1233")//E

            statueOfChokudai()

            val result = output.readLines()
            assertThat(
                result, equalTo(
                    listOf(
                        "4.322765775902",
                        "0.421184234768",
                        "15.640867693969",
                        "35.396039162484",
                        "1.475665637902",
                        "43.338582976959"
                    )
                )
            )
        }
    }

    @Nested
    class MinimumCoins {
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
        fun minimumCoins_a() {
            input.inputln("20") //N
            input.inputln("8 7 5")//A B C

            minimumCoins()

            val result = output.readLines()
            assertThat(result, equalTo(listOf("3")))
        }

        @Test
        fun minimumCoins_1() {
            input.inputln("227") //N
            input.inputln("21 47 56")//A B C

            minimumCoins()

            val result = output.readLines()
            assertThat(result, equalTo(listOf("5")))
            //21 円硬貨を 1 枚、47 円硬貨を 2 枚、56 円硬貨を 2 枚使って支払うのが最適です。
            //合計で 5 枚となります。
        }

        @Test
        fun minimumCoins_2() {
            input.inputln("9999") //N
            input.inputln("1 5 10")//A B C

            minimumCoins()

            val result = output.readLines()
            assertThat(result, equalTo(listOf("1004")))
            //1 円硬貨を 4 枚、5 円硬貨を 1 枚、10 円硬貨を 999 枚使って支払うのが最適です。
            //合計で 1004 枚となります。
        }

        @Test
        fun minimumCoins_3() {
            input.inputln("998244353") //N
            input.inputln("314159 265358 97932")//A B C

            minimumCoins()

            val result = output.readLines()
            assertThat(result, equalTo(listOf("3333")))
        }

        @Test
        fun minimumCoins_4() {
            input.inputln("100000000") //N
            input.inputln("10001 10002 10003")//A B C

            minimumCoins()

            val result = output.readLines()
            assertThat(result, equalTo(listOf("9998")))
        }

        @Test
        fun minimumCoins_rand_01() {
            input.inputln("825929284") //N
            input.inputln("86728 105490 106772")//A B C

            minimumCoins()

            val result = output.readLines()
            assertThat(result, equalTo(listOf("7775")))
        }

        @Test
        fun minimumCoins_small_1() {
            input.inputln("25297") //N
            input.inputln("1 4 3")//A B C

            minimumCoins()

            val result = output.readLines()
            assertThat(result, equalTo(listOf("6325")))
        }

        @Test
        fun minimumCoins_small_2() {
            input.inputln("972046963") //N
            input.inputln("945667046 972046963 3805433")//A B C

            minimumCoins()

            val result = output.readLines()
            assertThat(result, equalTo(listOf("1")))
        }
    }

    @Nested
    class WeUsedToSingASongTogether {
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
        fun weUsedToSingASongTogether_1() {
            input.inputln("1")  //N
            input.inputln("869")//A 家位置
            input.inputln("120")//B 学校

            weUsedToSingASongTogether()

            val result = output.readLines()
            assertThat(result, equalTo(listOf("749")))
            //小学生 1 の家と小学校 1 の距離は ∣869−120∣=749 です。
            //この入力では小学生 1 が必ず小学校 1 に通うことになるため、
            //この値が不便さとして考えられる唯一の値であり、最小値です。
        }

        @Test
        fun weUsedToSingASongTogether_2() {
            input.inputln("6")
            input.inputln("8 6 9 1 2 0")
            input.inputln("1 5 7 2 3 9")

            weUsedToSingASongTogether()

            val result = output.readLines()
            assertThat(result, equalTo(listOf("5")))
            //小学生 1,2,3,4,5,6 をそれぞれ小学校 3,2,6,4,5,1 に通わせることにすると、
            //不便さは ∣8−7∣+∣6−5∣+∣9−9∣+∣1−2∣+∣2−3∣+∣0−1∣=5 となります。
            //これ以上不便さを小さくすることはできないため、答えは 5 です。
        }

        @Test
        fun weUsedToSingASongTogether_3() {
            input.inputln("10")
            input.inputln("31 41 59 26 53 58 97 93 23 84")
            input.inputln("17 32 5 8 7 56 88 77 29 35")

            weUsedToSingASongTogether()

            val result = output.readLines()
            assertThat(result, equalTo(listOf("211")))
        }

        @Test
        fun weUsedToSingASongTogether_4() {
            input.inputln("20")
            input.inputln("804289382 846930886 681692776 714636914 957747792 424238335 719885386 649760491 596516649 189641420 25202361 350490026 783368690 102520058 44897761 967513925 365180539 540383425 304089172 303455735")
            input.inputln("35005211 521595368 294702567 726956428 336465782 861021530 278722862 233665123 145174065 468703135 101513928 801979801 315634021 635723058 369133068 125898166 59961392 89018454 628175011 656478041")

            weUsedToSingASongTogether()

            val result = output.readLines()
            assertThat(result, equalTo(listOf("2736647674")))
        }
    }

    @Nested
    class ScoreSumQueries {
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
        fun scoreSumQueries_1() {
            input.inputln("7")
            input.inputln("1 72")// 1
            input.inputln("2 78")// 2
            input.inputln("2 94")// 3
            input.inputln("1 23")// 4
            input.inputln("2 89")// 5
            input.inputln("1 40")// 6
            input.inputln("1 75")// 7
            input.inputln("1")
            input.inputln("2 6")

            scoreSumQueries()

            val result = output.readLines()
            assertThat(result, equalTo(listOf("63 261")))
            //学籍番号 2∼6 番の 1 組生徒における、期末試験合計点は 23+40=63 です。
            //また、学籍番号 2∼6 番の 2 組生徒における、期末試験合計点は 78+94+89=261 です。
        }

        @Test
        fun scoreSumQueries_2() {
            input.inputln("7")
            input.inputln("1 72")
            input.inputln("2 78")
            input.inputln("2 94")
            input.inputln("1 23")
            input.inputln("2 89")
            input.inputln("1 40")
            input.inputln("1 75")
            input.inputln("10")
            input.inputln("1 3")
            input.inputln("2 4")
            input.inputln("3 5")
            input.inputln("4 6")
            input.inputln("5 7")
            input.inputln("1 5")
            input.inputln("2 6")
            input.inputln("3 7")
            input.inputln("1 6")
            input.inputln("2 7")

            scoreSumQueries()

            val result = output.readLines()
            assertThat(
                result, equalTo(
                    listOf(
                        "72 172",
                        "23 172",
                        "23 183",
                        "63 89",
                        "115 89",
                        "95 261",
                        "63 261",
                        "138 183",
                        "135 261",
                        "138 261"
                    )
                )
            )
        }

        @Test
        fun scoreSumQueries_3() {
            input.inputln("1")
            input.inputln("1 100")
            input.inputln("3")
            input.inputln("1 1")
            input.inputln("1 1")
            input.inputln("1 1")

            scoreSumQueries()

            val result = output.readLines()
            assertThat(
                result, equalTo(
                    listOf(
                        "100 0",
                        "100 0",
                        "100 0"
                    )
                )
            )
        }

        @Test
        fun scoreSumQueries_4() {
            input.inputln("20")
            input.inputln("2 90")
            input.inputln("1 67")
            input.inputln("2 9")
            input.inputln("2 17")
            input.inputln("2 85")
            input.inputln("2 43")
            input.inputln("2 11")
            input.inputln("1 32")
            input.inputln("2 16")
            input.inputln("1 19")
            input.inputln("2 65")
            input.inputln("1 14")
            input.inputln("1 51")
            input.inputln("2 94")
            input.inputln("1 4")
            input.inputln("1 55")
            input.inputln("2 90")
            input.inputln("1 89")
            input.inputln("1 35")
            input.inputln("2 81")
            input.inputln("20")
            input.inputln("3 17")
            input.inputln("5 5")
            input.inputln("11 11")
            input.inputln("8 10")
            input.inputln("3 13")
            input.inputln("2 6")
            input.inputln("3 7")
            input.inputln("3 5")
            input.inputln("12 18")
            input.inputln("4 8")
            input.inputln("3 16")
            input.inputln("6 8")
            input.inputln("3 20")
            input.inputln("1 12")
            input.inputln("1 6")
            input.inputln("5 16")
            input.inputln("3 10")
            input.inputln("17 19")
            input.inputln("4 4")
            input.inputln("7 15")

            scoreSumQueries()

            val result = output.readLines()
            assertThat(
                result, equalTo(
                    listOf(
                        "175 430",
                        "0 85",
                        "0 65",
                        "51 16",
                        "116 246",
                        "67 154",
                        "0 165",
                        "0 111",
                        "213 184",
                        "32 156",
                        "175 340",
                        "32 54",
                        "299 511",
                        "132 336",
                        "67 244",
                        "175 314",
                        "51 181",
                        "124 90",
                        "0 17",
                        "120 186"
                    )
                )
            )
        }
    }

    @Nested
    class CPClasses {
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
        fun cpClasses_1() {
            input.inputln("4")
            input.inputln("4000 4400 5000 3200")
            input.inputln("3")
            input.inputln("3312")
            input.inputln("2992")
            input.inputln("4229")

            cpClasses()

            val result = output.readLines()
            assertThat(
                result, equalTo(
                    listOf(
                        "112",
                        "208",
                        "171"
                    )
                )
            )
        }

        @Test
        fun cpClasses_2() {
            input.inputln("1")
            input.inputln("4000")
            input.inputln("10")
            input.inputln("3582")
            input.inputln("3538")
            input.inputln("3320")
            input.inputln("3312")
            input.inputln("3296")
            input.inputln("3257")
            input.inputln("3111")
            input.inputln("3040")
            input.inputln("3013")
            input.inputln("2994")

            cpClasses()

            val result = output.readLines()
            assertThat(
                result, equalTo(
                    listOf(
                        "418",
                        "462",
                        "680",
                        "688",
                        "704",
                        "743",
                        "889",
                        "960",
                        "987",
                        "1006"
                    )
                )
            )
        }

        @Test
        fun cpClasses_3() {
            input.inputln("10")
            input.inputln("869120000 998244353 777777777 123456789 100100100 464646464 987654321 252525252 869120001 1000000000")
            input.inputln("10")
            input.inputln("4229")
            input.inputln("20210406")
            input.inputln("1")
            input.inputln("268435456")
            input.inputln("3582")
            input.inputln("536870912")
            input.inputln("1000000000")
            input.inputln("869120")
            input.inputln("99999999")
            input.inputln("869120001")

            cpClasses()

            val result = output.readLines()
            assertThat(
                result, equalTo(
                    listOf(
                        "100095871",
                        "79889694",
                        "100100099",
                        "15910204",
                        "100096518",
                        "72224448",
                        "0",
                        "99230980",
                        "100101",
                        "0"
                    )
                )
            )
        }

        @Test
        fun cpClasses_4() {
            input.inputln("100")
            input.inputln("298750376 229032640 602876667 944779015 909539868 533609371 231368330 445484152 408704870 850216874 349286798 30417810 807260002 554049450 40706045 380488344 749325840 801881841 459457853 66691229 5235900 8100458 46697277 997429858 827651689 790051948 981897272 271364774 536232393 997361572 449659237 602191750 294800444 346669663 792837293 277667068 997282249 468293808 444906878 702693341 894286137 845317003 27053625 926547765 739689211 447395911 902031510 326127348 582956343 842918193 235655766 844300842 438389323 406413067 862896425 464876303 68833418 76340212 911399808 745744264 551223563 854507876 196296968 52144186 431165823 275217640 424495332 847375861 337078801 83054466 648322745 694789156 301518763 319851750 432518459 772897937 630628124 581390864 313132255 350770227 642944345 677742851 448945480 688009163 160941957 290297295 5532462 823543277 19634445 15791361 193309093 66202596 72364149 743270896 297240520 264035189 898589962 59916738 307942952 403411309")
            input.inputln("30")
            input.inputln("930579110")
            input.inputln("22697034")
            input.inputln("44652533")
            input.inputln("280533771")
            input.inputln("753567118")
            input.inputln("684927419")
            input.inputln("923477579")
            input.inputln("557613803")
            input.inputln("779616458")
            input.inputln("389130756")
            input.inputln("323671659")
            input.inputln("3117850")
            input.inputln("408004003")
            input.inputln("224808850")
            input.inputln("18421958")
            input.inputln("359047808")
            input.inputln("364572866")
            input.inputln("334631363")
            input.inputln("854759331")
            input.inputln("647435074")
            input.inputln("826055423")
            input.inputln("668443532")
            input.inputln("620408208")
            input.inputln("32237184")
            input.inputln("67299071")
            input.inputln("251185742")
            input.inputln("217292659")
            input.inputln("16181227")
            input.inputln("850865411")
            input.inputln("218577687")

            cpClasses()

            val result = output.readLines()
            assertThat(
                result, equalTo(
                    listOf(
                        "4031345",
                        "3062589",
                        "2044744",
                        "2866703",
                        "4241278",
                        "3081744",
                        "3070186",
                        "3564353",
                        "6718521",
                        "8642412",
                        "2455689",
                        "2118050",
                        "700867",
                        "4223790",
                        "1212487",
                        "8277581",
                        "13802639",
                        "2447438",
                        "251455",
                        "887671",
                        "1596266",
                        "9299319",
                        "10219916",
                        "1819374",
                        "607842",
                        "12849447",
                        "11739981",
                        "389866",
                        "648537",
                        "10454953"
                    )
                )
            )
        }
    }

    @Nested
    class CrossSum {
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
        fun crossSum_a() {
            input.inputln("2 2")

            input.inputln("1 2")
            input.inputln("3 4")

            crossSum()

            val result = output.readLines()
            assertThat(
                result, equalTo(
                    listOf(
                        "6 7",
                        "8 9"
                    )
                )
            )
        }

        @Test
        fun crossSum_b() {
            input.inputln("2 3")

            input.inputln("1 2 3")
            input.inputln("4 5 6")

            crossSum()

            val result = output.readLines()
            assertThat(
                result, equalTo(
                    listOf(
                        "10 11 12",
                        "16 17 18"
                    )
                )
            )
        }

        @Test
        fun crossSum_1() {
            input.inputln("3 3")
            input.inputln("1 1 1")
            input.inputln("1 1 1")
            input.inputln("1 1 1")

            crossSum()

            val result = output.readLines()
            assertThat(
                result, equalTo(
                    listOf(
                        "5 5 5",
                        "5 5 5",
                        "5 5 5"
                    )
                )
            )
        }

        @Test
        fun crossSum_2() {
            input.inputln("4 4")
            input.inputln("3 1 4 1")
            input.inputln("5 9 2 6")
            input.inputln("5 3 5 8")
            input.inputln("9 7 9 3")

            crossSum()

            val result = output.readLines()
            assertThat(
                result, equalTo(
                    listOf(
                        "28 28 25 26",
                        "39 33 40 34",
                        "38 38 36 31",
                        "41 41 39 43"
                    )
                )
            )
        }

        @Test
        fun crossSum_3() {
            input.inputln("2 10")
            input.inputln("31 41 59 26 53 58 97 93 23 84")
            input.inputln("62 64 33 83 27 95 2 88 41 97")

            crossSum()

            val result = output.readLines()
            assertThat(
                result, equalTo(
                    listOf(
                        "627 629 598 648 592 660 567 653 606 662",
                        "623 633 651 618 645 650 689 685 615 676"
                    )
                )
            )
        }

        @Test
        fun crossSum_4() {
            input.inputln("10 10")
            input.inputln("83 86 77 65 93 85 86 92 99 71")
            input.inputln("62 77 90 59 63 76 90 76 72 86")
            input.inputln("61 68 67 79 82 80 62 73 67 85")
            input.inputln("79 52 72 58 69 67 93 56 61 92")
            input.inputln("79 73 71 69 84 87 98 74 65 70")
            input.inputln("63 76 91 80 56 73 62 70 96 81")
            input.inputln("55 75 84 77 86 55 96 79 63 57")
            input.inputln("74 95 82 95 64 67 84 64 93 50")
            input.inputln("87 58 76 78 88 84 53 51 54 99")
            input.inputln("82 60 76 68 89 62 76 86 94 89")

            crossSum()

            val result = output.readLines()
            assertThat(
                result, equalTo(
                    listOf(
                        "1479 1471 1546 1500 1518 1488 1551 1466 1502 1546",
                        "1414 1394 1447 1420 1462 1411 1461 1396 1443 1445",
                        "1388 1376 1443 1373 1416 1380 1462 1372 1421 1419",
                        "1345 1367 1413 1369 1404 1368 1406 1364 1402 1387",
                        "1416 1417 1485 1429 1460 1419 1472 1417 1469 1480",
                        "1410 1392 1443 1396 1466 1411 1486 1399 1416 1447",
                        "1397 1372 1429 1378 1415 1408 1431 1369 1428 1450",
                        "1419 1393 1472 1401 1478 1437 1484 1425 1439 1498",
                        "1366 1390 1438 1378 1414 1380 1475 1398 1438 1409",
                        "1425 1442 1492 1442 1467 1456 1506 1417 1452 1473"
                    )
                )
            )
        }
    }

    @Nested
    class EncyclopediaOfParentheses {
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
        fun encyclopediaOfParentheses_1() {
            input.inputln("2")

            encyclopediaOfParentheses()

            val result = output.readLines()
            assertThat(result, equalTo(listOf("()")))
        }

        @Test
        fun encyclopediaOfParentheses_2() {
            input.inputln("3")

            encyclopediaOfParentheses()

            val result = output.readLines()
            assertThat(result, equalTo(emptyList()))
        }

        @Test
        fun encyclopediaOfParentheses_3() {
            input.inputln("4")

            encyclopediaOfParentheses()

            val result = output.readLines()
            assertThat(result, equalTo(listOf("(())", "()()")))
        }

        @Test
        fun encyclopediaOfParentheses_6() {
            input.inputln("6")

            encyclopediaOfParentheses()

            val result = output.readLines()
            assertThat(
                result, equalTo(
                    listOf(
                        "((()))",
                        "(()())",
                        "(())()",
                        "()(())",
                        "()()()"
                    )
                )
            )
        }

        @Test
        fun encyclopediaOfParentheses_4() {
            input.inputln("10")

            encyclopediaOfParentheses()

            val result = output.readLines()
            assertThat(
                result,
                equalTo(
                    listOf(
                        "((((()))))",
                        "(((()())))",
                        "(((())()))",
                        "(((()))())",
                        "(((())))()",
                        "((()(())))",
                        "((()()()))",
                        "((()())())",
                        "((()()))()",
                        "((())(()))",
                        "((())()())",
                        "((())())()",
                        "((()))(())",
                        "((()))()()",
                        "(()((())))",
                        "(()(()()))",
                        "(()(())())",
                        "(()(()))()",
                        "(()()(()))",
                        "(()()()())",
                        "(()()())()",
                        "(()())(())",
                        "(()())()()",
                        "(())((()))",
                        "(())(()())",
                        "(())(())()",
                        "(())()(())",
                        "(())()()()",
                        "()(((())))",
                        "()((()()))",
                        "()((())())",
                        "()((()))()",
                        "()(()(()))",
                        "()(()()())",
                        "()(()())()",
                        "()(())(())",
                        "()(())()()",
                        "()()((()))",
                        "()()(()())",
                        "()()(())()",
                        "()()()(())",
                        "()()()()()"
                    )
                )
            )
        }
    }

    @Nested
    class YokanParty {
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
        fun yokanParty_1() {
            input.inputln("3 34")
            input.inputln("1")
            input.inputln("8 13 26")

            yokanParty()

            val result = output.readLines()
            assertThat(result, equalTo(listOf("13")))
        }

        @Test
        fun yokanParty_2() {
            input.inputln("7 45")
            input.inputln("2")
            input.inputln("7 11 16 20 28 34 38")

            yokanParty()

            val result = output.readLines()
            assertThat(result, equalTo(listOf("12")))
        }

        @Test
        fun yokanParty_3() {
            input.inputln("3 100")
            input.inputln("1")
            input.inputln("28 54 81")

            yokanParty()

            val result = output.readLines()
            assertThat(result, equalTo(listOf("46")))
        }

        @Test
        fun yokanParty_4() {
            input.inputln("3 100")
            input.inputln("2")
            input.inputln("28 54 81")

            yokanParty()

            val result = output.readLines()
            assertThat(result, equalTo(listOf("26")))
        }

        @Test
        fun yokanParty_5() {
            input.inputln("20 1000")
            input.inputln("4")
            input.inputln("51 69 102 127 233 295 350 388 417 466 469 523 553 587 720 739 801 855 926 954")

            yokanParty()

            val result = output.readLines()
            assertThat(result, equalTo(listOf("170")))
        }
    }
}