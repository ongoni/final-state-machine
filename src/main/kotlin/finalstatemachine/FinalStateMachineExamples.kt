package finalstatemachine

object FinalStateMachineExamples {

    @JvmStatic
    fun getFirstExample()  = FinalStateMachine(
            State("00"),
            mutableListOf(
                    State("00")
            ),
            mutableListOf(
                    State("11")
            ),
            mutableMapOf(
                    State("00") to mutableMapOf(
                            'a' to State("10"),
                            'b' to State("01"),
                            'c' to State("00"),
                            'd' to State("00")
                    ),
                    State("01") to mutableMapOf(
                            'a' to State("11"),
                            'b' to State("01"),
                            'c' to State("01"),
                            'd' to State("00")
                    ),
                    State("10") to mutableMapOf(
                            'a' to State("10"),
                            'b' to State("11"),
                            'c' to State("00"),
                            'd' to State("10")
                    ),
                    State("11") to mutableMapOf(
                            'a' to State("11"),
                            'b' to State("11"),
                            'c' to State("01"),
                            'd' to State("10")
                    )
            )
    )

    @JvmStatic
    fun getSecondExample()  = FinalStateMachine(
            State("000"),
            mutableListOf(
                    State("000")
            ),
            mutableListOf(
                    State("111")
            ),
            mutableMapOf(
                    State("000") to mutableMapOf(
                            'a' to State("100"),
                            'b' to State("010"),
                            'c' to State("001"),
                            'd' to State("000"),
                            'e' to State("000"),
                            'f' to State("000")
                    ),
                    State("001") to mutableMapOf(
                            'a' to State("101"),
                            'b' to State("011"),
                            'c' to State("001"),
                            'd' to State("001"),
                            'e' to State("001"),
                            'f' to State("000")
                    ),
                    State("010") to mutableMapOf(
                            'a' to State("110"),
                            'b' to State("010"),
                            'c' to State("011"),
                            'd' to State("010"),
                            'e' to State("000"),
                            'f' to State("010")
                    ),
                    State("100") to mutableMapOf(
                            'a' to State("100"),
                            'b' to State("110"),
                            'c' to State("101"),
                            'd' to State("000"),
                            'e' to State("100"),
                            'f' to State("100")
                    ),
                    State("110") to mutableMapOf(
                            'a' to State("110"),
                            'b' to State("110"),
                            'c' to State("111"),
                            'd' to State("010"),
                            'e' to State("100"),
                            'f' to State("110")
                    ),
                    State("101") to mutableMapOf(
                            'a' to State("101"),
                            'b' to State("111"),
                            'c' to State("101"),
                            'd' to State("001"),
                            'e' to State("101"),
                            'f' to State("100")
                    ),
                    State("011") to mutableMapOf(
                            'a' to State("111"),
                            'b' to State("011"),
                            'c' to State("011"),
                            'd' to State("011"),
                            'e' to State("001"),
                            'f' to State("010")
                    ),
                    State("111") to mutableMapOf(
                            'a' to State("111"),
                            'b' to State("111"),
                            'c' to State("111"),
                            'd' to State("011"),
                            'e' to State("101"),
                            'f' to State("110")
                    )
            )
    )

}