import finalstatemachine.FinalStateMachineExamples

class App {

    companion object {
        @JvmStatic
        fun main(args: Array<String>) {
            val firstExample = FinalStateMachineExamples.getFirstExample()
            println(firstExample.maxString("abaaaacb", 1))

            val secondExample = FinalStateMachineExamples.getSecondExample()
            println(secondExample.maxString("defabcdefab", 0))
        }
    }

}