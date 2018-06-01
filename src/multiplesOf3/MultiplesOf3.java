package multiplesOf3;

import java.util.HashMap;
import java.util.Map;

public class MultiplesOf3 {
    private MultOf3State state;
//    private Integer currentSum;
//    private Map<String, Integer> inputToIntegerMap = new HashMap<>();

    public MultiplesOf3() {
        state = MultOf3State.ONEMOD3;
//        currentSum = 0;
//        inputToIntegerMap.put("00", 0);
//        inputToIntegerMap.put("01", 1);
//        inputToIntegerMap.put("10", 2);
//        inputToIntegerMap.put("11", 3);
    }

    public Integer computeY(String _input) {
//        Integer inputValue = inputToIntegerMap.get(_input);
//        Integer sum = currentSum += inputValue;
//        this.setCurrentSum(sum);
//        Integer mod = currentSum % 3;
//        state.changeState(this);
        Integer yOutput = state.changeState(_input);
        this.state = state.getState();
        return yOutput;
//        return mod == 0 ? 1 : 0;
    }

    public void setState(MultOf3State newState) {
        state = newState;
    }

    public MultOf3State getState() {
        return state.getState();
    }

//    public Integer getCurrentSum() {
//        return currentSum;
//    }
//
//    public void setCurrentSum(Integer currentSum) {
//        this.currentSum = currentSum;
//    }
}
