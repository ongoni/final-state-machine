package finalstatemachine

class FinalStateMachine(initState: State,
                        private var startStates: MutableList<State>,
                        private var finalStates: MutableList<State>,
                        private var operations: MutableMap<State, MutableMap<Char, State>>
) {

    private var currentState: State = initState

    init {
        if (!startStates.any { x -> x.name == initState.name }) {
            throw Exception("Invalid initial state")
        }

        currentState = initState
    }

    private fun setCurrentState(newState: State) {
        if (!startStates.any { x -> x.name == newState.name }) {
            throw Exception("Invalid start state given")
        }

        currentState = newState
    }

    private fun getCurrentState() = currentState

    fun handle(symbol: Char) {
        currentState = operations[currentState]!![symbol] ?: throw Exception("Invalid symbol")
    }

    fun maxString(command: String, startIndex: Int) : Pair<Int, Boolean> {
        var count = 0
        var finalStateReached = false

        command.substring(startIndex).forEachIndexed { index, symbol ->
            handle(symbol)

            if (finalStates.any { x -> x.name == currentState.name }) {
                finalStateReached = true
                count = index + 1
            }
        }

        return Pair(count, finalStateReached)
    }

}