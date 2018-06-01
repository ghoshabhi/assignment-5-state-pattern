package multiplesOf3;

import java.util.HashMap;
import java.util.Map;

public enum MultOf3State implements State {
    ZEROMOD3,
    ONEMOD3,
    TWOMOD3;

    private static Map<String, Integer> inputToIntegerMap = new HashMap<>();
    private Integer currentSum;
    private MultOf3State state;

    static {
        inputToIntegerMap.put("00", 0);
        inputToIntegerMap.put("01", 1);
        inputToIntegerMap.put("10", 2);
        inputToIntegerMap.put("11", 3);
    }

    MultOf3State() {
        this.currentSum = 0;
    }

    public MultOf3State getState() {
        return this.state;
    }

    @Override
    public Integer changeState(String input) {
        Integer inputValue = inputToIntegerMap.get(input);
        currentSum = currentSum + inputValue;
        Integer mod = currentSum % 3;
        if(mod == 0) {
            state = MultOf3State.ZEROMOD3;
        } else if (mod == 1) {
            state = MultOf3State.ONEMOD3;
        } else if (mod == 2) {
            state = MultOf3State.TWOMOD3;
        }
        return mod == 0 ? 1 : 0;
    }
}
