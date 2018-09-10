package finalstatemachine

class FinalStateMachine(initStates: MutableSet<State>,
                        private var startStates: MutableSet<State>,
                        private var finalStates: MutableSet<State>,
                        private var operations: MutableMap<State, MutableMap<Char, MutableSet<State>>>
) {

    private var currentStates: MutableSet<State>

    init {
        if (!startStates.all { x -> startStates.contains(x) }) {
            throw Exception("Invalid initial state")
        }

        currentStates = initStates
    }

    private fun setCurrentStates(newStates: MutableSet<State>) {
//        if (!startStates.any { x -> x.name == newState.name }) {
//            throw Exception("Invalid start state given")
//        }

        currentStates = newStates
    }

    private fun getCurrentStates() = currentStates

    fun handle(symbol: Char) {
        val newStates = mutableSetOf<State>()

        currentStates.map { x -> operations[x]!![symbol] ?: throw Exception("Invalid symbol") }
                .forEach { newStates.addAll(it) }

        setCurrentStates(newStates)
    }

    fun maxString(command: String, startIndex: Int) : Pair<Int, Boolean> {
        var count = 0
        var finalStateReached = false

        command.substring(startIndex).forEachIndexed { index, symbol ->
            handle(symbol)

            if (finalStates.all { x -> currentStates.contains(x) }) {
                finalStateReached = true
                count = index + 1
            }
        }

        this.currentStates = startStates

        return Pair(count, finalStateReached)
    }

}