import finalstatemachine.FinalStateMachineExamples

class App {

    companion object {
        @JvmStatic
        fun main(args: Array<String>) {
            val firstExample = FinalStateMachineExamples.getFirstExample()
            println(firstExample.maxString("abaaaacb", 1))

            val secondExample = FinalStateMachineExamples.getSecondExample()
            println(secondExample.maxString("defabcdefabc", 0))

            val thirdExample = FinalStateMachineExamples.getThirdExample()
            println(thirdExample.maxString("ababa", 1))
            println(thirdExample.maxString("abaa", 1))
        }
    }

}