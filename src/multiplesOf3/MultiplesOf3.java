package multiplesOf3;

import java.util.HashMap;
import java.util.Map;

public class MultiplesOf3 {
    private MultOf3State state;
    private Integer currentSum;
    private Map<String, Integer> inputToIntegerMap = new HashMap<>();

    public MultiplesOf3() {
//        state = MultOf3State.ZEROMOD3;
        currentSum = 0;
        inputToIntegerMap.put("00", 0);
        inputToIntegerMap.put("01", 1);
        inputToIntegerMap.put("10", 2);
        inputToIntegerMap.put("11", 3);
    }

    public Integer computeY(String _input) {
        Integer inputValue = inputToIntegerMap.get(_input);
        Integer sum = currentSum += inputValue;
        System.out.println("sum = " + sum);
        this.setCurrentSum(sum);
        Integer mod = currentSum % 3;
//        if(mod == 0) {
//            setState(MultOf3State.ZEROMOD3);
//        } else if (mod == 1) {
//            setState(MultOf3State.ONEMOD3);
//        } else if (mod == 2) {
//            setState(MultOf3State.TWOMOD3);
//        }
        state.changeState(this);
        return mod == 0 ? 1 : 0;
    }

    public Integer getCurrentSum() {
        return currentSum;
    }

    public void setCurrentSum(Integer currentSum) {
        this.currentSum = currentSum;
    }

    public void setState(MultOf3State newState) {
        state = newState;
    }

    public MultOf3State getState() {
        return state;
    }
}
