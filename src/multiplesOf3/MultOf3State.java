package multiplesOf3;

import java.util.HashMap;
import java.util.Map;

public enum MultOf3State implements State {
    ZEROMOD3,
    ONEMOD3,
    TWOMOD3;

    private static Map<String, Integer> inputToIntegerMap = new HashMap<>();
    private MultOf3State state;
    private Integer currentSum;

    static {
        inputToIntegerMap.put("00", 0);
        inputToIntegerMap.put("01", 1);
        inputToIntegerMap.put("10", 2);
        inputToIntegerMap.put("11", 3);
    }

    MultOf3State() {
        currentSum = 0;
    }

    public MultOf3State getState() {
        return state == null ? MultOf3State.ZEROMOD3 : state;
    }

    @Override
    public Integer computeY(String _input) {
        Integer inputValue = inputToIntegerMap.get(_input);

        if (state == null) {
            state = MultOf3State.ZEROMOD3;
        }

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
