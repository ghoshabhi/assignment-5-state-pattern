package multiplesOf3;

import java.util.Map;

/**
 * Concrete state implementation of the "State" interface
 * Represents the "1 mod 3" state of the FSM
 */
public class OneMod3 implements State {
    private MultiplesOf3 wrapper;

    /**
     * Constructor
     * @param wrapper Provides and interface to client to perform some action and
     *                delegates state specific requests to the interface's concrete
     *                subclass that defines the current state.
     */
    OneMod3(MultiplesOf3 wrapper) {
        this.wrapper = wrapper;
    }

    /**
     * The function declared by the interface to compute the "Y"
     * output of the FSM
     * @param input : String: the input to the FSM
     * @return The "Y" output of the FSM
     */
    @Override
    public Integer computeY(String input) {
        Map<String, Integer> map = wrapper.getStringIntegerHashMap();
        Integer intInput = map.get(input);
        if(intInput != null) {
            Integer currentSum = wrapper.getCurrentSum();
            currentSum += intInput;
            wrapper.setCurrentSum(currentSum);
            Integer mod = currentSum % 3;
            if (mod == 0) {
                wrapper.setState(wrapper.getZeroMod3());
            } else if (mod == 1) {
                // do nothing, we are in correct state
            } else if (mod == 2) {
                wrapper.setState(wrapper.getTwoMod3());
            }
            return mod == 0 ? 1 : 0;
        }
        return null;
    }
}
