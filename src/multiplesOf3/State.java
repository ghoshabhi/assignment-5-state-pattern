package multiplesOf3;

/**
 * The "State" interface which represents the state of the FSM
 * at any given instance
 */
public interface State {
    /**
     * The function which is expected to be implemented by
     * each of the interface's implementation. This function
     * calculates the next state of the FSM based on the current
     * input
     * @param input : String: the input to the FSM
     * @return  Returns the integer representing the output based on the
     *          the FSM's working
     */
    Integer computeY(String input);
}
