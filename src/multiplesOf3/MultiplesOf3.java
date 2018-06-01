package multiplesOf3;

import java.util.HashMap;
import java.util.Map;

public class MultiplesOf3 {
    private State state;
    private Integer currentSum;
    private Map<String, Integer> stringIntegerHashMap = new HashMap<>();

    public MultiplesOf3() {
        state = new ZeroMod3();
        currentSum = 0;
        stringIntegerHashMap.put("00", 0);
        stringIntegerHashMap.put("01", 1);
        stringIntegerHashMap.put("10", 2);
        stringIntegerHashMap.put("11", 3);
    }

    public Integer computeY(String input) {
        return state.changeState(input, this);
    }

    public State getState() {
        return state;
    }

    public void setState(State state) {
        this.state = state;
    }

    public Integer getCurrentSum() {
        return currentSum;
    }

    public void setCurrentSum(Integer currentSum) {
        this.currentSum = currentSum;
    }

    public Map<String, Integer> getStringIntegerHashMap() {
        return stringIntegerHashMap;
    }
}
