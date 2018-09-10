package finalstatemachine

object FinalStateMachineExamples {

    @JvmStatic
    fun getFirstExample()  = FinalStateMachine(
            mutableSetOf(State("00")),
            mutableSetOf(
                    State("00")
            ),
            mutableSetOf(
                    State("11")
            ),
            mutableMapOf(
                    State("00") to mutableMapOf(
                            'a' to mutableSetOf(State("10")),
                            'b' to mutableSetOf(State("01")),
                            'c' to mutableSetOf(State("00")),
                            'd' to mutableSetOf(State("00"))
                    ),
                    State("01") to mutableMapOf(
                            'a' to mutableSetOf(State("11")),
                            'b' to mutableSetOf(State("01")),
                            'c' to mutableSetOf(State("01")),
                            'd' to mutableSetOf(State("00"))
                    ),
                    State("10") to mutableMapOf(
                            'a' to mutableSetOf(State("10")),
                            'b' to mutableSetOf(State("11")),
                            'c' to mutableSetOf(State("00")),
                            'd' to mutableSetOf(State("10"))
                    ),
                    State("11") to mutableMapOf(
                            'a' to mutableSetOf(State("11")),
                            'b' to mutableSetOf(State("11")),
                            'c' to mutableSetOf(State("01")),
                            'd' to mutableSetOf(State("10"))
                    )
            )
    )

    @JvmStatic
    fun getSecondExample()  = FinalStateMachine(
            mutableSetOf(State("000")),
            mutableSetOf(
                    State("000")
            ),
            mutableSetOf(
                    State("111")
            ),
            mutableMapOf(
                    State("000") to mutableMapOf(
                            'a' to mutableSetOf(State("100")),
                            'b' to mutableSetOf(State("010")),
                            'c' to mutableSetOf(State("001")),
                            'd' to mutableSetOf(State("000")),
                            'e' to mutableSetOf(State("000")),
                            'f' to mutableSetOf(State("000"))
                    ),
                    State("001") to mutableMapOf(
                            'a' to mutableSetOf(State("101")),
                            'b' to mutableSetOf(State("011")),
                            'c' to mutableSetOf(State("001")),
                            'd' to mutableSetOf(State("001")),
                            'e' to mutableSetOf(State("001")),
                            'f' to mutableSetOf(State("000"))
                    ),
                    State("010") to mutableMapOf(
                            'a' to mutableSetOf(State("110")),
                            'b' to mutableSetOf(State("010")),
                            'c' to mutableSetOf(State("011")),
                            'd' to mutableSetOf(State("010")),
                            'e' to mutableSetOf(State("000")),
                            'f' to mutableSetOf(State("010"))
                    ),
                    State("100") to mutableMapOf(
                            'a' to mutableSetOf(State("100")),
                            'b' to mutableSetOf(State("110")),
                            'c' to mutableSetOf(State("101")),
                            'd' to mutableSetOf(State("000")),
                            'e' to mutableSetOf(State("100")),
                            'f' to mutableSetOf(State("100"))
                    ),
                    State("110") to mutableMapOf(
                            'a' to mutableSetOf(State("110")),
                            'b' to mutableSetOf(State("110")),
                            'c' to mutableSetOf(State("111")),
                            'd' to mutableSetOf(State("010")),
                            'e' to mutableSetOf(State("100")),
                            'f' to mutableSetOf(State("110"))
                    ),
                    State("101") to mutableMapOf(
                            'a' to mutableSetOf(State("101")),
                            'b' to mutableSetOf(State("111")),
                            'c' to mutableSetOf(State("101")),
                            'd' to mutableSetOf(State("001")),
                            'e' to mutableSetOf(State("101")),
                            'f' to mutableSetOf(State("100"))
                    ),
                    State("011") to mutableMapOf(
                            'a' to mutableSetOf(State("111")),
                            'b' to mutableSetOf(State("011")),
                            'c' to mutableSetOf(State("011")),
                            'd' to mutableSetOf(State("011")),
                            'e' to mutableSetOf(State("001")),
                            'f' to mutableSetOf(State("010"))
                    ),
                    State("111") to mutableMapOf(
                            'a' to mutableSetOf(State("111")),
                            'b' to mutableSetOf(State("111")),
                            'c' to mutableSetOf(State("111")),
                            'd' to mutableSetOf(State("011")),
                            'e' to mutableSetOf(State("101")),
                            'f' to mutableSetOf(State("110"))
                    )
            )
    )

    @JvmStatic
    fun getThirdExample() = FinalStateMachine(
            mutableSetOf(State("1"), State("7")),
            mutableSetOf(
                    State("1"), State("7")
            ),
            mutableSetOf(
                    State("3"), State("9")
            ),
            mutableMapOf(
                    State("1") to mutableMapOf(
                            'a' to mutableSetOf(State("2")),
                            'b' to mutableSetOf(State("4"))
                    ),
                    State("2") to mutableMapOf(
                            'a' to mutableSetOf(State("1"), State("3")),
                            'b' to mutableSetOf(State("5"))
                    ),
                    State("3") to mutableMapOf(
                            'a' to mutableSetOf(State("2")),
                            'b' to mutableSetOf(State("6"))
                    ),
                    State("4") to mutableMapOf(
                            'a' to mutableSetOf(State("5")),
                            'b' to mutableSetOf(State("1"), State("7"))
                    ),
                    State("5") to mutableMapOf(
                            'a' to mutableSetOf(State("4"), State("6")),
                            'b' to mutableSetOf(State("2"), State("8"))
                    ),
                    State("6") to mutableMapOf(
                            'a' to mutableSetOf(State("5")),
                            'b' to mutableSetOf(State("3"), State("9"))
                    ),
                    State("7") to mutableMapOf(
                            'a' to mutableSetOf(State("8")),
                            'b' to mutableSetOf(State("4"))
                    ),
                    State("8") to mutableMapOf(
                            'a' to mutableSetOf(State("7"), State("9")),
                            'b' to mutableSetOf(State("5"))
                    ),
                    State("9") to mutableMapOf(
                            'a' to mutableSetOf(State("8")),
                            'b' to mutableSetOf(State("6"))
                    )
            )
    )


}