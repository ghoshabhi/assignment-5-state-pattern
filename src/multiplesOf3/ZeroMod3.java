package multiplesOf3;

import java.util.Map;

public class ZeroMod3 implements State {
    @Override
    public Integer computeY(String input, MultiplesOf3 wrapper) {
        Map<String, Integer> map = wrapper.getStringIntegerHashMap();
        Integer intInput = map.get(input);
        if(intInput != null) {
            Integer currentSum = wrapper.getCurrentSum();
            currentSum += intInput;
            wrapper.setCurrentSum(currentSum);
            Integer mod = currentSum % 3;
            if (mod == 0) {
                // do nothing, we are in correct state
            } else if (mod == 1) {
                wrapper.setState(new OneMod3());
            } else if (mod == 2) {
                wrapper.setState(new TwoMod3());
            }
            return mod == 0 ? 1 : 0;
        }
        return null;
    }
}
