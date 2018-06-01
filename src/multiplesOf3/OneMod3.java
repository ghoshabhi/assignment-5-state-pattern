package multiplesOf3;

import java.util.Map;

public class OneMod3 implements State {
    @Override
    public Integer changeState(String input, MultiplesOf3 wrapper) {
        Map<String, Integer> map = wrapper.getStringIntegerHashMap();
        Integer intInput = map.get(input);
        if(intInput != null) {
            Integer currentSum = wrapper.getCurrentSum();
            currentSum += intInput;
            wrapper.setCurrentSum(currentSum);
            Integer mod = currentSum % 3;
            if (mod == 0) {
                wrapper.setState(new ZeroMod3());
            } else if (mod == 1) {
                // do nothing, we are in correct state
            } else if (mod == 2) {
                wrapper.setState(new TwoMod3());
            }
            return mod == 0 ? 1 : 0;
        }
        return null;
    }
}
